package chess;

/**
 * Created by shivam.si on 21/12/20 6:21 pm
 */
public class HumanPlayer extends Player{

    public HumanPlayer(boolean whiteSide) {
        this.whiteSide = whiteSide;
        this.humanPlayer = true;
    }
}
