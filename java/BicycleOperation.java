package Activities;

public interface BicycleOperation {
    // BicycleParts part
    int tyres = 2;
    int maxSpeed = 40;

    // BicycleOperations part
    void applyBrake(int decrement);
    void speedUp(int increment);
}
