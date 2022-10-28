import Beepers.Beeper;
import Engines.Engine;
import Transmissions.Transmission;

public class octavia extends car{
    public octavia(Beeper beeper, Engine engine, Transmission transmission) {
        super(beeper, engine, transmission);
    }
    String cheap(){
        return "чипирована";
    }
}
