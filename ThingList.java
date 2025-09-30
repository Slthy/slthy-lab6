public class ThingList {
	Node head;

	public void ThingList(){
		this.head = null;
	}

	public Node getHead(){
		return this.head;
	}

	public void setHead(Node node) {
		this.head = node;
	}


	public void addNode(Node node){
		if (getHead() == null) {
			setHead(node);
		} else {
			Node current = head;
			for (; current.getNext() != null; current = current.getNext())
			current.setNext(node);
		}
	}

	public String toString(){
		String output = "";
		
		for (Node current = head; current != null; current = current.getNext()) output += current.toString();

		return output;
	}

	public void moveAll(){
		for (Node current = head; current != null; current = current.getNext()) current.move();
	}

}