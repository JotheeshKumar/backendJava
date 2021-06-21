package datastructures.doublylinked;

public class DoublyLinkedDemo {
	Node head;
	Node last;

	public void initaial() {
		Node head = new Node();
		Node middle = new Node();
		Node last = new Node();

		head.data = 10;
		middle.data = 20;
		last.data = 30;

		head.next = middle;
		middle.next = last;
		last.next = null;
		head.prev = null;
		middle.prev = head;
		last.prev = middle;
	}

	public void addFirst(int val) {
		Node newNode = new Node();
		newNode.data = val;

		if (head == null) {
			newNode = head;
			newNode.prev = null;
			newNode.next = null;
		} else {
			newNode.prev = null;
			newNode.next = head;
			head.prev = newNode;
			newNode = head;
		}

	}

	public void addLast(int val) {
		Node newNode = new Node();
		newNode.data = val;
		newNode.next = null;

		if (head == null) {
			head.next = null;
			head.prev = null;
			head = newNode;
		} else {
			Node lastNode = head;

			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}

			lastNode.next = newNode;
			lastNode.prev=lastNode;
			newNode.next=null;
		}
	}

	void print() {
		Node temp;
		System.out.println("forward traversal...");
		temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

		System.out.println("backward traversal...");
		temp = last;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.prev;
		}
	}

	public static void main(String[] args) {

		DoublyLinkedDemo sc = new DoublyLinkedDemo();
		sc.addFirst(40);
		sc.addFirst(30);
		sc.addFirst(20);
		sc.addFirst(10);
		sc.addLast(50);
		sc.print();

	}

}
