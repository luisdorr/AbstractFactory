package structures;

import animalFactory.AbstractAnimalFactory;
import habitats.Habitat;
import species.Specie;

public class ClientAnimal {
    private Habitat habitat;
    private Specie specie;

    public ClientAnimal(AbstractAnimalFactory factory) {
        habitat = factory.createHabitat();
        specie = factory.createSpecie();
    }

    public void useAnimal() {
        habitat.description();
        specie.sound();
    }
}
