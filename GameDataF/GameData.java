package GameDataF;

import CharacterF.*;
import Others.Chance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GameData {

    private ArrayList<Knight> Knights;
    private ArrayList<Knight> ActiveKnights;
    private ArrayList<Foe> Foes;
    private ArrayList<Foe> ActiveFoes;
    private ArrayList<Chance> chance;

    ArrayList<Integer> FoeArray = new ArrayList<Integer>();
    ArrayList<Integer> KnightArray = new ArrayList<Integer>();

    public GameData() {

        Knights=new ArrayList<>();
        Foes=new ArrayList<>();

        ActiveKnights=new ArrayList<>();
        ActiveFoes= new ArrayList<>();

        chance = new ArrayList<>();
        chance.add(new Chance());
        chance.add(new Chance());
        chance.add(new Chance());
        chance.add(new Chance());
        chance.add(new Chance());


        StrongKnight strongKnight1 = new StrongKnight("Knight 1", 1);
        StrongKnight strongKnight2 = new StrongKnight("Knight 2", 1);
        StrongKnight strongKnight3 = new StrongKnight("Knight 3", 1);
        StrongKnight strongKnight4 = new StrongKnight("Knight 4", 1);
        StrongKnight strongKnight5 = new StrongKnight("Knight 5", 1);

        WeakKnight weakKnight1 = new WeakKnight("Knight 6", 2,chance.get(0).getNumber());
        WeakKnight weakKnight2 = new WeakKnight("Knight 7", 2,chance.get(1).getNumber());
        WeakKnight weakKnight3 = new WeakKnight("Knight 8", 2,chance.get(2).getNumber());
        WeakKnight weakKnight4 = new WeakKnight("Knight 9", 2,chance.get(3).getNumber());
        WeakKnight weakKnight5 = new WeakKnight("Knight 10", 2,chance.get(4).getNumber());


        StrongFoe strongFoe1 = new StrongFoe("Foe q", 1);
        StrongFoe strongFoe2 = new StrongFoe("Foe w", 1);
        StrongFoe strongFoe3 = new StrongFoe("Foe e", 1);
        StrongFoe strongFoe4 = new StrongFoe("Foe r", 1);
        StrongFoe strongFoe5 = new StrongFoe("Foe t", 1);

        WeakFoe weakFoe1 = new WeakFoe("Foe y", 2);
        WeakFoe weakFoe2 = new WeakFoe("Foe u", 2);
        WeakFoe weakFoe3 = new WeakFoe("Foe o", 2);
        WeakFoe weakFoe4 = new WeakFoe("Foe p", 2);
        WeakFoe weakFoe5 = new WeakFoe("Foe l", 2);

        Knights.add(strongKnight1);
        Knights.add(strongKnight2);
        Knights.add(strongKnight3);
        Knights.add(strongKnight4);
        Knights.add(strongKnight5);

        Knights.add(weakKnight1);
        Knights.add(weakKnight2);
        Knights.add(weakKnight3);
        Knights.add(weakKnight4);
        Knights.add(weakKnight5);

        Foes.add(strongFoe1);
        Foes.add(strongFoe2);
        Foes.add(strongFoe3);
        Foes.add(strongFoe4);
        Foes.add(strongFoe5);

        Foes.add(weakFoe1);
        Foes.add(weakFoe2);
        Foes.add(weakFoe3);
        Foes.add(weakFoe4);
        Foes.add(weakFoe5);


        int sayi = (int)(Math.random());
        if(sayi ==0) { // 1 Strong Knight will be created
            chooseRandomNumberinRange(KnightArray, 4, 0, 1);
            chooseRandomNumberinRange(KnightArray, 9, 5, 5);


        }

        else { // 2 Strong Knights will be created
            chooseRandomNumberinRange(KnightArray, 4, 0, 2);
            chooseRandomNumberinRange(KnightArray, 9, 5, 3);
        }

            ActiveKnights.add(Knights.get(KnightArray.get(0)));
            ActiveKnights.add(Knights.get(KnightArray.get(1)));
            ActiveKnights.add(Knights.get(KnightArray.get(2)));
            ActiveKnights.add(Knights.get(KnightArray.get(3)));
            ActiveKnights.add(Knights.get(KnightArray.get(4)));





        int sayi2 = (int)(Math.random()*2);

        if(sayi2 == 0 ){
            chooseRandomNumberinRange(FoeArray, 4, 0, 1);

        }
        else if(sayi2 == 1){
            chooseRandomNumberinRange(FoeArray, 4, 0, 2);

        }
        chooseRandomNumberinRange(FoeArray, 9, 5, 5);

        sayi3 = (int)(Math.random()*3);

        if(sayi3 == 0){  // 3 Foes will be created
            ActiveFoes.add(Foes.get(FoeArray.get(2)));
            ActiveFoes.add(Foes.get(FoeArray.get(0)));
            ActiveFoes.add(Foes.get(FoeArray.get(1)));
        }
        else if(sayi3 == 1){ // 4 Foes will be created

            ActiveFoes.add(Foes.get(FoeArray.get(3)));
            ActiveFoes.add(Foes.get(FoeArray.get(0)));
            ActiveFoes.add(Foes.get(FoeArray.get(2)));
            ActiveFoes.add(Foes.get(FoeArray.get(1)));
        }
        else if(sayi3 == 2){ // 5 Foes will be created

            ActiveFoes.add(Foes.get(FoeArray.get(4)));
            ActiveFoes.add(Foes.get(FoeArray.get(0)));
            ActiveFoes.add(Foes.get(FoeArray.get(3)));
            ActiveFoes.add(Foes.get(FoeArray.get(1)));
            ActiveFoes.add(Foes.get(FoeArray.get(2)));
        }



    }

    private static int sayi3; // how many Foe will be generated 0 -> 3, 1 -> 4, 2 -> 5,


    public static void chooseRandomNumberinRange(ArrayList<Integer> arrayList, int max, int min, int howMany){


        //ArrayList has been chosen in order to use arrayList.contains(a)
        max++; // max is "dahil."
        while (arrayList.size() < howMany){
            int a = new Random().nextInt(max - min) + min;
            if (!arrayList.contains(a)) {
                arrayList.add(a);
            }
        }
        Collections.sort(arrayList);

    }




    public ArrayList<Knight> getKnights() {
        return Knights;
    }

    public ArrayList<Foe> getFoes() {
        return Foes;
    }


    public ArrayList<Knight> getActiveKnights() {
        return ActiveKnights;
    }

    public ArrayList<Foe> getActiveFoes() {
        return ActiveFoes;
    }



    public static int getSayi3() {
        return sayi3;
    }


}
