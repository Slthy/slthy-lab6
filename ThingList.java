import java.util.*;


public class ThingList {

	private class Node {
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

	    public void move(Random rand){
	        data.maybeTurn(rand);
	        data.step();
	    }

	    public String toString(){
	        return data.toString();
	    }
	}

	private Node head;

	public ThingList(){
		this.head = null;
	}

	public Node getHead(){
		return this.head;
	}

	public void setHead(Node node) {
		this.head = node;
	}


	public void addThing(Thing data){
		Node node = new Node(data);
		if (getHead() == null) {
			setHead(node);
		} else {
			Node current = head;
			while (current.getNext() != null) current = current.getNext();
			current.setNext(node);


		}
	}

	public String toString(){
		String output = "";
		
		for (Node current = head; current != null; current = current.getNext()) output += current.toString();

		return output;
	}

	public void printAll(){
		for (Node current = head; current != null; current = current.getNext()) System.out.println(current.toString());
	}


	public void moveAll(Random rand){
		for (Node current = head; current != null; current = current.getNext()) current.move(rand);
	}

}