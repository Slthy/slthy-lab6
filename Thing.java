import java.util.*;

public class Thing {
    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.

    final int[] DC = { 0, 1, 0, -1 };
    final int[] DR = { 1, 0, -1, 0 };

    private int  row, col, dir, timeSinceLast;
    private char lab;
    protected boolean isTypeB;

    public Thing(int row, int col){// type A constructor
        this.row = row;
        this.col = col;
        this.dir = 0;
        this.lab = 'r';
        this.isTypeB = false;
    }

    public Thing(int row, int col, boolean isTypeB){// type B constructor
        this(row, col);
        this.lab = 'b';
        setTypeB();
        resetTimeSinceLast();
    }

    public void setRow(int row){
        this.row = row;
    }
    public void setCol(int col){
        this.col = col;
    }
    public void setDir(int dir){
        this.dir = dir;
    }
    public void setLab(char lab){
        this.lab = lab;
    }
    public void setTypeB(){
        this.isTypeB = !isTypeB;
    }

    public void increaseTimeSinceLast(){
        this.timeSinceLast++;
    }

    public void resetTimeSinceLast(){
        this.timeSinceLast = 0;
    }

    public int getRow(){
        return this.row;
    }
    public int getCol(){
        return this.col;
    }
    public int getDir(){
        return this.dir;
    }
    public int getTimeSinceLast(){
        return this.timeSinceLast;
    }
    public char getLab(){
        return this.lab;
    }
    public boolean getTypeB(){
        return this.isTypeB;
    }

    public void rightTurn() {
        setDir((this.dir + 1) % 4);
    }

    public void leftTurn() {
        setDir((this.dir + 3) % 4);
    }

    public void step() {
        setRow(DR[this.dir]);
        setCol(DC[this.dir]);
    }

    public void maybeTurn() {
        Random rand = new Random(System.currentTimeMillis());;
        int i = rand.nextInt(3);

        if (getTypeB()) {
            increaseTimeSinceLast();

            if (getTimeSinceLast() == 10) {
                resetTimeSinceLast();

                if (i == 1) rightTurn();

                if (i == 2) leftTurn();
            }
        } else {
            if (i == 1) rightTurn();

            if (i == 2) leftTurn();
        }
    }

    public String toString(){
        return getRow() + " " + getCol() + " " + getLab();
    }
}