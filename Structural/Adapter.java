package Structural;

// Target
interface Charger {

    void charge();
}


// Adaptee
class ThreePortCharger {

    void chargeWithThreePorts() {
        System.out.println("Charging with 3 ports");
    }
}


// Adapter
class TwoPortAdapter implements Charger {

    private ThreePortCharger charger;

    TwoPortAdapter(ThreePortCharger charger) {
        this.charger = charger;
    }

    @Override
    public void charge() {
        charger.chargeWithThreePorts();
    }
}


// Client
public class Adapter {

    public static void main(String[] args) {

        ThreePortCharger threePortCharger = new ThreePortCharger();

        Charger twoPortCharger =
                new TwoPortAdapter(threePortCharger);

        twoPortCharger.charge();
    }
}