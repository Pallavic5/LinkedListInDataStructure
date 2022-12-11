package com.bridgelabz.linkedlist;
/*Problem Statement UC-3
 * Ability to create Linked List by appending 30 and 70 to 56
- Node with data 56 is First Created
- Next Append 30 to 56
- Finally Append 70 to 30
- LinkedList Sequence: 56->30->70
 */
import java.util.Scanner;
public class LinkedList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedListOperations list = new LinkedListOperations();
		int choice = 0;
		//infinite loop for choice
		do {
			System.out.println("1.InsertFirst\n2.InsertLast\n3.Display\n4.Exit");
			System.out.println("Enter Choice:");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Element:");
				list.insertFirst(scanner.nextInt());
				break;
			case 2:
				list.insertLast(scanner.nextInt());;
				System.out.println();
				break;
			case 3:
				list.display();
				System.out.println();
				break;
			case 4:
				System.out.println("Byeee!!");
				break;
			default:
				System.out.println("Select From Menu");
			}
		} while (choice != 4);
		scanner.close();
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
