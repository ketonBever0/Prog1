public class MotorizedVehicle {

    private float fuelLevel;
    private int maxFuelCapacity;
    private int tireCount;
    private int baseWeight;


    public MotorizedVehicle(int tireCount, int maxFuelCapacity, int weight) {
        this.maxFuelCapacity = maxFuelCapacity;
        this.tireCount = tireCount;
        this.baseWeight = weight;
    }

    public float averageConsuption() {
        return (float) (5 * Math.sqrt((double) this.baseWeight / 1302));
    }

    public boolean go(float km) {

    }

    public void refuel(float l) {

    }

    public int range() {

    }

    public float getFuelLevel() {
        return fuelLevel;
    }

    public int getMaxFuelCapacity() {
        return maxFuelCapacity;
    }

    public int getTireCount() {
        return tireCount;
    }

    public int getBaseWeight() {
        return baseWeight;
    }

    private void setFuelLevel(float fuelLevel) {
        this.fuelLevel = Math.min(Math.max(fuelLevel, 0), 100);
    }

    @Override
    public String toString() {
        return "MotorizedVehicle{" +
                "fuelLevel=" + fuelLevel +
                ", maxFuelCapacity=" + maxFuelCapacity +
                ", tireCount=" + tireCount +
                ", baseWeight=" + baseWeight +
                '}';
    }
}
