package com.mygdx.martianrun.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by mkemp on 11/7/17.
 */

public abstract class GameActor extends Actor {

    protected Body body;

    public GameActor(Body body) {
        this.body = body;
    }
}
