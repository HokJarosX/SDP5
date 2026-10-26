public class CarStrategy implements TravelStrategy {
    @Override
    public int calculateTime(double distance) {
        return (int) (distance * 2);
    }
}