package tech.bts.games;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Game> games = new ArrayList<Game>();

        Game g1 = new Game("Zelda",1,65);
        Game g2 = new Game("MarioKart",4,70);
        Game g3 = new Game("LegoCity",2, 20);
        Game g4 = new Game("GTA",2,70);

        games.add(g1);
        games.add(g2);
        games.add(g3);
        games.add(g4);

        for (Game game : games) {
            System.out.println(game.getName() + ", " + game.getNumPlayers() + " players, " + game.getPrice() + "$");
        }
    }
}
