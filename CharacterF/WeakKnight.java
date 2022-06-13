package CharacterF;

import Others.Chance;

public class WeakKnight extends Knight {
    int number;
    public WeakKnight(String name, int id, int number) {
        super(name, id);
        setKnightType("Weak Knight");
        setRestHitNumber(number);
    }

}
