public class CarStrategy implements TravelStrategy {
    @Override
    public int calculateTime(double distance) {
        return (int) (distance * 2);
    }
    @Override
    public String getTransport() {
        return "car";
    }
}