import structures.ClientAnimal;
import animalFactory.CowFactory;
import animalFactory.WolfFactory;

public class Main {
    public static void main(String[] args) {
        ClientAnimal cowClient = new ClientAnimal(new CowFactory());
        cowClient.useAnimal();
        // Saída: "Este é um habitat de pasto." e "A vaca faz 'Moo'"

        ClientAnimal wolfClient = new ClientAnimal(new WolfFactory());
        wolfClient.useAnimal();
        // Saída: "Este é um habitat de floresta." e "O lobo faz 'Howl'"
    }
}