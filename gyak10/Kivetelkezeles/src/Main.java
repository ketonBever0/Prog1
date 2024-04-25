import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        while (true) {
            String num1 = sc.nextLine();
            String num2 = sc.nextLine();


//        ZeroDivisionException e = new ZeroDivisionException();

            try {
                if (Integer.parseInt(num2) == 0) {
                    throw new ZeroDivisionException();
                }
                System.out.println(Integer.parseInt(num1) / Integer.parseInt(num2));
            } catch (NumberFormatException e) {
                System.err.println("Nem számokat adtál meg!");
                continue;
            } catch (ArithmeticException e) {
                System.err.println("Zéróosztó!");
                continue;
            } catch (ZeroDivisionException e) {
                System.err.println("Nullával osztottál!");
                continue;
            }

            break;
        }

    }
}
