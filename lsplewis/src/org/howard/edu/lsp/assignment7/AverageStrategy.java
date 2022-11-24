package org.howard.edu.lsp.assignment7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

class EmptyListException extends Exception {
	public EmptyListException() {
		}
}

public interface AverageStrategy {
    public int compute(List<Integer> grades) throws EmptyListException;
}


class Strategy1 implements AverageStrategy {
	@Override
	public int compute(List<Integer> grades) throws EmptyListException {
		if(grades == null || grades.size() < 1) {
			throw new EmptyListException();
			}
		
		int count = 0;
		int sum = 0;
		Collections.sort(grades);
		for(int i=0; i<grades.size(); i++) {
			sum += grades.get(i);
			count++;
                } 
		return sum/count;
		}      
}
class Strategy2 implements AverageStrategy {
	@Override
	public int compute(List<Integer> grades) throws EmptyListException {
		if(grades == null || grades.size() <= 2) {
			throw new EmptyListException();
			} 
		int count = 0;
		int sum = 0;
		Collections.sort(grades);
		for(int i=2; i<grades.size(); i++) {
			sum += grades.get(i);
			count++;
			}
		return sum/count;
		}       
}

public class AvgTest {
	@Test
	public void testStrategy1() {
		AverageStrategy as = new Strategy1();
		try {
			assertEquals(2, as.compute(Arrays.asList(1, 2, 3)));
			} 
		catch (EmptyListException e) {
			fail();
			}
		}
	
	@Test
	public void testStrategy2() {
		AverageStrategy as = new Strategy2();
		try {
			assertEquals(3, as.compute(Arrays.asList(1, 2, 3)));
			} 
		catch (EmptyListException e) {
			fail();
			}
		}
	
	@Test
	public void testStrategy1Exce() {
		AverageStrategy as = new Strategy1();
		try {
			as.compute(Arrays.asList());
			fail();
			} 
		catch (EmptyListException e) {	
		}
	}
	
	@Test
	public void testStrategy2Exce() {
		AverageStrategy as = new Strategy2();
		try {
			as.compute(Arrays.asList());
			fail();
			} 
		catch (EmptyListException e) {
		}
		}

}