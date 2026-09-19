package Part_A_Factory;

public class Main {

    public static void main(String[] args) {
        Nest allosaurusNest = new AllosaurusNest();
        System.out.println(allosaurusNest.incubate());

        Nest brachiosaurusNest = new BrachiosaurusNest();
        System.out.println(brachiosaurusNest.incubate());
    }
}
