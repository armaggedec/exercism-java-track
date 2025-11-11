public class CarsAssemble {

    private final int CARS_PER_HOUR = 221;
    private final int MINUTES_PER_HOUR = 60;
    private final double[] EFFICIENCY_RATES = {0.0, 1.0, 1.0, 1.0, 1.0, 0.9, 0.9, 0.9, 0.9, 0.8, 0.77};

    public double productionRatePerHour(int speed) {
        return CARS_PER_HOUR * speed * EFFICIENCY_RATES[speed];
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / MINUTES_PER_HOUR);
    }
}
