import chess.*;

import java.util.List;

/**
 * Created by shivam.si on 21/12/20 6:24 pm
 */
public class Game {
    private Player[] players;
    private Board board;
    private Player currentTurn;
    private GameStatus status;
    private List<Move> movesPlayed;

    private void initialize(Player p1, Player p2) {
        players[0] = p1;
        players[1] = p2;
        board.resetBoard();

        if (p1.isWhiteSide()) {
            this.currentTurn = p1;
        }
        else {
            this.currentTurn = p2;
        }

        movesPlayed.clear();
    }

    public boolean isEnd() {
        return this.getStatus() != GameStatus.ACTIVE;
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public boolean playerMove(Player player, int startX, int startY, int endX, int endY) throws Exception {
        Spot startBox = board.getBox(startX, startY);
        Spot endBox = board.getBox(endX, endY);
        Move move = new Move(player, startBox, endBox);
        return this.makeMove(move, player);
    }

    private boolean makeMove(Move move, Player player) {
        Piece sourcePiece = move.getStart().getPiece();
        if (sourcePiece == null) {
            return false;
        }

        if (player != currentTurn) {
            return false;
        }

        if (sourcePiece.isWhite() != player.isWhiteSide()) {
            return false;
        }

        if (!sourcePiece.canMove(board, move.getStart(), move.getEnd())) {
            return false;
        }

        Piece destPiece = move.getEnd().getPiece();

        if (sourcePiece != null && sourcePiece instanceof King) {
            if(((King) sourcePiece).isCastlingMove(move.getStart(), move.getEnd()))
                move.setCastlingMove(true);
        }
        movesPlayed.add(move);
        move.getEnd().setPiece(move.getStart().getPiece());
        if(move.isCastlingMove()) {
            move.getStart().setPiece(destPiece);
        } else {
            move.getStart().setPiece(null);
        }

        if (destPiece != null && destPiece instanceof King) {
            if (player.isWhiteSide()) {
                this.setStatus(GameStatus.WHITE_WIN);
            }
            else {
                this.setStatus(GameStatus.BLACK_WIN);
            }
        }

        if (this.currentTurn == players[0]) {
            this.currentTurn = players[1];
        } else {
            this.currentTurn = players[0];
        }

        return true;
    }

    private void setStatus(GameStatus whiteWin) {
        this.status = status;
    }
}
