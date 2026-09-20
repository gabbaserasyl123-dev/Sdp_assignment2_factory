package Part_B_AbstractFactory;
import dinosaurs.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("~~~Jurassic~~~");
        Client jurassic = new Client(new JurassicFactory());
        jurassic.printList();

        System.out.println();
        System.out.println("~~~Cretaceous~~~");
        Client cretaceous = new Client(new CretaceousFactory());
        cretaceous.printList();
    }
}
