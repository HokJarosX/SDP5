public class TravelPlanner {
    private TravelStrategy strategy;

    public TravelPlanner(TravelStrategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(TravelStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Strategy cannot be null");
        }
        this.strategy = strategy;
    }

    public int calculateTime(double distance) {
        if (distance <= 0) {
            throw new IllegalArgumentException(
                    "Distance must be greater than zero"
            );
        }
        return strategy.calculateTime(distance);
    }
}