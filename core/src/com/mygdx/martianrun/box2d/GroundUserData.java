package com.mygdx.martianrun.box2d;

import com.mygdx.martianrun.enums.UserDataType;

/**
 * Created by mkemp on 11/7/17.
 */

public class GroundUserData extends UserData {

    public GroundUserData() {
        super();
        userDataType = UserDataType.GROUND;
    }
}
