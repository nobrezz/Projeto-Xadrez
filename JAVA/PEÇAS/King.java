package chess.pieces;

import board.Board;
import board.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0, 0);

        int[][] moves = {
                {-1,0},{1,0},{0,-1},{0,1},
                {-1,-1},{-1,1},{1,-1},{1,1}
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
        return "K";
    }
}
