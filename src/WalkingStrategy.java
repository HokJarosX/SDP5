public class WalkingStrategy implements TravelStrategy {
    @Override
    public int calculateTime(double distance) {
        return (int) (distance * 20);
    }
}