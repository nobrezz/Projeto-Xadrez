package chess.pieces;

import board.Board;
import board.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {

    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {

        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0, 0);

        // movimentos da torre + bispo

        // vertical cima
        p.setValues(position.row - 1, position.column);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.row][p.column] = true;
            p.setValues(p.row - 1, p.column);
        }

        // vertical baixo
        p.setValues(position.row + 1, position.column);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.row][p.column] = true;
            p.setValues(p.row + 1, p.column);
        }

        // horizontal esquerda
        p.setValues(position.row, position.column - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.row][p.column] = true;
            p.setValues(p.row, p.column - 1);
        }

        // horizontal direita
        p.setValues(position.row, position.column + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.row][p.column] = true;
            p.setValues(p.row, p.column + 1);
        }

        // diagonais (bispo)
        int[][] dirs = {
            {-1,-1}, {-1,1}, {1,-1}, {1,1}
        };

        for (int i = 0; i < dirs.length; i++) {
            p.setValues(position.row + dirs[i][0], position.column + dirs[i][1]);

            while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.row][p.column] = true;
                p.setValues(p.row + dirs[i][0], p.column + dirs[i][1]);
            }
        }

        return mat;
    }

    @Override
    public String toString() {
        return "Q";
    }
}
