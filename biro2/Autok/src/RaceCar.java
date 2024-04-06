public class RaceCar extends MotorizedVehicle {

    private float tirePercentage = 100;
    private int horsePower;
    private int baseHorsePower;
    private int topSpeed;


    public RaceCar(int tankMaxCapacity, int weight, int horsePower, int topSpeed) {
        super(4, tankMaxCapacity, weight);
    }



}
