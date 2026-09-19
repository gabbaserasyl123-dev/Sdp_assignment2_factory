public class Main {

    public static void main(String[] args) {
        Nest allosaurusNest = new CarnivoreNest();
        System.out.println(allosaurusNest.incubate());

        Nest brachiosaurusNest = new HerbivoreNest();
        System.out.println(brachiosaurusNest.incubate());
    }
}
