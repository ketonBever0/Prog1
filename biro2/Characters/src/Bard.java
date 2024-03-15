public class Bard extends Character {

    private boolean isPlayingBallad;


    public Bard(String name) {
        super(name, 6, 5, 10);
    }

    @Override
    public String toString() {
        return String.format("Bard: Health:%d, Mana:%d, Stamina:%d", super.getHealth(), super.getMana(), super.getStamina());
    }

    public String playBallad() {
        if (super.getStamina() < 3 && !this.isPlayingBallad) return "No can do.";
        if (!this.isPlayingBallad) super.setStamina(Math.max(super.getStamina() - 3, 0));
        this.isPlayingBallad = !this.isPlayingBallad;
        return isPlayingBallad ? "Ballad is on." : "Ballad is off.";
    }

    public String useSpell() {
        if (super.getMana() < 2) {
            return "Not enough mana.";
        } else {
            super.setMana(Math.max(super.getMana() - 2, 0));
            return "Charm Person";
        }
    }
}
