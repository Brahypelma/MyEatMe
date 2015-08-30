package gameworld;






import java.util.*;


/**
 * Created by Senheizer on 26.07.2015.
 */
public class MyGameWorld {


    private ArrayList<Smile> smiles;
    private Random random;
    private Map<Smile,Smile> huntedPair;



    public MyGameWorld() {

   random = new Random();
   smiles = new ArrayList<Smile>();
        bornNewSmile();

    }

    public void update(float delta) {


        for(int i = 0;i <smiles.size();i++) { // Обновляет статус позиции смайликов изгодя из smiles.update(delta) в котором есть movesmile()
            smiles.get(i).update(delta);


        }
        crashSmiles(); //Обрабатывает столкновение,удаляет меньший ,увеличивает больший
        bornNewSmile(); // Проверяет колличество и рождает новые. их должно быть постоянно 10
     checkHunting();// проверяет Расстояние между смайлами,Описание ниже


    }

    public ArrayList<Smile> getSmiles() {
        return smiles;
    }

    public void bornNewSmile() {


        while (smiles.size()<10) {
            int color = random.nextInt(3);
            if(color == 0) {
                smiles.add(new GreenSmile(random.nextInt(700), random.nextInt(380),0,random.nextInt(5)));
            }
            else if(color == 1) {
                smiles.add(new RedSmile(random.nextInt(700), random.nextInt(380),1,random.nextInt(5)));
            }
            else if(color == 2) {
                smiles.add(new YellowSmile(random.nextInt(700), random.nextInt(380),2,random.nextInt(5)));

            }

            }

    }
   public void crashSmiles() {
       Set<Smile> smileDelete = new HashSet<Smile>();
       Set<Smile> needToUp = new HashSet<Smile>();

       for(Smile x : smiles) {
           for (Smile y : smiles) {
               if(x == y) {

               }else if (x.getRect().overlaps(y.getRect())) {
                   if( x.getRect().width > y.getRect().width) {
                       smileDelete.add(y);
                       needToUp.add(x);
                   }else if ( x.getRect().width <y.getRect().width) {
                       smileDelete.add(x);
                       needToUp.add(y);

                   }else {
                       smileDelete.add(x);
                       smileDelete.add(y);
                   }

               }
           }
       }


for (Smile x : smileDelete) {
    for (int i = 0; i < smiles.size(); i++) {
        if ( x == smiles.get(i)) {
            smiles.remove(i);
        }
    }
}
       for (Smile x : needToUp) {
           for (int i = 0; i < smiles.size(); i++) {
               if ( x == smiles.get(i)) {
                   smiles.get(i).growUp();
               }
           }
       }




        }

    public void checkHunting() {  //Дописан метод Который Ищет смайлиуи на мальноком расстояниии. опередяет - больше записывае его в Мап ключем,меньший содержанием
        huntedPair = new HashMap<Smile,Smile>();

        for (Smile x : smiles) {
            for (Smile y : smiles) {
                if( x.getRect().width == y.getRect().width) {

                } else if (x.getRect().width > y.getRect().width) {
                    huntedPair.put(x,y);

                }else if (x.getRect().width < y.getRect().width) {
                    huntedPair.put(y,x);
                }

            }
        }

    }




    }











