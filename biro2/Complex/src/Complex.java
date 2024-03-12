import java.text.DecimalFormat;

public class Complex {

    private final double real;
    private final double imag;


    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex() {
        this(0, 0);
    }

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat();
        return imag == 0 ? Double.toString(real) : String.format("%s%s%si",
                decimalFormat.format(real),
                imag > 0 ? "+" : "",
                decimalFormat.format(imag));
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public Complex add(Complex masik) {
//      z1 + z2 = (a+c) + (b+d)i
//      z1 - a, b   z2 - c, d

        return new Complex(
                this.real + masik.real,
                this.imag + masik.imag
        );

    }

    public Complex mul(Complex masik) {

//      z1 * z2 = (a + bi) * (c + di) = a * c − b * d + (a ⋅* d + b * c)i
//      z1 - a, b   z2 - c, d

        return new Complex(
                this.real * masik.real - this.imag * masik.imag,
                this.real * masik.imag + this.imag * masik.real
        );


    }

    public Complex conjugate() {

//        Képzetes egység előjele megváltozik

        return new Complex(
                this.real,
                0 - this.imag
        );

    }


}
