package nl.novi.pokemon;

public class Main {
    public static void main(String[] args) {

        FirePokemon firePokemon = new FirePokemon("Charmander", "Charmander!", 39, "lizard");
        WaterPokemon waterPokemon = new WaterPokemon("Squirtle", "Squirtle!", 44, 9.0);
        GrassPokemon grassPokemon = new GrassPokemon("Bulbasaur", "Bulbasaur!", 45, 100);
        ElectricPokemon electricPokemon = new ElectricPokemon("Pikachu", "Pika, Pika!", 35, "berries");

        firePokemon.makeSound();
        firePokemon.attack();
        firePokemon.takeWaterDamage();
        firePokemon.attackDragonRush();
        System.out.println();

        waterPokemon.makeSound();
        waterPokemon.attack();
        waterPokemon.takeElectricDamage();
        waterPokemon.dance();
        System.out.println();

        grassPokemon.makeSound();
        grassPokemon.attack();
        grassPokemon.takeFireDamage();
        grassPokemon.photosynthesize();
        System.out.println();

        electricPokemon.makeSound();
        electricPokemon.attack();
        electricPokemon.takeGroundDamage();
        electricPokemon.eat();
        System.out.println();
    }
}

// Hoe een pokemon twee types kan zijn in deze set-up weet ik niet. Ik dacht aan compositie, maar ik weet niet of dat mogelijk is icm. overerving. Dit betekent ook dat je elke subklasse als field binnen elke andere subklasse moet initiërem?