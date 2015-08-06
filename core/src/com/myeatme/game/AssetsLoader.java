package com.myeatme.game;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Senheizer on 27.07.2015.
 */
public class AssetsLoader {
    public static Texture bg,smile,smileGreen;

    public static void load() {
        bg = new Texture("back.png");
        smile = new Texture("sm2.png");
        smileGreen = new Texture(("sm3.png"));

    }

    public static void dispose() {
        smile.dispose();
        bg.dispose();
    }
}
