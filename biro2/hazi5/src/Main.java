public class Main {
    public static void main(String[] args) {


        Csavarhuzo cs1 = new Csavarhuzo(7, Csavarfej.IMBUSZ);

        System.out.println("imbusz".equalsIgnoreCase(cs1.getCsavarfej().name()));
        System.out.println(cs1);

        System.out.println(Math.min(Math.max(5, 0), 100));



    }
}