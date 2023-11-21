package animalFactory;

import habitats.Forest;
import habitats.Habitat;
import species.Specie;
import species.Wolf;


public class WolfFactory implements AbstractAnimalFactory {
    public Habitat createHabitat() {
        return new Forest();
    }

    public Specie createSpecie() {
        return new Wolf();
    }
}
