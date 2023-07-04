public class Main {

    public static void main(String[] args) {

        Engine myEngine = new Engine(50, 30);

        Pedelec myPedelec = new Pedelec(myEngine, 0, 0, 1);

        myPedelec.speedUp(25);
        System.out.println("Torque: " + myPedelec.PrintTorque(myPedelec.speed) + " at " + myPedelec.speed + "kmh.");

        String myBikeProperties = "Cadence: " + myPedelec.cadence + ", Gear: " + myPedelec.gear;
        System.out.println(myBikeProperties);
    }
}