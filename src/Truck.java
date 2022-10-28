import Beepers.Beeper;
import Capacities.Capacity;
import Engines.Engine;
import Transmissions.Transmission;

public abstract class Truck {
    Beeper beeper;
    Engine engine;
    Transmission transmission;
    LoadWeight loadWeight;

    public Truck(Beeper beeper, Engine engine, Transmission transmission, LoadWeight loadWeight){
        this.beeper = beeper;
        this.engine = engine;
        this.transmission = transmission;
        this.loadWeight = loadWeight;
    }
}
