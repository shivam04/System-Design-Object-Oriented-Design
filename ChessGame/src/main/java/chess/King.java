package chess;

/**
 * Created by shivam.si on 21/12/20 6:02 pm
 */
public class King extends Piece{

    private boolean castlingDone = false;

    public King(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        if (end.getPiece().isWhite() == this.isWhite()) {
            return false;
        }

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());

        if (x + y == 1) {
            return true;
        }

        return this.isValidCastling(board, start, end);
    }

    private boolean isValidCastling(Board board, Spot start, Spot end) {

        if (this.isCastlingDone()) {
            return false;
        }

        // Logic for returning true or false
        return true;
    }

    public boolean isCastlingDone() {
        return castlingDone;
    }

    public void setCastlingDone(boolean castlingDone) {
        this.castlingDone = castlingDone;
    }

    public boolean isCastlingMove(Spot start, Spot end) {
        Piece sourcePiece = start.getPiece();
        Piece destPiece = end.getPiece();
        if(destPiece == null || sourcePiece == null)
            return false;
        return (destPiece.isWhite() == sourcePiece.isWhite());
    }
}
