package com.mygdx.martianrun.box2d;

import com.mygdx.martianrun.enums.UserDataType;

/**
 * Created by mkemp on 11/7/17.
 */

public abstract class UserData {

    protected UserDataType userDataType;

    public UserData() {

    }

    public UserDataType getUserDataType() {
        return userDataType;
    }
}
