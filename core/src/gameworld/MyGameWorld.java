package gameworld;

import com.badlogic.gdx.Gdx;


import java.util.*;


/**
 * Created by Senheizer on 26.07.2015.
 */
public class MyGameWorld {


    private ArrayList<Smile> smiles;
    private Random random;
    private Smile smile;





    public MyGameWorld() {

   random = new Random();
   smiles = new ArrayList<Smile>();
    for( int i = 0;i < 10; i++) {
        smiles.add(i,new Smile(random.nextInt(768),random.nextInt(448),32,32));
    }

}



    public void update(float delta) {
        Gdx.app.log("MyGameWorld", "update");
        for(int i = 0;i <smiles.size();i++) {
            smiles.get(i).update(delta);
            smile = smiles.get(i);
          // crashSmiles(i);



        }



    }

    public ArrayList<Smile> getSmiles() {
        return smiles;
    }



public void crashSmiles(int i) {
    for(int j = 0; j <smiles.size();j++) {
        if(i == j) {
        }
        if(smiles.get(i).getRect().overlaps(smiles.get(j).getRect())) {
            smiles.remove(i);
        }

    }
}



    }




