package chess;

public class ChessPosition {

    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected board.Position toPosition() {
        return new board.Position(8 - row, column - 'a');
    }

    public static ChessPosition fromPosition(board.Position position) {
        return new ChessPosition((char)('a' + position.column), 8 - position.row);
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
}
