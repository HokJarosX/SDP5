public class Route {
    private final double distanceKm;
    private final int estimatedMinutes;
    private final String description;

    public Route(double distanceKm, int estimatedMinutes, String description) {
        this.distanceKm = distanceKm;
        this.estimatedMinutes = estimatedMinutes;
        this.description = description;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public int getEstimatedMinutes() {
        return estimatedMinutes;
    }

    public String getDescription() {
        return description;
    }
}
