import java.util.*;

public class TypeC extends Thing {

    public TypeC(int row, int col){// type A constructor
        super(row, col);
        this.lab = 'y';
    }

    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3);


        if (i == 1) {
            rightTurn();
        }

        if (i == 2) {
            leftTurn();
        }
    }

}