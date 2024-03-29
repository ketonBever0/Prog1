public class Character {

    private int mana;
    private int stamina;
    private int health;
    private final String name;


    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }


    public Character(String name, int health, int mana, int stamina) {
        setMana(mana);
        setStamina(stamina);
        setHealth(health);
        this.name = name;
    }


    public String useSpell() {
        return "";
    }



}
