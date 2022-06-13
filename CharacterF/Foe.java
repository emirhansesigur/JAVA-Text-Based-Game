package CharacterF;

public class Foe extends Characters{
    private boolean status;
    private String FoeType;

    public Foe(String name, int id) {
        super(name, id);

    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setFoeType(String foeType) {
        FoeType = foeType;
    }
}
