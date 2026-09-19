package Part_A_Factory;

import dinosaurs.Brachiosaurus;
import dinosaurs.Dinosaur;

public class BrachiosaurusNest extends Nest {
    @Override
    public Dinosaur createDinosaur() {
        return new Brachiosaurus();
    }
}
