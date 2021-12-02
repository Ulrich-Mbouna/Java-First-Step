package com.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<?> sl = new ArrayList<?>List;
		List<SoloP> slp = new ArrayList<SoloP>();
		
		sl = slp;
		
		System.out.println("VAleur 2 :" + sl.getVal1());

	}

}

class Solo<T> {
	private T val1;
	
	public T getVal1() {
		return this.val1;
	}
	public void setVal1(T newVal) {
		this.val1 = newVal;
	}
	
	public Solo() {
		this.val1 = null;
	}
	
	public Solo(T newVal) {
		this.val1 = newVal;
	}
}

class SoloP<S> extends Solo{
	private S val2;
	
	public S getVal1() {
		return this.val2;
	}
	public void setVal2(S newVal) {
		this.val2 = newVal;
	}
	
	public SoloP() {
		this.val2 = null;
	}
	
	public SoloP(S newVal) {
		this.val2 = newVal;
	}
}
