public class Formula1Car extends RaceCar {

    private String team;
    private int pilotSkillLevel;


    public Formula1Car(int topSpeed, String team, int pilotSkillLevel) {
        super(140, 789, 1000, topSpeed);
        this.team = team;
        this.setPilotSkillLevel(pilotSkillLevel);
    }

    public String getTeam() {
        return team;
    }

    public int getPilotSkillLevel() {
        return pilotSkillLevel;
    }

    public void setPilotSkillLevel(int pilotSkillLevel) {
        this.pilotSkillLevel = Math.min(Math.max(0, pilotSkillLevel), 10);;
    }

    @Override
    public String toString() {
        String level = "";
        if (this.pilotSkillLevel >= 0 && this.pilotSkillLevel <= 3) level = "rossz";
        else if (this.pilotSkillLevel >= 4 && this.pilotSkillLevel <= 6) level = "atlagos";
        else if (this.pilotSkillLevel >= 7 && this.pilotSkillLevel <= 10) level = "kivalo";
        return String.format(
                "Ez egy %s csapathoz tartozo forma1-es auto, aminek %d a vegsebessege es %s a pilotaja.",
                this.team, super.topSpeed(), level
        );
    }

    public boolean betterThan(RaceCar other) {
        return super.range() > other.range() && super.topSpeed() > other.topSpeed();
    }

}
