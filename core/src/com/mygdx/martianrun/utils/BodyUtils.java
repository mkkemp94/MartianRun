package com.mygdx.martianrun.utils;

import com.badlogic.gdx.physics.box2d.Body;
import com.mygdx.martianrun.box2d.UserData;
import com.mygdx.martianrun.enums.UserDataType;

/**
 * Created by mkemp on 11/7/17.
 */

public class BodyUtils {

    public static boolean bodyIsRunner(Body body) {
        UserData userData = (UserData) body.getUserData();

        return userData != null && userData.getUserDataType() == UserDataType.RUNNER;
    }

    public static boolean bodyIsGround(Body body) {
        UserData userData = (UserData) body.getUserData();

        return userData != null && userData.getUserDataType() == UserDataType.GROUND;
    }
}
