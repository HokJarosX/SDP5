public class BicycleStrategy implements TravelStrategy {
    @Override
    public int calculateTime(double distance) {
        return (int) (distance * 10);
    }
}