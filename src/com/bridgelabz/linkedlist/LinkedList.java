package com.bridgelabz.linkedlist;
/*Problem Statement
 * UC-1 Lets create a simple Linked List of 56, 30 and 70
 */
import java.util.Scanner;
public class LinkedList {
	private static int data;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedListOperations list = new LinkedListOperations();
		int choice = 0;
		//infinite loop for choice
		do {
			System.out.println("1.InsertFirst\n2.Display\n3.Exit");
			System.out.println("Enter Choice:");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Element:");
				list.insertFirst(scanner.nextInt());
				break;
			case 2:
				list.display();
				System.out.println();
				break;
			case 3:
				System.out.println("Byeee!!");
				break;
			default:
				System.out.println("Select From Menu");
			}
		} while (choice != 3);
	}

}
//create Node Class
class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
