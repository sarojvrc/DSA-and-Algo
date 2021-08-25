package practice;

public class InsertNodeatEnd2 {
	//create a Node
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//create head and tail
	public Node head;
	public Node tail;
	
	public void InsertEnd(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
			tail = newnode;
		}else {
			tail.next = newnode;
			tail = newnode;
		}
	}
	
	//print function
	public void print() {
		Node temp = head;
		System.out.println("New node inseting at end..");
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	//driver code
	public static void main(String args[]) {
		InsertNodeatEnd2 list = new InsertNodeatEnd2();
		list.InsertEnd(45);
		list.print();
		list.InsertEnd(52);
		list.print();
		list.InsertEnd(78);
		list.print();
	}

}
