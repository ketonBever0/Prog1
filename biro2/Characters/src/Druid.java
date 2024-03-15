public class Druid extends Character {

    private boolean isBearFormActive;


    public Druid(String name) {
        super(name, 10, 6, 4);
    }

    @Override
    public String toString() {
        return String.format("Druid: Health:%d, Mana:%d, Stamina:%d", super.getHealth(), super.getMana(), super.getStamina());
    }

    public String changeForm() {
        if (super.getStamina() < 2 && !this.isBearFormActive) return "No can do.";
        if (!this.isBearFormActive) super.setStamina(Math.max(super.getStamina() - 2, 0));
        this.isBearFormActive = !this.isBearFormActive;
        return isBearFormActive ? "Bear form is on." : "Bear form is off.";
    }

    public String useSpell() {
        if (super.getMana() < 3) {
            return "Not enough mana.";
        } else {
            super.setMana(Math.max(super.getMana() - 3, 0));
            return "Moonbeam";
        }
    }


}
