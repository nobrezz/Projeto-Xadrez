package chess.pieces;

import board.Board;
import board.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

    public Pawn(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {

        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0, 0);

        if (getColor() == Color.WHITE) {

            p.setValues(position.row - 1, position.column);
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.row][p.column] = true;
            }

        } else {

            p.setValues(position.row + 1, position.column);
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.row][p.column] = true;
            }
        }

        return mat;
    }

    @Override
    public String toString() {
        return "P";
    }
}
