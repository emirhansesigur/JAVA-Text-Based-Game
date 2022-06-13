package CharacterF;

public class Characters{

    private String name;
    private int id;
    private boolean isActive;
    private boolean luck;

    public Characters(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


}
