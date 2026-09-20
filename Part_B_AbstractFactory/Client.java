package Part_B_AbstractFactory;

import dinosaurs.*;

public class Client {
    EraFactory factory;

    public Client(EraFactory factory) {
        this.factory = factory;
    }

    public void printList() {
        Theropod theropod = factory.createTheropod();
        Herbivore herbivore = factory.createHerbivore();
        Armored armored = factory.createArmored();

        System.out.println(theropod.getName() + " " + theropod.getInfo());
        System.out.println(herbivore.getName() + " " + herbivore.getInfo());
        System.out.println(armored.getName() + " " + armored.getInfo());
    }
}
