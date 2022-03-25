package task1;

import java.util.Scanner;

public class Assignment2 {
	
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
		
		Assignment2 businessOperation = new Assignment2();
	
		String usersOfSerachedDomain[]  = businessOperation.filterEmailByDomainName(searchedDomain);
		
		System.out.println(" Users related to "+searchedDomain+" ");
		System.out.println("----------------------------------------------");
		for (String user : usersOfSerachedDomain) {
			System.out.println(user);
		}
		
	}
	
	// Business Operations is the Server code
	public String[] filterEmailByDomainName(String searchedDomainName)
	{
		 // business operation
		String resultArr[] = new String[100]; // becoz we dont know the actual amount of data
		int index = 0;
		
		for (String userEmail : listOfUsersEmail) {
			
			if(userEmail.endsWith(searchedDomainName))
			{
				resultArr[index] = userEmail;
				index++;
			}
			
		}//end for
		
		if(index == 0) return null;
		else return resultArr;
		
		
	}//end method
	


}


