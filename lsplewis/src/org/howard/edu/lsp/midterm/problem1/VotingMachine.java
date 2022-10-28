package org.howard.edu.lsp.midterm.problem1;

import java.util.Scanner;

public class VotingMachine {
	static Scanner sc = new Scanner(System.in);
	public void main(String[] args) {
		int choice = 0;
		HashMap<String, Integer> votes = new LinkedHashMap<> ();
		do {
			System.out.println("1. Add Candidate");
			System.out.println("2. Cast Vote");
			System.out.println("3. View results");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: sc.nextLine();
					addCandidate(votes);
				break;
			case 2: castVote(votes);
				break;
			case 3: printResults(votes);
				break;
			case 4: break;
			default : System.out.println("Invalid choice");
			break;
			}
		}while(choice != 4);
	}
	public static void addCandidate(HashMap<String, Integer> votes)
	{
		System.out.println("Enter the name of the candidate");
		String name = sc.nextLine();
		votes.put(name, 0);
	}
	public static void castVote(HashMap<String, Integer> votes)
	{
		System.out.println("Below is the list of candidates");
		for(String n : votes.keySet())
		{
			System.out.println(n);
		}
		System.out.println("Enter candidate name to cast vote:");
		sc.nextLine();
		String candname = sc.nextLine();
		if(votes.containsKey(candname))
		{
			int vote = votes.get(candname);
			vote++;
			votes.put(candname, vote);
		}
		else
		{
			System.out.println("Enter valid candidate name.");
		}
	}
	public static void printResults(HashMap<String, Integer> votes)
	{
		System.out.println("Below are the votes each candidates got: ");
		if(votes.size() == 0)
		{
			System.out.println("Voter list is empty.");
		}
		for (Map.Entry<String,Integer> entry : votes.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + " got "+ value + " votes.");

		}
	}

}
