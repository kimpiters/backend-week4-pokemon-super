package nl.novi.pokemon;

public class GrassPokemon extends Pokemon {
    String name;
    String sound;
    int hp;
    int accuracy;

    public GrassPokemon(String name, String sound, int hp, int accuracy) {
        super(name, sound);

        this.name = name;
        this.hp = hp;
        this.accuracy = accuracy;
    }

    // Getters + Setters
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getFood() {
        return accuracy;
    }

    public void setFood(int accuracy) {
        this.accuracy = accuracy;
    }

    //Methods
    @Override
    void attack() {
        System.out.println(name + " strikes with a grass attack");
    }

    public void takeFireDamage() {
        this.hp -= 20;
        System.out.println(name + " takes fire damage, losing 20hp");
    }

    public void photosynthesize() {
        this.hp += 20;
        System.out.println(name + " photosynthesizes and gains 20hp");
    }
}
