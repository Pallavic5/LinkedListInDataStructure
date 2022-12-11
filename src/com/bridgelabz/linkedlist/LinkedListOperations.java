package com.bridgelabz.linkedlist;
/*Problem Statement UC-4
 * Ability to insert 30 between 56 and 70
- Final Sequence: 56->30->70
 */
class LinkedListOperations {
	Node head;
	static int counter = 0;			//take counter to calculate the number of nodes present in Linkedlist

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
	//Create method for insert element in Nth Position
		public void insertNthPosition(int data, int pos) {
			Node newNode = new Node(data);
			if(head == null) {
				System.out.println("List is empty!!");
			}
			else if(pos <= 0 || pos > counter) {
				System.out.println("Invalid Position!!");
			}
			else if(pos == 1) {
				insertFirst(data);
			}
			else {
				Node temp = head;
				for(int i = 1; i < pos - 1 ; i++) {
					temp = temp.next;
				}
				newNode.next = temp.next;
				temp.next = newNode;
			}
			//counter++;
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
		

}
