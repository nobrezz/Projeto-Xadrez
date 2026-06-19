package chess.pieces;

import board.Board;
import board.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {

        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        // cima
        p.setValues(position.row - 1, position.column);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.row][p.column] = true;
            p.row--;
        }

        return mat;
    }

    @Override
    public String toString() {
        return "R";
    }
}
