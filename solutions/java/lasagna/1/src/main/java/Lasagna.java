public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int actualMinutes) {
        return expectedMinutesInOven() - actualMinutes;
    }

    public int preparationTimeInMinutes(int layersCount) {
        return layersCount * 2;
    }

    public int totalTimeInMinutes(int layersCount, int actualMinutes) {
        return preparationTimeInMinutes(layersCount) + actualMinutes;
    }
}
