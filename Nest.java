public abstract class Nest {
    public abstract Dinosaur createDinosaur();

    public String incubate(){
        Dinosaur dinosaur = createDinosaur();
        return dinosaur.getName() + " hatched";
    }
}
