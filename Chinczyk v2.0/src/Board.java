import java.util.ArrayList;
import java.util.List;

public class Board {
    public static final Pawn EMPTY_FIELD = new Pawn(Color.WHITE);
    private static final int FIELDS_LENGTH = 40;

    private List<Pawn> fields;
    private String[][] board;

    public Board() {
        this.fields = new ArrayList<>();

        for (int i = 0; i < FIELDS_LENGTH; i++) {
            fields.add(EMPTY_FIELD);
        }
    }

    public void resetBoard() {
        fields = new ArrayList<>();
        for (int i = 0; i < FIELDS_LENGTH; i++) {
            fields.set(i, EMPTY_FIELD);
        }


    }

    public void updateBoard(List<Player> players) {
        board = new String[][]{
                {" ", " ", " ", " ", fields.get(38).toString(), fields.get(39).toString(), fields.get(0).toString(), " ", " ", " ", " "},
                {" ", " ", " ", " ", fields.get(37).toString(), " ", fields.get(1).toString(), " ", " ", " ", " "},
                {" ", " ", " ", " ", fields.get(36).toString(), " ", fields.get(2).toString(), " ", " ", " ", " "},
                {" ", " ", " ", " ", fields.get(35).toString(), " ", fields.get(3).toString(), " ", " ", " ", " "},
                {fields.get(30).toString(), fields.get(31).toString(), fields.get(32).toString(), fields.get(33).toString(), fields.get(34).toString(), " ", fields.get(4).toString(), fields.get(5).toString(), fields.get(6).toString(), fields.get(7).toString(), fields.get(8).toString()},
                {fields.get(29).toString(), " ", " ", " ", " ", " ", " ", " ", " ", " ", fields.get(9).toString()},
                {fields.get(28).toString(), fields.get(27).toString(), fields.get(26).toString(), fields.get(25).toString(), fields.get(24).toString(), " ", fields.get(14).toString(), fields.get(13).toString(), fields.get(12).toString(), fields.get(11).toString(), fields.get(10).toString()},
                {" ", " ", " ", " ", fields.get(23).toString(), " ", fields.get(15).toString(), " ", " ", " ", " "},
                {" ", " ", " ", " ", fields.get(22).toString(), " ", fields.get(16).toString(), " ", " ", " ", " "},
                {" ", " ", " ", " ", fields.get(21).toString(), " ", fields.get(17).toString(), " ", " ", " ", " "},
                {" ", " ", " ", " ", fields.get(20).toString(), fields.get(19).toString(), fields.get(18).toString(), " ", " ", " ", " "},
        };
    }

    public void printBoard() {
        Main.clearScreen();
        for (String[] strings : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();
        }
    }

    public List<Pawn> getFields() {
        return fields;
    }
}
