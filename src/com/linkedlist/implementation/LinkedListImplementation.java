package com.linkedlist.implementation;

public class LinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		
		list.insert(45);
		list.insert(30);
		list.insert(15);
		list.insertAtStart(25);
		list.insertAtAnyIndex(2, 19);
		
		list.show();
	}

}
