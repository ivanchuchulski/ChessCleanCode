package Chess.Pieces;

import Chess.Board.Move;
import Chess.Pieces.PieceEnums.PieceColor;
import Chess.Pieces.PieceEnums.PieceType;

public class King extends ChessPiece {

    public King(PieceColor color) {
        super(PieceType.King, color, validMoves(), false);
    }

    private static Move[] validMoves() {
        return new Move[]{new Move(1, 0, false, false), new Move(0, 1, false, false),
                new Move(-1, 0, false, false), new Move(0, -1, false, false),
                new Move(1, 1, false, false), new Move(1, -1, false, false),
                new Move(-1, 1, false, false), new Move(-1, -1, false, false)};
    }
}
