import java.util.Random;

public class RandomNamer implements Namer {

    private int length;
    private Random md;
    private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_\n";


    public RandomNamer(Random md, int length) {
        this.length = length;
        this.md = md;
    }

    @Override
    public void rename(FileSystemEntry file) {

        StringBuilder name = new StringBuilder();

        for (int i = 0; i < ALPHABET.length(); i++) {
            name.append(ALPHABET, 0, md.nextInt(ALPHABET.length()));
        }

        file.setName(name.toString());

    }
}
