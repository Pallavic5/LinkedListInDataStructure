package com.bridgelabz.linkedlist;
/*Problem Statement UC - 10
 * Ability to create Ordered Linked List in ascending order of data entered
	in following sequence 56, 30, 40, and 70.
	Create Node that takes data that is
	Comparable
 */
public class SortedLinkedList implements Comparable<SortedLinkedList> {
	//variables
	int data;
	Node next;
			//parameterized Constructor
	public SortedLinkedList(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
		//generate getter setter method
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "SortedLinkedList [data=" + data + ", next=" + next + "]";
	}
	/*
	 * here override compareTo method.
	 * if first object is greater than second object than its return 1 else return -1.
	 */
	@Override
	public int compareTo(SortedLinkedList object) {
		if (this.getData() > object.getData()) {
			return 1;					
		} else {
			return -1;
		}

	}

}
