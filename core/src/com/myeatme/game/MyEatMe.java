package com.myeatme.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

import com.myeatme.screen.MyGameScreen;

public class MyEatMe extends Game {

	@Override
	public void create() {
		Gdx.app.log("MeEatMe", "Created");
		AssetsLoader.load();
		setScreen(new MyGameScreen());

	}
	public void dispose() {
		super.dispose();
		AssetsLoader.dispose();
	}
}


