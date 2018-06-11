package app.models;

public class Cat {

    private String name;
    private String breed;
    private String color;
    private int numberOfLegs;
    private User creator;

    public Cat(String name, String breed, String color, int numberOfLegs, User user) {
        this.setName(name);
        this.setBreed(breed);
        this.setColor(color);
        this.setNumberOfLegs(numberOfLegs);
        this.setCreator(user);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return this.color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    private void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public User getCreator() {
        return this.creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }
}
