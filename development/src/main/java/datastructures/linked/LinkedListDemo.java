package datastructures.linked;

public class LinkedListDemo {

	Node head;

	public void addFirst(int val) {
		Node newNode = new Node();
		newNode.data = val;
		newNode.next = head;
		head = newNode;

	}

	public void addLast(int val) {
		Node newNode = new Node();
		newNode.data = val;
		newNode.next = null;

		if (head == null) {
			head = newNode;
		} else {
			Node lastNode = head;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
		}

	}

	public void delete(int key) {

		if (head.data == key) {
			head = head.next;
		} else {
			Node temp = head;
			while (temp.next != null) {
				if (temp.next.data == key) {
					temp.next = temp.next.next;
					break;
				} else {
					temp = temp.next;
				}
			}
		}

	}

	public boolean search(int key) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == key) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public void display() {
		System.out.println("displaying all elements in linkedlists");
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;

		}
		System.out.println();
	}

	public void initail() {
		Node head = new Node();
		Node middle = new Node();
		Node last = new Node();
		// set the values for nodes
		head.data = 10;
		middle.data = 20;
		last.data = 30;
		// assign the next to link the datas
		head.next = middle;
		middle.next = last;
		last.next = null;

		System.out.println("linked list created...");
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;

		}

	}

	public static void main(String[] args) {

		// initalize the linked list
		LinkedListDemo list = new LinkedListDemo();
		System.out.println("adding in the first....");
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		System.out.println("adding in the last....");
		list.addLast(100);
		list.display();
		System.out.println("deleting in the link....");
		list.delete(20);
		list.display();
		System.out.println("demo....");
		list.initail();
		System.out.println("searching the provided key....");
		int src = 30;
		boolean search = list.search(src);
		System.out.println("The provided key " + src + " is avialable :" + search);
		src = 160;
		search = list.search(src);
		System.out.println("The provided key " + src + " is avialable :" + search);

	}

}
