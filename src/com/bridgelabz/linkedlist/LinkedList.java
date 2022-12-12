package com.bridgelabz.linkedlist;
/*Problem Statement UC-9
 * Ability to delete 40 from the Linked List sequence of 56->30->40->70 and show the size of LinkedList is 3
 * Search LinkedList to find node with key value 40
- Delete the node
- Implement size() and show the Linked List size is 3
- Final Sequence: 56->30->70
 */
import java.util.Scanner;

public class LinkedList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedListOperations list = new LinkedListOperations();
		int choice = 0;
		// infinite loop for choice
		do {
			System.out.println(
					"1.InsertFirst\n2.InsertLast\n3.InsertNthPos\n4.RemoveFirst\n5.RemoveLast\n6.RemoveNthPosition\n7.SearchElement\n8.GetSize\n9.Display\n10.Exit");
			System.out.println("Enter Choice:");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Element:");
				list.insertFirst(scanner.nextInt());
				break;
			case 2:
				System.out.println("Enter Element:");
				list.insertLast(scanner.nextInt());
				break;
			case 3:
				System.out.println("Enter Element: and Position:");
				list.insertNthPosition(scanner.nextInt(), scanner.nextInt());
				break;
			case 4:
				list.removeFirst();
				break;
			case 5:
				list.removeLast();
				break;
			case 6:
				System.out.println("Enter a Position.");
				list.removeNthPosition(scanner.nextInt());
				break;
			case 7:
				System.out.println("Enter a element for Search:");
				list.searchNode(scanner.nextInt());
				break;
			case 8:
				list.getSize();
				break;
			case 9:
				list.display();
				System.out.println();
				break;
			case 10:
				System.out.println("Byeee!!");
				break;
			default:
				System.out.println("Select From Menu");
			}
		} while (choice != 10);
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
