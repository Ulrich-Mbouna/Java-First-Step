package com.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedLIstc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l = new LinkedList();
		
		l.add(2);
		l.add("Mbouna");
		l.add(12.25f);
		
		for(int i=0; i< l.size();i++) {
			System.out.println("L'Element à l'index " + i +" est " +l.get(i));
		
		}
		System.out.println("Avec iterateur ========");
		
		ListIterator li = l.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}

	}

}
