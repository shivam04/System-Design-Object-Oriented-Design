package chess;

/**
 * Created by shivam.si on 21/12/20 6:15 pm
 */
public class Bishop extends Piece {

    public Bishop(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        if (end.getPiece().isWhite() == this.isWhite()) {
            return false;
        }

        return (Math.abs(start.getX()-end.getX()) == Math.abs(start.getY()-end.getY()));
    }
}
