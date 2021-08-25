package practice;

public class InsertNode1 {
	
	//create a Node
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//create InsertNewNode
	public Node head;
	public void InsertNewNode() {
		this.head = null;
	}
	
	public Node InsertNewNode(int data) {
		if(head == null) {
			head = new Node(data);
		}else {
			Node node = head;
			while(node.next != null) {
				node = node.next;
			}
			node.next = new Node(data);
		}
		return head;
	}
	
	//print function
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	//driver code
	public static void main(String args[]) {
		InsertNode1 list = new InsertNode1();
		list.InsertNewNode(12);
		list.InsertNewNode(13);
		list.InsertNewNode(15);
		list.print();
	}

}
