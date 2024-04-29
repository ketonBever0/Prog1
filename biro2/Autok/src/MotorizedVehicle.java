public class MotorizedVehicle {

    private float fuelLevel;
    private final int maxFuelCapacity;
    private final int tireCount;
    private final int baseWeight;


    public MotorizedVehicle(int tireCount, int maxFuelCapacity, int weight) {
        this.maxFuelCapacity = maxFuelCapacity;
        this.tireCount = tireCount;
        this.baseWeight = weight;
        this.fuelLevel = maxFuelCapacity;
    }

    public float averageConsumption() {
        return (float) (5 * Math.sqrt((double) this.baseWeight / 100));
    }

    public boolean go(float km) {

        float cons = km * this.averageConsumption();
        if (this.fuelLevel * this.averageConsumption() < km * this.averageConsumption()) {
            return false;
        } else {
            this.setFuelLevel(cons);
            return true;
        }
    }

    public void refuel(float l) {
        this.fuelLevel += l;
    }

    public int range() {
        return (int) Math.floor(this.fuelLevel / this.averageConsumption());
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

    public int getWeight() {
        return (int) (this.getBaseWeight() + (this.fuelLevel * 0.77));
    }

    private void setFuelLevel(float fuelLevel) {
        this.fuelLevel = Math.min(Math.max(fuelLevel, 0), 100);
    }

    @Override
    public String toString() {
        return String.format("Alapsuly: %d Kg, Kerekek szama: %d, Uzemanyag tartaj: %.1f/50 l", this.baseWeight, this.tireCount, this.fuelLevel);
    }
}
