package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment2_Solution {
	
	// already existing database
	String listOfUsersEmail[] = {"ramesh@gmail.com",
			           "suresh@yahoo.com",
			           "kapil@gmail.com",
			           "mayank@linkedin.com",
			           "neha@linkedin.com",
			           "sumer@gmail.com",
			           "shana@linked.in",
			           "navya@gmail.com"};

	
	public static void main(String[] args) {
		 // user layer code 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the domain to be checked :- ");
		String searchedDomain = sc.nextLine();
		
		Assignment2_Solution businessOperation = new Assignment2_Solution();
	
		List<String> usersOfSerachedDomain  = businessOperation.filterEmailByDomainName(searchedDomain);
		
		System.out.println(" Users related to "+searchedDomain+" ");
		System.out.println("----------------------------------------------");
		
		if(usersOfSerachedDomain != null)
		{
			for (String user : usersOfSerachedDomain) {
				System.out.println(user);
			}
		}
		else
		{
			System.out.println(" No user for "+searchedDomain+" domain");
		}
		
		
		
	}
	
	// Business Operations is the Server code
	
	public List<String> filterEmailByDomainName(String searchedDomainName)
	{
		 // business operation
		
		List<String> resultList = new ArrayList<>();
		
			
		for (String userEmail : listOfUsersEmail) {
			if(userEmail.endsWith(searchedDomainName))
			{
				resultList.add(userEmail);
			}
			
		}//end for
		
		if(resultList.size() == 0) return null;
		else return resultList;
		
		
	}//end method
	


}


