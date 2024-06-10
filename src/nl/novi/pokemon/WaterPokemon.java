package nl.novi.pokemon;

public class WaterPokemon extends Pokemon {
    String name;
    String sound;
    int hp;
    double weight;

    public WaterPokemon(String name, String sound, int hp, double weight) {
        super(name, sound);

        this.name = name;
        this.hp = hp;
        this.weight = weight;
    }

    // Getters + Setters
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //Methods
    @Override
    void attack() {
        System.out.println(name + " strikes with a water attack");
    }

    public void takeElectricDamage() {
        this.hp -= 15;
        System.out.println(name + " takes electric damage, losing 15hp");
    }

    public void dance() {
        System.out.println("Let's boogie!");
    }
}
