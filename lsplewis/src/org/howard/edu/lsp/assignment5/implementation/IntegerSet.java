package org.howard.edu.lsp.assignment5.implementation;
import java.util.*;

public class IntegerSet {
	
	private ArrayList<Integer> list = new ArrayList<>();

	public IntegerSet(ArrayList list) {
		this.list = list; 
	}	
	public void clear() {
		list.clear();
	}
	public int length() {
		return list.size();
	}
		// TODO Auto-generated method stub
	public boolean equals(IntegerSet x) {
			
			ArrayList<Integer> list2=x.list;
			
			if(list.size()!=list2.size()) {
				return false;
			}
			
			ArrayList<Integer> temp1 = list;
			ArrayList<Integer> temp2 = list2;
			
			Collections.sort(temp1);
			Collections.sort(temp2);
			
			for(int i=0; i<temp1.size();i++) {
				if(temp1.get(i)!=temp2.get(i)) {
					return false;
				}
			}
			return true;
		}
		
		public int largest() throws IntegerSetException {
			
			if(list.size()==0) {
				IntegerSetException y = new IntegerSetException();
				throw y;
			}
		
		int max=0;
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i)>max) {
				max=list.get(i);
			}
		}
		
		return max;
		
	}

	public int smallest() throws IntegerSetException {
		if(list.size()==0) {
			IntegerSetException y = new IntegerSetException();
			throw y;
		}
		int min=Integer.MAX_VALUE; 
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)<min) {
				min=list.get(i);
			}
		}
		return min;
	}
	
	public void addIntItem(int item) {
		boolean exist=false;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==item) {
				exist=true;
			}
		}
		if(exist==false) {
			list.add(item);
		}
	}
	
	public void removeItem(int item ) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==item) {
				list.remove(i);
			}
		}
	}
	
	public IntegerSet union(IntegerSet list2) {
		ArrayList<Integer> temp=list2.getlist();
		
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        set.addAll(temp);      
        
        ArrayList<Integer> list3= new ArrayList<>(set); 
        
        IntegerSet list4 = new IntegerSet(list3);
        
        return list4;
	}
               
	public IntegerSet intersection(IntegerSet list2) {
		ArrayList<Integer> temp=list2.getlist();
		list.retainAll(temp);
		IntegerSet list4 = new IntegerSet(list);
		
		return list4;
	}
	
	public IntegerSet difference (IntegerSet list2) {
		ArrayList<Integer> temp=list2.getlist();
		list.removeAll(temp);
		IntegerSet list4= new IntegerSet(list);
		
		return list4;
	}
	
	public ArrayList<Integer> getlist() {
        return list;
	}
}
