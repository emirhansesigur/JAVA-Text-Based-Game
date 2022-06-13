package CharacterF;

import Others.Chance;

public class Knight extends Characters{
    private boolean status=false; // Knights  are generated inactively.
    private int restHitNumber=1; // Their hit number is 1 by default.
    private Chance chance;
    private String KnightType;

    public Knight(String name, int id) {
        super(name, id);
    }

    public int getRestHitNumber() {
        return restHitNumber;
    }


    public void setRestHitNumber(int restHitNumber) {
        this.restHitNumber = restHitNumber;
    }

    public String getKnightType() {
        return KnightType;
    }

    public void setKnightType(String knightType) {
        KnightType = knightType;
    }

    public void hit(Foe foe){

    }

    @Override
    public String toString() {
        return "Knight{" +
                ", restHitNumber=" + restHitNumber +
                ", KnightType=" + KnightType + '\'' +
                '}';

    }

    public Chance getChance() {
        return chance;
    }




}