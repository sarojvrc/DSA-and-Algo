package practice;

public class FindmidinLinkedlist {
	
	//create a Node
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//InsertNew
	public Node head;
	public void InsertNew() {
		this.head = null;
	}
	public Node InsertNew(int data) {
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
	
	//FindMid
	public void FindMid() {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("The mid of list is "+slow.data);
	}
	
	//print
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	//driver code
	public static void main(String args[]) {
		FindmidinLinkedlist list = new FindmidinLinkedlist();
		list.InsertNew(42);
		list.InsertNew(72);
		list.InsertNew(22);
		list.InsertNew(10);
		list.InsertNew(98);
		list.print();
		list.FindMid();
	}
}
