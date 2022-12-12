package com.bridgelabz.linkedlist;
/*Problem Statement UC-9
 * Ability to delete 40 from the Linked List sequence of 56->30->40->70 and show the size of LinkedList is 3
 * Search LinkedList to find node with key value 40
- Delete the node
- Implement size() and show the Linked List size is 3
- Final Sequence: 56->30->70
 */
class LinkedListOperations {
	Node head;
	static int counter = 0; // take counter to calculate the number of nodes present in Linkedlist

	// Method for Add Element in first position
	public void insertFirst(int data) {
		Node newNode = new Node(data); // create New node
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		counter++; // Increement Counter
	}

	// Create method for insert element in last position
	public void insertLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		counter++;
	}

	// Create method for insert element in Nth Position
	public void insertNthPosition(int data, int pos) {
		Node newNode = new Node(data);
		if (head == null) {
			System.out.println("List is empty!!");
		} else if (pos <= 0 || pos > counter) {
			System.out.println("Invalid Position!!");
		} else if (pos == 1) {
			insertFirst(data);
		} else {
			Node temp = head;
			for (int i = 1; i < pos - 1; i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
		counter++;
	}

	// Method for delete first element
	public void removeFirst() {
		if (head == null) {
			System.out.println("List is Empty!!");
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null;
			temp = null;
		}
	}

	// Method for delete last element
	public void removeLast() {
		if (head == null) {
			System.out.println("List is empty!!");
		} else {
			Node temp = head;
			Node prev = null;
			while (temp.next != null) {
				prev = temp;
				temp = temp.next;
			}
			prev.next = null;
			temp = null;
		}
	}
		//Method for delete element from Nth Position
	public void removeNthPosition(int pos) {
		if (head == null) {
			System.out.println("List is empty!!");
		} else if (pos <= 0 || pos > counter) {
			System.out.println("Invalid Position!!");
		} else if (pos == 1) {
			removeFirst();
		} else {
			Node temp = head;
			Node prev = null;
			for (int i = 1; i < pos; i++) {
				prev = temp;
				temp = temp.next;
			}
			prev.next = temp.next;
			temp.next = null;
			temp = null;
		}
	}

	// Method for Display Element
	public void display() {
		if (head == null) {
			System.out.println("List is empty!!");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " --> ");
				temp = temp.next;
			}
		}
	}

	// method for search element
	public void searchNode(int data) {
		Node current = head;
		int i = 1;
		boolean flag = false;
		// Checks whether list is empty
		if (head == null) {
			System.out.println("List is empty");
		} else {
			while (current != null) {
				// Compares node to be found with each node present in the list
				if (current.data == data) {
					flag = true;
					break;
				}
				i++;
				current = current.next;
			}
		}
		if (flag)
			System.out.println("Element is present in the list at the position : " + i);
		else
			System.out.println("Element is not present in the list");
	}

	// method for getsize of linkedlist.
	public int getSize() {
		int count = 0;
		if (head == null)
			return count;
		else {
			Node temp = head;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
			System.out.println("Size is " + count);
			return count;
		}
	}
}
