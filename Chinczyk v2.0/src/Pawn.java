public class Pawn {
    private final String COLOR;
    private int fieldNumber;

    public Pawn(String COLOR) {
        this.COLOR = COLOR;
        this.fieldNumber = -1;
    }

    public void move(int number) {
        fieldNumber += number;
        if (fieldNumber > 39) {
            fieldNumber -= 40;
        }
    }

    public boolean takePawnFromBoard(Board board, int field) {
        if (field > -1 && board.getFields().get(field) != Board.EMPTY_FIELD) {
            board.getFields().set(field, Board.EMPTY_FIELD);
            return true;
        } else return false;
    }

    public void putPawnOnBoard(Board board) {
        board.getFields().set(this.getFieldNumber(), this);
    }

    public boolean isInHome() {
        return this.fieldNumber == -1;
    }

    public int getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    @Override
    public String toString() {
            return this.COLOR;
    }

    public String getCOLOR() {
        return COLOR;
    }
}
