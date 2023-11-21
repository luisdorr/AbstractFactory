package animalFactory;

import habitats.Grassland;
import habitats.Habitat;
import species.Cow;
import species.Specie;

public class CowFactory implements AbstractAnimalFactory {
    public Habitat createHabitat() {
        return new Grassland();
    }

    public Specie createSpecie() {
        return new Cow();
    }
}
