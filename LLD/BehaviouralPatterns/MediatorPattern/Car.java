package LLD.BehaviouralPatterns.MediatorPattern;

public class Car {
     private boolean engineRunning;
    private int speed;

    public Car() {
        this.engineRunning = false;
        this.speed = 0;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }

    public void setEngineRunning(boolean engineRunning) {
        this.engineRunning = engineRunning;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        this.speed += 10; // Increase speed by 10 km/h
    }

    public void decreaseSpeed() {
        if (this.speed >= 10) {
            this.speed -= 10; // Decrease speed by 10 km/h
        }
    }
}
