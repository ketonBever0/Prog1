public class Main {
    public static void main(String[] args) {


        Nber e1 = new Nber("Károly", false, 1985);

//        e1.setBirthYear(1985);

//        System.out.println(e1.name + " egy " + (e1.isFemale ? "nő" : "férfi" + ", aki születési éve " + e1.birthYear + "."));

        System.out.println(e1.toString());

        System.out.printf("Jelenleg %d%n", Nber.population);

    }
}