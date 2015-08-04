package com.myeatme.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import gameworld.MyGameRenderer;
import gameworld.MyGameWorld;

/**
 * Created by Senheizer on 26.07.2015.
 */
public class MyGameScreen implements Screen {
    private MyGameRenderer renderer;
    private MyGameWorld world;


    public MyGameScreen() {
        Gdx.app.log("MyGameScreen","Attached");
        world = new MyGameWorld();
        renderer = new MyGameRenderer(world);

    }
    @Override
    public void show() {
        Gdx.app.log("MyGameScreen","show called");

    }

    @Override
    public void render(float delta) {

        world.update(delta);
        renderer.render();


    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("MyGameScreen","resizing");

    }

    @Override
    public void pause() {
        Gdx.app.log("MyGameScreen","pause called");

    }

    @Override
    public void resume() {
        Gdx.app.log("MyGameScreen","resumed");


    }

    @Override
    public void hide() {
        Gdx.app.log("MyGameScreen","hide");

    }

    @Override
    public void dispose() {



    }
}
