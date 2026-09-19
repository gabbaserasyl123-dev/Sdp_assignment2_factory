public class HerbivoreNest extends Nest{
    @Override
    public Dinosaur createDinosaur() {
        return new Herbivore();
    }
}
