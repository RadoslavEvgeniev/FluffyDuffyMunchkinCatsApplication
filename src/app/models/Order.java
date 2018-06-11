package app.models;

import java.time.LocalDateTime;

public class Order {

    private static int currentId = 1;

    private int id;
    private User client;
    private Cat cat;
    private LocalDateTime madeOn;

    public Order(User client, Cat cat) {
        this.setId(currentId++);
        this.setClient(client);
        this.setCat(cat);
        this.setMadeOn(LocalDateTime.now());
    }

    public int getId() {
        return this.id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public User getClient() {
        return this.client;
    }

    private void setClient(User client) {
        this.client = client;
    }

    public Cat getCat() {
        return this.cat;
    }

    private void setCat(Cat cat) {
        this.cat = cat;
    }

    public LocalDateTime getMadeOn() {
        return this.madeOn;
    }

    private void setMadeOn(LocalDateTime madeOn) {
        this.madeOn = madeOn;
    }
}
