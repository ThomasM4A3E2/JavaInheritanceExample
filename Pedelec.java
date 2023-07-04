public class Pedelec extends Bicycle{

    final IEngine engine;
    public Pedelec (IEngine engine, int startCadence, int startSpeed, int startGear) {

        super(startCadence, startSpeed, startGear);
        this.engine = engine;
    }

    public double PrintTorque (int speed) {

        return engine.torque(speed);
    }
}
