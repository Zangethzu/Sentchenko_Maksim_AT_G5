package homework.basetask;

public class Obstacle {
    String description;
    String severity;

    public Obstacle(String description, String severity) {
        setDescription(description);
        setSeverity(severity);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void printObstacleDetails() {
        System.out.println("Возникло " + getSeverity() + "препятствиие " + getDescription());
    }
}
