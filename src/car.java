import Beepers.Beeper;
import Capacities.Capacity;
import Engines.Engine;
import Transmissions.Transmission;

public abstract class car {

    Beeper beeper;
    Engine engine;
    Transmission transmission;
    Capacity capacity;
    public car(Beeper beeper, Engine engine, Transmission transmission, Capacity capacity){
        this.beeper = beeper;
        this.engine = engine;
        this.transmission = transmission;
        this.capacity = capacity;
    }

    public car(Beeper beeper, Engine engine, Transmission transmission) {
        this.beeper = beeper;
        this.engine = engine;
        this.transmission = transmission;
    }
}
