public abstract class Vehicle {
    int height;
    long timeEntered;

    Vehicle(int height) {
        this.height = height;
    }

    abstract void drive();

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public long getTimeEntered() {
        return timeEntered;
    }

    public void setTimeEntered(long timeEntered) {
        this.timeEntered = timeEntered;
    }
}
