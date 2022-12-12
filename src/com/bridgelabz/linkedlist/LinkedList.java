package com.bridgelabz.linkedlist;
/*Problem Statement UC-7
 * Ability to search LinkedList to find Node with value 30
 */
import java.util.Scanner;
public class LinkedList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedListOperations list = new LinkedListOperations();
		int choice = 0;
		//infinite loop for choice
		do {
			System.out.println("1.InsertFirst\n2.InsertLast\n3.InsertNthPos\n4.RemoveFirst\n5.RemoveLast\n6.SearchElement\n7.Display\n8.Exit");
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
				System.out.println("Enter a element for Search:");
				list.searchNode(scanner.nextInt());
				System.out.println();
				break;
			case 7:
				list.display();
				System.out.println();
				break;
			case 8:
				System.out.println("Byeee!!");
				break;
			default:
				System.out.println("Select From Menu");
			}
		} while (choice != 8);
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
