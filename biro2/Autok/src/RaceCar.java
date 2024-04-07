public class RaceCar extends MotorizedVehicle {

    private float tirePercentage = 100;
    private int horsePower;
    private int baseHorsePower;
    private int topSpeed;


    public RaceCar(int tankMaxCapacity, int weight, int horsePower, int topSpeed) {
        super(4, tankMaxCapacity, weight);
        this.baseHorsePower = Math.max(1, horsePower);
        this.horsePower = Math.max(1, horsePower);
        this.topSpeed = topSpeed;
    }

    public float getTirePercentage() {
        return tirePercentage;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return String.format(
                "Ez egy %d loeros versenyauto, aminek %d km/h a vegsebessege es jelenleg %.1f %%-os gumik vannak rajta.",
                this.horsePower, this.topSpeed(), this.tirePercentage
                );
    }

    @Override
    public boolean go(float km) {
        if (!super.go(km)) return false;
        this.tirePercentage -= (float) (km * 0.01);
        return true;
    }

    public void changeTire() {
        if (this.tirePercentage <= 20) this.tirePercentage = 100;
    }

    public void tune() {
        this.horsePower = (int) Math.min(this.horsePower * 1.3, this.horsePower * 1.8);
    }

    public boolean canGo() {
        return this.tirePercentage > 0 && super.getFuelLevel() > 0;
    }

    public int topSpeed() {
        return (int) (this.topSpeed * Math.sqrt((double) this.baseHorsePower / this.horsePower));
    }
}
