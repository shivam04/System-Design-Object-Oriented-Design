package chess;

/**
 * Created by shivam.si on 21/12/20 6:12 pm
 */
public class Rook extends Piece{

    public Rook(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        if (end.getPiece().isWhite() == this.isWhite()) {
            return false;
        }

        return (start.getX() == end.getX() || start.getY() == end.getY());
    }
}
