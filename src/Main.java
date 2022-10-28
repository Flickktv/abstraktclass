import Beepers.horn;
import Capacities.Capacitycar;
import Engines.Engine;
import Engines.EngineKamaz;
import Engines.EngineV16;
import Engines.EngineV8;
import Transmissions.Transmission12lvl;
import Transmissions.Transmission16LVL;

public class Main {
    public static void main(String[] args) {
        //create car

        horn horn = new horn();
        EngineV8 engineV8 = new EngineV8();
        Transmission12lvl transmission12lvl = new Transmission12lvl();

        octavia octavia = new octavia(horn, engineV8, transmission12lvl);

        System.out.println(octavia.beeper.makeSound());
        System.out.println(octavia.engine.getSpeed());
        System.out.println(octavia.transmission.amountLevel());
        System.out.println(octavia.cheap());

        EngineV16 engineV16 = new EngineV16();
        Transmission16LVL transmission16LVL = new Transmission16LVL();
        Capacitycar capacitycar = new Capacitycar();
        Highlander highlander = new Highlander(horn, engineV16, transmission16LVL, capacitycar);

        System.out.println(highlander.beeper.makeSound());
        System.out.println(highlander.engine.getSpeed());
        System.out.println(highlander.transmission.amountLevel());
        System.out.println(highlander.capacity.amount());

        LoadWeight loadWeight = new Weight();
        EngineKamaz engineKamaz = new EngineKamaz();
        Kamaz kamaz = new Kamaz(horn, engineKamaz, transmission16LVL, loadWeight);

        System.out.println(kamaz.beeper.makeSound());
        System.out.println(kamaz.engine.getSpeed());
        System.out.println(kamaz.transmission.amountLevel());
        System.out.println(kamaz.loadWeight.loadWeight());
        System.out.println(kamaz.fuel());

    }
}