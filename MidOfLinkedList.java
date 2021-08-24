package practice;

public class MidOfLinkedList {
	
	//create a NOde
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//insert a InsertNode
	public Node head;
	public void InsertNode() {
		this.head = null;
	}
	public Node InsertNode(int data) {
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
	
	//find the mid
	public void FindMid() {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("The mid of the list is "+slow.data);
	}
	
	//print
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MidOfLinkedList list = new MidOfLinkedList();
		list.InsertNode(45);
		list.InsertNode(485);
		list.InsertNode(455);
		list.InsertNode(478);
		list.InsertNode(95);
		list.InsertNode(482);
		list.InsertNode(905);
		
		list.print();
		
		list.FindMid();

	}

}
