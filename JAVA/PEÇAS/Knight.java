package chess.pieces;

import board.Board;
import board.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

    public Knight(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {

        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0, 0);

        int[][] moves = {
            {-2,-1}, {-2,1},
            {-1,-2}, {-1,2},
            {1,-2}, {1,2},
            {2,-1}, {2,1}
        };

        for (int i = 0; i < moves.length; i++) {
            p.setValues(position.row + moves[i][0], position.column + moves[i][1]);

            if (getBoard().positionExists(p)) {
                mat[p.row][p.column] = true;
            }
        }

        return mat;
    }

    @Override
    public String toString() {
        return "N";
    }
}
