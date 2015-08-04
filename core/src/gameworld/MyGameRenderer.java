package gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.myeatme.game.AssetsLoader;

import java.util.ArrayList;

/**
 * Created by Senheizer on 26.07.2015.
 */
public class MyGameRenderer {


    private MyGameWorld myWorld;
    private OrthographicCamera cam;
    private SpriteBatch batch;

    public MyGameRenderer(MyGameWorld world) {
        myWorld = world;
        cam = new OrthographicCamera();
        cam.setToOrtho(true,800,480);
       batch = new SpriteBatch();
        batch.setProjectionMatrix(cam.combined);

    }

    public void render() {
        ArrayList<Smile> mySmile = myWorld.getSmiles();

        Gdx.app.log("MyGameRanderer", "render");
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        batch.draw(AssetsLoader.bg, 0, 0, 800, 480);
        for(int i =0; i <mySmile.size();i++) {

            batch.draw(AssetsLoader.smile, mySmile.get(i).getX(), mySmile.get(i).getY(), mySmile.get(i).getWeight(), mySmile.get(i).getHeight());
        }
        batch.end();






    }
}
