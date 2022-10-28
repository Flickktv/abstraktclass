import Beepers.Beeper;
import Engines.Engine;
import Transmissions.Transmission;

public class Kamaz extends Truck{
    public Kamaz(Beeper beeper, Engine engine, Transmission transmission, LoadWeight loadWeight) {
        super(beeper, engine, transmission, loadWeight);
    }
    String fuel(){
        return "Disel";
    }
}
