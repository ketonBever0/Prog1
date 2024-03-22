public class Main {
    public static void main(String[] args) {


        ElektromosFogkefe ef1 = new ElektromosFogkefe("szürke", 1500, true);

        ef1.fejCsere(new Fej("szürke"));

        System.out.println(ef1.fogmosas(2));



    }
}