package Part_B_AbstractFactory;

import dinosaurs.*;

public interface EraFactory {
    Theropod createTheropod();
    Herbivore createHerbivore();
    Armored createArmored();
}
