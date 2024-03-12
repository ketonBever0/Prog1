public class Main {
    public static void main(String[] args) {

        Hos h1 = new Hos("Károly", 5, -11, -7);
        System.out.println(h1.toString());
        System.out.println(h1.eletEro);
        Hos h2 = new Hos("Feri", 6, 11, 7);
        Hos h3 = new Hos("Guszti", 6, 11, 7);
        System.out.println(h1.erosebb(new Hos[]{h2, h3}));
    }
}