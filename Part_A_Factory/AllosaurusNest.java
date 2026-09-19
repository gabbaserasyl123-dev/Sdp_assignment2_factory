package Part_A_Factory;

import dinosaurs.Allosaurus;
import dinosaurs.Dinosaur;

public class AllosaurusNest extends Nest {
    @Override
    public Dinosaur createDinosaur(){
        return new Allosaurus();
    }

}
