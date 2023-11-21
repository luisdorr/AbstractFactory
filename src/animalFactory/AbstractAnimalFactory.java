package animalFactory;

import habitats.Habitat;
import species.Specie;

interface AbstractAnimalFactory {
    Habitat createHabitat();
    Specie createSpecie();
}
