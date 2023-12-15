import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Chinczyk {
    private List<Player> players;
    private Board board;
    private int dice;

    public Chinczyk(List<Player> players) {
        this.players = players;
        this.board = new Board();
    }

    public int rollTheDice() {
        return new Random().nextInt(6)+1;
    }

    public void update() {
        board.updateBoard(players);
        board.printBoard();
    }

    public void game() {
        board.printBoard();
        Scanner sc = new Scanner(System.in);
        for (Player player : players) {
            System.out.println(player.getName() + " turn...");
            dice = rollTheDice();
            System.out.println(player.getName() + " draw " + dice);
            System.out.print("Choose your pawn by number of field to move: ");

            int fieldOfPawn = sc.nextInt();

            for (Pawn pawn : player.getPawns()) {
                if ((fieldOfPawn == -1) && (dice == 6) && (pawn.isInHome())) {  //-1 AND PAWN IS IN HOME IS THE SAME STATE
                    pawn.setFieldNumber(0);
                    pawn.putPawnOnBoard(board);
                    break;
                } else if ((fieldOfPawn > -1) && (!pawn.isInHome()) && pawn.getFieldNumber() == fieldOfPawn) {
                    pawn.takePawnFromBoard(board, fieldOfPawn);
                    pawn.move(dice);
                    pawn.putPawnOnBoard(board);
                    break;
                }
            }
            update();
        }
    }

}
