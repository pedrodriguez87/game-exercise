package tech.bts.games;

public class Game {

    private String name;
    private double numPlayers;
    private double price;

    public Game(String name, double numPlayers, double price) {
        this.name = name;
        this.numPlayers = numPlayers;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getNumPlayers() {
        return numPlayers;
    }

    public double getPrice() {
        return price;
    }
}
