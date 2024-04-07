import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(rnd.nextInt(5));
        }
    }
}