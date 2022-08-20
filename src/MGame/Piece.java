package MGame;

public class Piece {
    private Square location;

    public void setLocation(Square newLoc) {
        this.location = newLoc;
    }

    public Square getLocation() {
        return location;
    }
}