public class Warlock extends Character {

    private boolean isImpSummoned;


    public Warlock(String name) {
        super(name, 5, 10, 2);
    }

    @Override
    public String toString() {
        return String.format("Warlock: Health:%d, Mana:%d, Stamina:%d", super.getHealth(), super.getMana(), super.getStamina());
    }

    public String summonImp() {
        if (super.getStamina() < 1 && super.getHealth() < 2 && !this.isImpSummoned) return "No can do.";
        if (!this.isImpSummoned) {
            super.setStamina(Math.max(super.getStamina() - 1, 0));
            super.setHealth(Math.max(super.getHealth() - 2, 0));
        }
        this.isImpSummoned = !this.isImpSummoned;
        return isImpSummoned ? "Imp summoned." : "Imp sent away.";
    }

    public String useSpell() {
        if (super.getMana() < 4) {
            return "Not enough mana.";
        } else {
            super.setMana(Math.max(super.getMana() - 4, 0));
            return "Eldritch Blast";
        }
    }
}
