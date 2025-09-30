import java.util.*;

public abstract class Thing {
    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.

    final int[] DC = { 0, 1, 0, -1 };
    final int[] DR = { 1, 0, -1, 0 };

    protected int row;
    protected int col;
    protected int dir;
    protected char lab;

    public Thing(int row, int col){// type A constructor
        this.row = row;
        this.col = col;
        this.dir = 0;
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
    

    public int getRow(){
        return this.row;
    }
    public int getCol(){
        return this.col;
    }
    public int getDir(){
        return this.dir;
    }
    public char getLab(){
        return this.lab;
    }

    public void rightTurn() {
        setDir((this.dir + 1) % 4);
    }
    public void leftTurn() {
        setDir((this.dir + 3) % 4);
    }

    public void step() {
        setRow(getRow() + DR[this.dir]);
        setCol(getCol() + DC[this.dir]);
    }

    public abstract void maybeTurn(Random rand);

    public String toString(){
        return getRow() + " " + getCol() + " " + getLab();
    }
}