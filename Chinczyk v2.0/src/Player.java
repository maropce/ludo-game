import java.util.ArrayList;
import java.util.List;

public class Player {
    private static final int NUMBER_OF_PAWNS = 4;
    private final String name;
    private final String COLOR_OF_PAWNS;
    private List<Pawn> pawns;



    public Player(String name, String COLOR_OF_PAWNS) {
        this.name = name;
        this.COLOR_OF_PAWNS = COLOR_OF_PAWNS;

        this.pawns = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_PAWNS; i++) {
            pawns.add(new Pawn(COLOR_OF_PAWNS));
        }
    }

    public String getName() {
        return name;
    }

    public List<Pawn> getPawns() {
        return pawns;
    }
}
