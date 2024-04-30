import java.util.List;

public class Liga {

    private List<Csapat> csapatok;
    private List<Meccs> meccsek;


    public Liga(String directoryName) {

    }

    public Liga(List<Csapat> csapatok) {
        this.csapatok = csapatok;
    }

    public List<Csapat> getCsapatok() {
        return csapatok;
    }

    public List<Meccs> getMeccsek() {
        return meccsek;
    }

    public List<Csapat> hianyosCsapatok() {
        return null;
    }

    public int csapatokKizarasa() {
        return 0;
    }

    public Csapat jatek() {
        return null;
    }

    public void eredmenyTabla() {

    }
}
