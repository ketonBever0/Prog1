import java.util.Random;

public class RandomNamer implements Namer {

    private int length;
    private Random rnd;
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_";


    public RandomNamer(Random rnd, int length) {
        this.length = length;
        this.rnd = rnd;
    }

    @Override
    public void rename(FileSystemEntry file) {

        StringBuilder name = new StringBuilder();

        for (int i = 0; i < this.length; i++) {
            name.append(this.ALPHABET.charAt(rnd.nextInt(ALPHABET.length())));
        }

        file.setName(name.toString());

    }
}
