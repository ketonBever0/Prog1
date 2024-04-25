import java.util.Arrays;
import java.util.Objects;

public class Jatek {

    private String nev;
    private String[] genre;


    public Jatek(String nev) {
        this.nev = nev;
        this.genre = new String[3];
    }

    public Jatek(String nev, String... genre) {
        this.nev = nev;
        this.genre = new String[3];

            for (int i = 0; i < this.genre.length; i++) {
                try {
                    this.genre[i] = genre[i];
                } catch (ArrayIndexOutOfBoundsException buzivagyhe) {
                    this.genre[i] = null;
                }
//                System.out.println(this.genre[i]);
            }
    }

    public String getNev() {
        return nev;
    }

    public String[] getGenre() {
        return genre;
    }

    public void addGenre(String name) {
        for (int i = 0; i < this.genre.length; i++) {
            if (this.genre[i] == null) {
                this.genre[i] = name;
                break;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jatek jatek = (Jatek) o;
        return Objects.equals(nev, jatek.nev) && Objects.deepEquals(genre, jatek.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nev, Arrays.hashCode(genre));
    }
}
