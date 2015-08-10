package com.myeatme.game;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Senheizer on 27.07.2015.
 */
public class AssetsLoader {
    public static Texture bg,redSmile,greenSmile,yellowSmile;

    public static void load() {
        bg = new Texture("back.png");
        redSmile = new Texture("sm2.png");
         greenSmile = new Texture("sm3.png");
        yellowSmile = new Texture("sm1.png");


    }

    public static void dispose() {
        greenSmile.dispose();
        redSmile.dispose();
        yellowSmile.dispose();

        bg.dispose();
    }
}
