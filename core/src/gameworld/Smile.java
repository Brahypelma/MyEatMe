package gameworld;


import com.badlogic.gdx.math.Vector2;


import com.badlogic.gdx.math.Rectangle;
import java.util.Random;

/**
 * Created by Senheizer on 26.07.2015.
 */
public class Smile {

    private Vector2 speed;

    private int size;
    int lastPositionX;
    int lastPositionY;



private Rectangle rect;


    Random random = new Random();


    public Smile (float x,float y , int weight, int height) {
        rect = new Rectangle(x,y,weight,height);

        this.rect.height = height;
        this.rect.width = weight;
        this.rect.x = x;
        this.rect.y = y;







    }
    public void update(float delta) {
        if (lastPositionX == 0 && lastPositionY == 0) {
            setMyCordinats();
        }
        if (rect.x > lastPositionX) {

            rect.x--;
        } else if (rect.y > lastPositionY) {

            rect.y--;
        } else if (rect.x < lastPositionX) {

            rect.x++;
        } else if (rect.y < lastPositionY) {

            rect.y++;
        } else setMyCordinats();


    }









    private void setMyCordinats() {
         lastPositionX = random.nextInt(800 - (int)rect.width);
        lastPositionY = random.nextInt(480 - (int)rect.height);

    }
    public Rectangle getRect() {
        return rect;
    }

}

