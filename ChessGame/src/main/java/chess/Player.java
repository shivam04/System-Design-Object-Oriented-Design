package chess;

/**
 * Created by shivam.si on 21/12/20 6:21 pm
 */
public abstract class Player {
    public boolean whiteSide;
    public boolean humanPlayer;

    public boolean isWhiteSide() {
        return this.whiteSide;
    }
    public boolean isHumanPlayer() {
        return this.humanPlayer;
    }
}
