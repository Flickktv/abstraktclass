package Beepers;

import Beepers.Beeper;

public class horn implements Beeper {

    @Override
    public String makeSound() {
        return "beeep";
    }
}
