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

        float cons = km * this.averageConsuption();
        if (this.fuelLevel * this.averageConsuption() < km * this.averageConsuption()) {
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
        return (int) Math.floor(
                this.fuelLevel / this.averageConsuption()
        );
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
        return String.format("Alapsuly: %d Kg, Kerekek szama: %d, Uzemanyag tartaj: %f/50", this.baseWeight, this.tireCount, this.fuelLevel);
    }
}
