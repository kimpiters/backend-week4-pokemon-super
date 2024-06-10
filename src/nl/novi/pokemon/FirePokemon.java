package nl.novi.pokemon;

public class FirePokemon extends Pokemon{
    String name;
    String sound;
    int hp;
    String species;

    public FirePokemon(String name, String sound, int hp, String species) {
        super(name, sound);

        this.name = name;
        this.hp = hp;
        this.species = species;
    }

    // Getters + Setters
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    //Methods
    @Override
    void attack() {
        System.out.println(name + " strikes with a fire attack");
    }

    public void takeWaterDamage() {
        this.hp -= 10;
        System.out.println(name + " takes water damage, losing 10hp");
    }

    public void attackDragonRush() {
        System.out.println(name + " strikes with Dragon Rush");
    }

}
