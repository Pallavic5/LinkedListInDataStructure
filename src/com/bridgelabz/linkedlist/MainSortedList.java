package com.bridgelabz.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class MainSortedList {

	public static void main(String[] args) {
		LinkedList<Integer> linkedlist = new LinkedList<>();
		linkedlist.add(56);
		linkedlist.add(30);
		linkedlist.add(40);
		linkedlist.add(70);
		System.out.println("Unsorted List" + linkedlist);
		Collections.sort(linkedlist);		//use sort method
		System.out.println("Sorted List");
		//traversing linkedlist
		for (Integer i : linkedlist) {
			System.out.print(i + "-> ");
		}

	}

}
