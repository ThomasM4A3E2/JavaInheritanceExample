public class Engine implements IEngine {

    private final int _maxTorque;
    private final int _maxSpeed;

    public Engine (int maxTorque, int maxSpeed) {

        _maxTorque = maxTorque;
        _maxSpeed = maxSpeed;
    }
    public double torque(int currentSpeed) {

        return (double)_maxTorque * (1.0 - Math.pow((double)currentSpeed / (double)_maxSpeed, 15));
        }
}
