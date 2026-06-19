package chess.pieces;

import board.Board;
import board.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

    public Bishop(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {

        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0, 0);

        // diagonal cima-esquerda
        p.setValues(position.row - 1, position.column - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.row][p.column] = true;
            p.setValues(p.row - 1, p.column - 1);
        }

        // diagonal cima-direita
        p.setValues(position.row - 1, position.column + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.row][p.column] = true;
            p.setValues(p.row - 1, p.column + 1);
        }

        // diagonal baixo-esquerda
        p.setValues(position.row + 1, position.column - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.row][p.column] = true;
            p.setValues(p.row + 1, p.column - 1);
        }

        // diagonal baixo-direita
        p.setValues(position.row + 1, position.column + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.row][p.column] = true;
            p.setValues(p.row + 1, p.column + 1);
        }

        return mat;
    }

    @Override
    public String toString() {
        return "B";
    }
}
