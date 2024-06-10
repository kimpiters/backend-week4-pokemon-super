package nl.novi.pokemon;

abstract public class Pokemon {
    String name;
    String sound;

    public Pokemon(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    // Getters + Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    // Methods
    void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    abstract void attack();
}
