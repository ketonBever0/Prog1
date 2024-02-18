public class Kenguru {

    public String name;
    public boolean hasPockets;
    public String gender;
    public Integer feetSize;
    public Integer strength;
    public double health;


    public Kenguru(String name, boolean hasPockets, String gender, Integer feetSize, Integer strength, double health){
        this.name = name;
        this.hasPockets = hasPockets;
        this.gender = gender;
        this.feetSize = feetSize;
        this.strength = strength;
        this.health = health;
    }

    public void eszik(String food) {
        health++;
    }

    public Kenguru harcol(Kenguru with) {
        return with;
    }



}
