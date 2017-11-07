package com.mygdx.martianrun.stages;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.martianrun.actors.Ground;
import com.mygdx.martianrun.actors.Runner;
import com.mygdx.martianrun.utils.WorldUtils;

/**
 * Created by mkemp on 11/7/17.
 */

public class GameStage extends Stage {

    // These will be our viewport measurements wile working with the debug renderer.
    private static final int VIEWPORT_WIDTH = 20;
    private static final int VIEWPORT_HEIGHT = 13;

    private World world;
    private Ground ground;
    private Runner runner;

    private final float TIME_STEP = 1 / 300f;
    private float accumulator = 0f;

    private OrthographicCamera camera;
    private Box2DDebugRenderer renderer;

    public GameStage() {
        setupWorld();
        setupCamera();
        renderer = new Box2DDebugRenderer();
    }

    private void setupWorld() {
        world = WorldUtils.createWorld();
        setupGround();
        setupRunner();
    }

    private void setupGround() {
        ground = new Ground(WorldUtils.createGround(world));
        addActor(ground);
    }

    private void setupRunner() {
        runner = new Runner(WorldUtils.createRunner(world));
        addActor(runner);
    }

    private void setupCamera() {
        camera = new OrthographicCamera(VIEWPORT_WIDTH, VIEWPORT_HEIGHT);
        camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0f);
        camera.update();
    }

    @Override
    public void act(float delta) {
        super.act(delta);

        // Fixed timestep
        accumulator += delta;

        while (accumulator >= delta) {
            world.step(TIME_STEP, 6, 2);
            accumulator -= TIME_STEP;
        }

        // TODO: Implement interpolation
    }

    @Override
    public void draw() {
        super.draw();
        renderer.render(world, camera.combined);
    }
}
