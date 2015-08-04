package com.myeatme.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.myeatme.game.MyEatMe;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "EatMe";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new MyEatMe(), config);
	}
}
