package MGame;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private static final int AREA = 40;
    private List<Square> squares;

    public Board() {
        this.squares = new ArrayList<>();
    }

    public Square getSquare(Square oldLoc, int fvTotal) {
        int currentLocation = 0;

        for (int i =0; i < AREA; i++) {
            if (oldLoc.equals(squares.get(i)))
                currentLocation = i;
        }

        int newLocation = currentLocation + fvTotal;

        if (newLocation > 40)
            newLocation %= 40;

        return squares.get(newLocation);
    }
}
