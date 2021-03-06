package gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;



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
        cam.setToOrtho(false,800,480);
       batch = new SpriteBatch();

        batch.setProjectionMatrix(cam.combined);


    }

    public void render() {

        ArrayList<Smile> mySmile = myWorld.getSmiles();


        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();




        batch.draw(AssetsLoader.bg, 0, 0, 800, 480);
        for (int i = 0; i < mySmile.size(); i++) {


            if(mySmile.get(i).getColor()==0) {
                batch.draw(AssetsLoader.greenSmile, mySmile.get(i).getRect().x, mySmile.get(i).getRect().y, mySmile.get(i).getRect().width, mySmile.get(i).getRect().height);



            } else if (mySmile.get(i).getColor() == 1) {
                batch.draw(AssetsLoader.redSmile, mySmile.get(i).getRect().x, mySmile.get(i).getRect().y, mySmile.get(i).getRect().width, mySmile.get(i).getRect().height);


            } else if (mySmile.get(i).getColor() == 2) {
                batch.draw(AssetsLoader.yellowSmile, mySmile.get(i).getRect().x, mySmile.get(i).getRect().y, mySmile.get(i).getRect().width, mySmile.get(i).getRect().height);


            }






        }
        batch.end();








    }
}
