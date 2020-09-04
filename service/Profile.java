package service;


public class Profile {
	
public static void display(PortfolioConstructor profile) {
		
		//CreatePortfolio   profile =new CreatePortfolio();
		//CreatePortfolio  portfolio=new CreatePortfolio();

		
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("|                                                                                          |");
		System.out.println("|                                          PROFILE                                         | ");
		System.out.println("|                                                                                          |");
		System.out.println("|                                                                                          |");
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.print("     Name           :\t" + profile.getName());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("     Emaild ID         :\t" + profile.getEmail());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("     Mobile No.        :\t" + profile.getMob());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("     Secondary School  : \t" + profile.getSecschool() + "\t" + profile.getMarks10());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("     High School       : \t" + profile.getHighschool() + "\t"  + profile.getMarks12());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("     Graduation        :  \t" + profile.getGraduation() + "\t" + profile.getMarksgrad());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("     Computer Skills   :  \t" + profile.getSkills());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(" I hearby authorised that all details are correct and verified .");
		System.out.println();
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------");




	}


}
