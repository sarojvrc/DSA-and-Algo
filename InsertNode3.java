package practice;

public class InsertNode3 {
	
	//at first create a Node Class
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//create function for NewNode
	public Node head; //we created a head for linked list
	public void NewNode() {
		this.head = null; //we initialized the head with null value
	}
	
	public Node NewNode(int data) {
		//we will check if node is null or not
		if(head == null) {
			head = new Node(data);
		}else {
			//otherwise we will add new nodes to the next
			Node node = head;
			while(node.next != null) {
				node = node.next;
			}
			node.next = new Node(data);
		}
		return head;
	}
	
	//print the linked list
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	//driver class
	public static void main(String args[]) {
		InsertNode3 list = new InsertNode3();
		
		list.NewNode(41);
		list.NewNode(40);
		list.NewNode(87);
		
		list.print();
	}

}
