public class CarnivoreNest extends Nest{
    @Override
    public Dinosaur createDinosaur(){
        return new Carnivore();
    }

}
