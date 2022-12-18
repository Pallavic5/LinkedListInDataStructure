package com.bridgelabz.linkedlist;

import java.util.Scanner;

public class QueueDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		QueueOperation queue = new QueueOperation();
		int choice = 0;
		do {
		System.out.println("1.Enque\n2.Deque\n3.Display\n4.PEEK\n5.Exit");
		System.out.println("Enter Choice:");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
		System.out.println("Enter Element:");
		queue.enqueue(sc.nextInt());
		break;
		case 2:
		queue.dequeue();
		break;
		case 3:
		queue.display();
		break;
		case 4:
		queue.peek();
		break;
		case 5:
		System.out.println("Byeee!!");
		break;
		default:
		System.out.println("Select From Menu");
		}
		} while (choice != 5);
		
	}

}

class QueueOperation{
	
	final int SIZE = 5;
	int[] queue = new int[SIZE];
	int rear = -1;
	int front = -1;
	
	public boolean isFull() {
		
		return(rear >= SIZE - 1) ? true : false;
	}
	
	public void enqueue(int element) {
		
		if(isFull()) {
			System.out.println("Queue is Full!!");
		}
		else {
			
			rear++;
			queue[rear] =  element;
		}
	}
	
	public boolean isEmpty() {
		
		return(front == rear || front == SIZE - 1) ? true : false; 
	}
	
	public void dequeue() {
		
		if(isEmpty()) {
			System.out.println("Queue is Empty!!");
		}
		else {
			front++;
			System.out.println(queue[front]);
			queue[front] = 0;	
		}
	}
	
	public void peek() {
		if (isEmpty()) {
		System.out.println("Queue is Empty!!");
		} else {
		System.out.println(queue[rear]);
		//System.out.println(queue[front]);
		}
		}

		public void display() {
		if (isEmpty()) {
		System.out.println("Queue is Empty!!");
		} else {
		for (int i = queue.length - 1; i >= 0; i--) {
		System.out.println(queue[i] + " ");
		}
		}
		}
}
