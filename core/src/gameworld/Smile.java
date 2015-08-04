package gameworld;


import com.badlogic.gdx.math.Vector2;


import java.util.Random;

/**
 * Created by Senheizer on 26.07.2015.
 */
public class Smile {
    private Vector2 position;
    private Vector2 speed;
    private int weight;
    private int height;
    private int size;
    private Vector2 lastPosition;





    Random random = new Random();


    public Smile (float x,float y , int weight, int height) {

        this.height = height;
        this.weight = weight;

       position = new Vector2(x,y);
        lastPosition = new Vector2(x,y);


    }
    public void update(float delta) {
        if(lastPosition==null) {
            setMyCordinats();
        }
        if(position.x > lastPosition.x) {
            position.x--;
        }
        else if(position.y > lastPosition.y) {
            position.y--;
        }else if (position.x < lastPosition.x) {
            position.x++;
        }else if (position.y <lastPosition.y ) {
            position.y++;
        }else setMyCordinats();





    }

    public float getX() {
        return position.x;

    }
    public float getY() {
        return position.y;
    }
    public int getWeight() {
        return weight;
    }
    public int getHeight() {
        return height;
    }

    private void setMyCordinats() {
        lastPosition.x = random.nextInt(800 - weight);
        lastPosition.y = random.nextInt(480 - height);

    }
}
