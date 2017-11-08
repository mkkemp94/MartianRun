package com.mygdx.martianrun.box2d;

import com.badlogic.gdx.math.Vector2;
import com.mygdx.martianrun.enums.UserDataType;
import com.mygdx.martianrun.utils.Constants;

/**
 * Created by mkemp on 11/7/17.
 */

public class EnemyUserData extends UserData {

    private Vector2 linearVelocity;
    private String[] textureRegions;

    public EnemyUserData(float width, float height, String[] textureRegions) {
        super(width, height);
        userDataType = UserDataType.ENEMY;
        linearVelocity = Constants.ENEMY_LINEAR_VELOCITY;
        this.textureRegions = textureRegions;
    }

    public Vector2 getLinearVelocity() {
        return linearVelocity;
    }

    public void setLinearVelocity(Vector2 linearVelocity) {
        this.linearVelocity = linearVelocity;
    }

    public String[] getTextureRegions() {
        return textureRegions;
    }
}
