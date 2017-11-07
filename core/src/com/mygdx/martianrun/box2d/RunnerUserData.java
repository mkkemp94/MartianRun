package com.mygdx.martianrun.box2d;

import com.badlogic.gdx.math.Vector2;
import com.mygdx.martianrun.enums.UserDataType;
import com.mygdx.martianrun.utils.Constants;

/**
 * Created by mkemp on 11/7/17.
 */

public class RunnerUserData extends UserData {

    private Vector2 jumpingLinearImpulse;

    public RunnerUserData() {
        super();
        jumpingLinearImpulse = Constants.RUNNER_JUMPING_LINEAR_IMPULSE;
        userDataType = UserDataType.RUNNER;
    }

    public Vector2 getJumpingLinearImpulse() {
        return jumpingLinearImpulse;
    }

    public void setJumpingLinearImpulse(Vector2 jumpingLinearImpulse) {
        this.jumpingLinearImpulse = jumpingLinearImpulse;
    }
}
