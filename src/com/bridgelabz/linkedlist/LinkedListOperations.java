package com.bridgelabz.linkedlist;
/*Problem Statement
 * UC-1 Lets create a simple Linked List of 56, 30 and 70
 */
class LinkedListOperations {
	Node head;
	static int counter = 0;
		//Method for Add Element in first position 
	public void insertFirst(int data) {
		Node newNode = new Node(data);			//create New node
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		counter++;					//Increement Counter
	}
		//Method for Display Element
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
