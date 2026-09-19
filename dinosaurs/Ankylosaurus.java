package dinosaurs;

public class Ankylosaurus implements Herbivore {
    @Override
    public String getName() {
        return "Ankylosaurus";
    }

    @Override
    public String getInfo() {
        return "smashes attackers with its heavy tail club";
    }
}
