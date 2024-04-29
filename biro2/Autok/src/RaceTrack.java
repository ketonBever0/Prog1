public class RaceTrack {

    private final RaceCar[] cars;
    private final float length;


    public RaceTrack(float length) {
        this.cars = new RaceCar[20];
        this.length = length;
    }

    public RaceCar[] getCars() {
        return cars;
    }

    public float getLength() {
        return length;
    }


    public boolean addCar(RaceCar car) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = car;
                return true;
            }
        }
        return false;
    }

    public MotorizedVehicle fastestCar() {
        RaceCar fastest = new RaceCar(0, 0, 1, 0);
        for (RaceCar car : cars) {
            if (car != null && car.topSpeed() > fastest.topSpeed()) {
                fastest = car;
            }
        }
        return fastest;
    }

    public void removeStoppedCars() {
        for (int i = 0; i < cars.length; i++) {
            if (!cars[i].canGo()) cars[i] = null;
        }
    }
}
