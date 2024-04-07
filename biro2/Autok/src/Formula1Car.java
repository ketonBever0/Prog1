public class Formula1Car extends RaceCar {

    private String team;
    private int pilotSkillLevel;


    public Formula1Car(int topSpeed, String team, int pilotSkillLevel) {
        super();
        this.team = team;
        this.pilotSkillLevel = pilotSkillLevel;
    }

    public String getTeam() {
        return team;
    }

    public int getPilotSkillLevel() {
        return pilotSkillLevel;
    }

    public void setPilotSkillLevel(int pilotSkillLevel) {
        this.pilotSkillLevel = pilotSkillLevel;
    }
}
