package MGame;

import java.util.List;

public class Player {
    private String name;
    private List<Die> dieList;
    private Board board;
    private Piece piece;

    public Player(String name, Board board) {
        this.name = name;
        this.board = board;
    }

    public void takeTurn() {
        int fvTotal = 0;

        for (Die die : dieList) {
            die.roll();
            fvTotal += die.getFaceValue();
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTotal);
        piece.setLocation(newLoc);
    }

    public void setDieList(List<Die> dieList) {
        this.dieList = dieList;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
