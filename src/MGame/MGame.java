package MGame;

import java.util.ArrayList;
import java.util.List;

public class MGame {
    private int roundCat;
    private Board board;
    private List<Die> dieList;
    private List<Player> players;

    public MGame() {
        this.roundCat = 0;
        this.board = new Board();
        this.dieList = new ArrayList<Die>();
        this.players = new ArrayList<Player>();
    }

    public void playGame(int N) {
        for (; roundCat < N; roundCat++)
            playRound();
    }

    private void playRound() {
        for (Player player : players)
            player.takeTurn();
    }
}
