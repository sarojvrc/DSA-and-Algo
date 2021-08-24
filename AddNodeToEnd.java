package practice;

public class AddNodeToEnd {
	
	//Node Class
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	// create head/tail
	public Node head;
	public Node tail;
	
	//create a function for AddNode
	public void AddNode(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
			tail = newnode;
		}else {
			tail.next = newnode;
			tail = newnode;
		}
	}
	
	//print the node
	public void print() {
		Node temp = head;
		if(head == null) {
			System.out.println("Empty List");
		}else {
			System.out.println("New element adding in last..");
			while(temp != null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
		System.out.println();
	}
	
	//driver code
	public static void main(String args[]) {
		AddNodeToEnd list = new AddNodeToEnd();
		list.AddNode(41);
		list.print();
		System.out.println("Here head is "+list.head.data+" and tail is "+list.tail.data);
		list.AddNode(10);
		list.print();
		System.out.println("Here head is "+list.head.data+" and tail is "+list.tail.data);
		list.AddNode(471);
		list.print();
		System.out.println("Here head is "+list.head.data+" and tail is "+list.tail.data);
	}

}
