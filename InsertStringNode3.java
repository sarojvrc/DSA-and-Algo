package practice;

public class InsertStringNode3 {
	
	//create a Node Class first
	class Node{
		String data;
		Node next;
		public Node(String data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//create a function for InsertString
	public Node head;
	public void InsertString() {
		this.head = null;
	}
	public Node InsertString(String data) {
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
		InsertStringNode3 list = new InsertStringNode3();
		
		list.InsertString("yeah");
		list.InsertString("it's");
		list.InsertString("working");
		
		list.print();
	}

}
