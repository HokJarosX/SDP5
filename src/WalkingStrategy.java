public class WalkingStrategy implements TravelStrategy {
    @Override
    public int calculateTime(double distance) {
        return (int) Math.ceil(distance * 20);
    }
}