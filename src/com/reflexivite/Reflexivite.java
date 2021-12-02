package com.reflexivite;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflexivite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class cl1 = String.class;
		Class cl2 = new String().getClass();
		
		
		
		System.out.println(cl1);
		System.out.println(cl2.getSuperclass());
		
		//list interfaces
		Class[] inter = cl2.getInterfaces();
		System.out.println("IL y a " + inter.length + " interfaces inplementées");
		
		for(int i = 0; i < inter.length; i++) {
			System.out.println(inter[i]);
		}
		
		//Liste des methodes
		Method[] m = cl2.getMethods();
		
		System.out.println("======== Liste des methodes");
		System.out.println("Il y a " + m.length + " methodes dans la classe String");
		
		for(int i = 0; i< m.length; i++) {
			
			
			System.out.println("\n"+m[i]);
			
			Class[] pa = m[i].getParameterTypes();
			
			for(int j = 0; j< pa.length; j++) {
				System.out.println("=== Types params "+ pa[j]);
			}
		}
		
		//Listes de variables de classes
		Field[] clvar = cl2.getDeclaredFields();
		
		System.out.println("===== Liste des variabe de classes \n" + "IL ya  " + clvar.length + " VAraible déclaré");
		
		for(int w = 0; w <clvar.length; w++) {
			System.out.println("=== Var de classes " + clvar[w].getName() );
		}
	}

}
