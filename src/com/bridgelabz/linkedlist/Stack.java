package com.bridgelabz.linkedlist;
import java.util.Scanner;
class Node {
	int data;
	Node next;

	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
}
class StackNew{
	Node top = null;

	public void push(int data) {
		Node newNode = new Node(data);
		if (top == null) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
	}
	public void pop() {
		if (top == null) {
			System.out.println("Stack is Empty");
		} else {
			Node temp = top;
			top = top.next;
			temp.next = null;
			temp = null;
		}
	}

	public void display() {
		if (top == null) {
			System.out.println("Stack is Empty!");
		} else {
			Node temp = top;
			while (temp != null) {
				System.out.print(temp.data + "---->");
				temp = temp.next;
			}
		}
	}
}
public class Stack {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	StackNew stack = new StackNew();
	int choice = 0;
	do {
		System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
		System.out.println("Enter your Choice: ");
		choice = scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter an element: ");
			stack.push(scanner.nextInt());
			break;
		case 2:
			stack.pop();
			break;
		case 3:
			stack.display();
			System.out.println();
			break;
		case 4:
			System.out.println("Byee!!");
			break;
		default:
			System.out.println("Select from menu.");
		}
	}while(choice != 4);
	scanner.close();
	
}
}


