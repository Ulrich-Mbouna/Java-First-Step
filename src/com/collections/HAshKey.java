package com.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HAshKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable ht = new Hashtable();
		
		ht.put(1, "Mbouna");
		ht.put(10, 52);
		
		Enumeration e = ht.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
