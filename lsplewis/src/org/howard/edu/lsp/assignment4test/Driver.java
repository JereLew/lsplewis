package org.howard.edu.lsp.assignment4test;
import java.util.*;

public class Driver {

	public static void main(String[] args) throws IntegerSetException {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1= new ArrayList<>();
		ArrayList<Integer> list2= new ArrayList<>();
		
		IntegerSet set1= new IntegerSet(list1);
		
		set1.addItem(1);
		set1.addItem(2);
		set1.addItem(3);
		  
		System.out.println("Value of Set1 is: "+ set1.toString());
		System.out.println("Smallest value in Set1 is: "+ set1.smallest());
		System.out.println("Largest value in Set1 is: "+ set1.largest());
		
		IntegerSet set2= new IntegerSet(list2);
		
		set2.addItem(4);
		set2.addItem(5);
		set2.addItem(6);
		
		System.out.println("Union of Set1 and Set2");
		System.out.println("Value of Set2 is: "+ set2.toString());
		
		IntegerSet uni= set1.union(set2); 
	    System.out.println("Unoin : " +uni.getlist() );
	    
	    

	}

}
