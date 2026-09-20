package Part_B_AbstractFactory;

import dinosaurs.*;

public class JurassicFactory implements EraFactory{
    @Override
    public Theropod createTheropod() {
        return new Allosaurus();
    }

    @Override
    public Herbivore createHerbivore() {
        return new Brachiosaurus();
    }

    @Override
    public Armored createArmored() {
        return new Stegosaurus();
    }
}
