package gameworld;




import java.util.*;


/**
 * Created by Senheizer on 26.07.2015.
 */
public class MyGameWorld {


    private ArrayList<Smile> smiles;
    private Random random;

    private float fps;





    public MyGameWorld() {

   random = new Random();
   smiles = new ArrayList<Smile>();
    for( int i = 0;i < 10; i++) {
        smiles.add(i,new Smile(random.nextInt(768),random.nextInt(448),32,32));
    }

}



    public void update(float delta) {
        this.fps = delta;

        for(int i = 0;i <smiles.size();i++) {
            smiles.get(i).update(delta);

        }
        crashSmiles(smiles);
        bornNewSmile(smiles);




    }

    public ArrayList<Smile> getSmiles() {
        return smiles;
    }



public void crashSmiles(ArrayList<Smile> smiles) {

for ( int i = 0; i < smiles.size();i++) {
    for ( int j = 0; j < smiles.size(); j++) {
        if ( i == j ) {

        }
        else if (smiles.get(i).getRect().overlaps(smiles.get(j).getRect()))
        {
            smiles.remove(i);

        }
    }
}




    }
    public void bornNewSmile(ArrayList<Smile> smiles) {
        while (smiles.size()<10) {
            smiles.add(new Smile(random.nextInt(768),random.nextInt(448),32,32));

        }
    }

    public float getFps() {
        return fps;
    }



    }




