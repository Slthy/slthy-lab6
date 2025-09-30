import java.util.*;

public class TypeA extends Thing {

    public TypeA(int row, int col){// type A constructor
        super(row, col);
        this.lab = 'r';
    }

    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3);


        if (i == 1) {
            rightTurn();
            step();
            rightTurn();
            step();
            rightTurn();
            step();
        }

        if (i == 2) {
            leftTurn();
            leftTurn();
            
            step();
            step();

            leftTurn();
            leftTurn();

            step();
            step();
        }
    }

}