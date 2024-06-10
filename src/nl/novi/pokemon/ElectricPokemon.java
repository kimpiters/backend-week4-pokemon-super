package nl.novi.pokemon;

public class ElectricPokemon extends Pokemon {
    String name;
    String sound;
    int hp;
    String food;

    public ElectricPokemon(String name, String sound, int hp, String food) {
        super(name, sound);

        this.name = name;
        this.hp = hp;
        this.food = food;
    }

    // Getters + Setters
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    //Methods
    @Override
    void attack() {
        System.out.println(name + " strikes with an electric attack");
    }

    public void takeGroundDamage() {
        this.hp -= 12;
        System.out.println(name + " takes ground damage, losing 12hp");
    }

    public void eat() {
        this.hp += 10;
        System.out.println(name + " eats " + food + " and gains 10hp");
    }
}
