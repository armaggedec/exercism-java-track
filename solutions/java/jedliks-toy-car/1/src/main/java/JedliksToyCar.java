public class JedliksToyCar {

    private int battery = 100;
    private int distance;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.distance);
    }

    public String batteryDisplay() {
        return battery > 0 ? String.format("Battery at %d%%", this.battery) : "Battery empty";
    }

    public void drive() {
        if (this.battery == 0) {
            return;
        }
        this.distance += 20;
        this.battery -= 1;
    }
}
