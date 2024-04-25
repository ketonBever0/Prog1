public class Main {
    public static void main(String[] args) {


        Jatek j1 = new Jatek("War Thunder", "Simulation", "Tank");

        for (String g : j1.getGenre()) {
            System.out.println(g);
        }

    }
}