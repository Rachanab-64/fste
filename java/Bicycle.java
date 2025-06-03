package Activities;

public class Bicycle implements BicycleOperation {
    int gears;
    int currentSpeed;

    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

   
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Speed decreased to: " + currentSpeed);
    }

   
    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Speed increased to: " + currentSpeed);
    }

    public String bicycleDesc() {
    	return "No of gears are " + gears + "\nCurrent speed of bicycle is " + currentSpeed;

    }
}
