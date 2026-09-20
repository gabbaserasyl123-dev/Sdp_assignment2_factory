package Part_B_AbstractFactory;

import dinosaurs.*;

public class CretaceousFactory implements EraFactory{
    @Override
    public Theropod createTheropod() {
        return new Tyrannosaurus_Rex();
    }

    @Override
    public Herbivore createHerbivore() {
        return new Triceratops();
    }

    @Override
    public Armored createArmored() {
        return new Ankylosaurus();
    }
}
