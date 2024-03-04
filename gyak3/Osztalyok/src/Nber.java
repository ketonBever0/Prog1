public class Nber {

    public static int population = 0;
    // az összes példány ezen osztozik
    String name;
    boolean isFemale;
    private int birthYear = 1990;


    public Nber () {
        population++;
    }

    public Nber (String name, boolean isFemale, int birthYear) {
        this.name = name;
        this.isFemale = isFemale;
        this.setBirthYear(birthYear);
        this.population++;
    }


    public String toString() {
        return String.format("Név: %s\nNem: %s\nSzületési év: %d", this.name, this.isFemale ? "Nő" : "Férfi", birthYear);
    }


    public int getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear >= 1900 && birthYear <= 2024) {
            this.birthYear = birthYear;
        } else {
            System.err.println("1900 és 2024 közötti számot adj meg!");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }
}
