package MGame;

import java.util.Random;

public class Die {
    private int faceValue;

    public Die() {
        this.faceValue = roll();
    }

    public int roll(){
        return new Random().nextInt(6)+1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
