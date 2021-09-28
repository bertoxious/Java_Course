class LinkedList{

	class Node{

		int element;
		Node next;

		Node(int e, Node n){
			this.element = e;
			this.next = n;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	LinkedList(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public int length(){
		return size;
	}

	public boolean isEmpty(){
		return size == 0;
	}

	public void addLast(int e){
		Node newest = new Node(e, null);
		if (isEmpty()){
			
			head = newest;
		}
		else{
			
			tail.next = newest;
		}
		tail = newest;
		size = size + 1;
	}

	public void display(){
		Node p = head;
		while (p != null){
			System.out.print(p.element + "-->> ");
			p = p.next;
		}
	}

	public static void main(String [] args){
		LinkedList ll = new LinkedList();
		ll.addLast(12);
		ll.addLast(123);
		ll.addLast(45);
		ll.addLast(435);
		ll.display();
		System.out.println("Size of the linked list is :: "+ ll.length());
	}

}