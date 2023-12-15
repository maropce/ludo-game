import java.util.*;

public class Main {
    public static void clearScreen() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }


    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("p1", Color.RED));
        players.add(new Player("p2", Color.BLUE));
        players.add(new Player("p3", Color.GREEN));
        players.add(new Player("p4", Color.YELLOW));


        Chinczyk chinczyk = new Chinczyk(players);

        while (true) {
            chinczyk.update();
            chinczyk.game();
        }

    }

}
