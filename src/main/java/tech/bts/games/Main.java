package tech.bts.games;

import java.util.ArrayList;
import java.util.Arrays;
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

        int columnWidth = 10;

        List<String> fieldNames = Arrays.asList("Name", "Players", "Price");

        String title = "";
        for (String fieldName : fieldNames) {
            title += StringUtil.padRight(fieldName,columnWidth);
        }

        String dots = StringUtil.repeat("-",columnWidth * fieldNames.size());
        System.out.println(dots);
        System.out.println(title);
        System.out.println(dots);

        for (Game game : games) {
            String productline = StringUtil.padRight(game.getName(),columnWidth)
                    + StringUtil.padRight("" + game.getNumPlayers(), columnWidth)
                    + StringUtil.padRight("" + game.getPrice(), columnWidth);
            System.out.println(productline);
        }
        System.out.println(dots);
    }
}
