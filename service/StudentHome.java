package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class StudentHome {
	static JobAdd jobadd = new JobAdd();
	static List<JobConstructor> list = new ArrayList<JobConstructor>();
	
	public static void display() throws NumberFormatException, IOException {
		
		 SearchJob job = new SearchJob();

		
		 DesignPortfolio portfolio = new DesignPortfolio();
		 PortfolioConstructor createportfolio = new PortfolioConstructor();
		 Profile viewprofile = new Profile();
		
	
		
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("                    WELCOME STUDENT              ");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println();
		
		while(true) {
		System.out.println();
		System.out.println("     1--->   FIND JOB ");
		System.out.println();
		System.out.println("     2--->   APPLY JOB");
		System.out.println();
		System.out.println("     3--->   VIEW PROFILE");
		System.out.println();
		System.out.println("     4--->   CREATE PORTFOLIO");
		System.out.println();
		System.out.println("     5--->   LOGOUT ");
		System.out.println();
		System.out.print("  --------------------------------------------------------------------------------------   ");
		System.out.println();
		
		int temp =0 ;
		
			
		int choice = Integer.parseInt(br.readLine());
		System.out.println();
		System.out.println();
		
		//list =jobadd.addjob();
	 

		
		switch(choice) {
				
	
	//	case 1: job.display(list);      //jobadd.addjob();
	//			break;
//		case 2 : ApplyJob.applyjob();
//		 		 break;
		case 3 : Profile.display( createportfolio);
		 		 break;
		case 4 : createportfolio = portfolio.create();
				 break;		
		case 5 : temp=1;
				 HomePage.start();
		 		 break;
//		
		}
		
		if(temp == 0) {
			continue;
		}
		else {
			break;
		}
		
		}

		


	}


}
