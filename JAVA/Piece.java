package board;

public abstract class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(int row, int column) {
        return possibleMoves()[row][column];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j]) return true;
            }
        }
        return false;
    }

    public Board getBoard() {
        return board;
    }
}
