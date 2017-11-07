package com.mygdx.martianrun.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.mygdx.martianrun.box2d.RunnerUserData;

/**
 * Created by mkemp on 11/7/17.
 */

public class Runner extends GameActor {

    private boolean dodging;
    private boolean jumping;

    public Runner(Body body) {
        super(body);
    }

    @Override
    public RunnerUserData getUserData() {
        return (RunnerUserData) userData;
    }

    public void jump() {
        if (!(jumping || dodging)) {
            body.applyLinearImpulse(
                    getUserData().getJumpingLinearImpulse(),
                    body.getWorldCenter(), true
            );
            jumping = true;
        }
    }

    public void landed() {
        jumping = false;
    }

    public void dodge() {
        if (!jumping) {
            body.setTransform(
                    getUserData().getDodgePosition(),
                    getUserData().getDodgeAngle()
            );
            dodging = true;
        }
    }

    public void stopDodge() {
        dodging = false;
        body.setTransform(getUserData().getRunningPosition(), 0f);
    }

    public boolean isDodging() {
        return dodging;
    }
}
