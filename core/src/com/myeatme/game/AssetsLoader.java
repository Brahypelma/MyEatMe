package com.myeatme.game;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Senheizer on 27.07.2015.
 */
public class AssetsLoader {
    public static Texture bg,smile;

    public static void load() {
        bg = new Texture("back.png");
        smile = new Texture("sm2.png");
        smile.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);
    }

    public static void dispose() {
        smile.dispose();
        bg.dispose();
    }
}
