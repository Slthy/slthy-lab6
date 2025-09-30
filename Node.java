public class Node {
    private Thing data;
    private Node  next;

    public Node(Thing data){
        this.next = null;
        this.data = data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }

    public void setData(Thing data){
        this.data = data;
    }

    public Thing getData(){
        return this.data;
    }

    public void move(){
        data.maybeTurn();
        data.step();
    }

    public String toString(){
        return data.toString();
    }
}