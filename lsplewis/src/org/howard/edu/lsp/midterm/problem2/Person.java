package org.howard.edu.lsp.midterm.problem2;

public class Person {
	private String name;
	private int age;
	private String socialSecurityNumber; 
	
	public Person (String name, String socialSecurityNumber, int age) {
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.age = age;
	}
	
	@Overriide
	public String toString() {
		return "name: " + name + ", socialSecurityNumber: " + socialSecurityNumber + ",Age: " + age; 
	}
	
	public class TestPerson {
		public static void main(String[] args) {
			Person firstp = new Person("name1", "111-11-1111", 32);
			Person secondp = new Person("name2", "111-11-1111", 24);
			System.out.println(firstp);
			System.out.println(secondp);
			System.out.println(firstp.equals(secondp));
		}
	}
}

