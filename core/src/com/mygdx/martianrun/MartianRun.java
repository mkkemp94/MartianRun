package com.mygdx.martianrun;

import com.badlogic.gdx.Game;
import com.mygdx.martianrun.screens.GameScreen;

public class MartianRun extends Game {

	@Override
	public void create () {
		setScreen(new GameScreen());
	}

	// Get rid of the render function. Let the parent class handle it.
}
