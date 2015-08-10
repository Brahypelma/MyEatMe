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
        bornNewSmile(smiles);




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
            int color = random.nextInt(3);
            if(color == 0) {
                smiles.add(new GreenSmile(random.nextInt(768), random.nextInt(448), 32, 32,0));
            }
            else if(color == 1) {
                smiles.add(new RedSmile(random.nextInt(768), random.nextInt(448), 32, 32,1));
            }
            else if(color == 2) {
                smiles.add(new YellowSmile(random.nextInt(768), random.nextInt(448), 32, 32,2));

            }

            }




    }

    public float getFps() {
        return fps;
    }



    }




