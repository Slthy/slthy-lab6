import java.util.*;

public class TypeB extends Thing {

    private int timeSinceLast;

    public TypeB(int row, int col){// type B constructor
        super(row, col);
        super.lab = 'b';
        resetTimeSinceLast();
    }

    public void increaseTimeSinceLast(){
        this.timeSinceLast++;
    }

    public void resetTimeSinceLast(){
        this.timeSinceLast = 0;
    }

    public int getTimeSinceLast(){
        return this.timeSinceLast;
    }

    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3);

        increaseTimeSinceLast();

        if (getTimeSinceLast() == 10) {
            resetTimeSinceLast();

            if (i == 1) rightTurn();

            if (i == 2) leftTurn();
        }
        
    }
}