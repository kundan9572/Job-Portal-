package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class AdminHome {
	
	static JobAdd jobadd = new JobAdd();
	static List<JobConstructor> list = new ArrayList<JobConstructor>();

	public static void display() throws NumberFormatException, IOException {
		
		SearchJob job = new SearchJob();
		
		//ArrayList<IT_Job> list = new ArrayList<IT_Job>();
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		System.out.println("\n\n\n\n\n");
		System.out.println();
		System.out.println();
		System.out.println("***********************************************************************************************************************************************");
		System.out.println();
		System.out.println("                                  		 WELCOME                       ");
		System.out.println("                           -----------------------------------------------");
		System.out.println("***********************************************************************************************************************************************");
		System.out.println();
		System.out.println();
		
		while(true) {
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t Choose a option  :");
		System.out.println();
		System.out.println("\t\t\t\t\t\t 1---->   POST NEW JOB ROLE  ");
		System.out.println();
		System.out.println("\t\t\t\t\t\t 2---->   REMOVE JOB  ");
		System.out.println();
		System.out.println("\t\t\t\t\t\t 3---->   VIEW JOB");
		System.out.println();
		System.out.println("\t\t\t\t\t\t 4---->   LOGOUT ");
		System.out.println();
		System.out.println();
		System.out.println();
		int choice = Integer.parseInt(br.readLine());
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
		
		int temp =0;
		
	switch(choice) {
		
		case 1 : list=jobadd.addjob();
				 break;
				 
		case 2 : jobadd.removejob();
				 break;

		case 3 : job.display(list);
				break;
		case 4 : HomePage.start();
				 break;
		}
	
	if(temp ==0 )
		continue;
	else
		break;
	
		}
	
	
	}
	
	
	
	
	////////////////////////////////////////////////////////////////////////////////////
	
	
	
	//static List<JobConstructor> list = new ArrayList<JobConstructor>();
	
	public static void display1() throws NumberFormatException, IOException {
		
		 SearchJob job = new SearchJob();

		
		 DesignPortfolio portfolio = new DesignPortfolio();
		 PortfolioConstructor createportfolio = new PortfolioConstructor();
		 Profile viewprofile = new Profile();
		
	
		
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("\n\n\n\n\n\n\n\n");
		System.out.println("***********************************************************************************************************************************************");
		System.out.println();
		System.out.println("                    					  WELCOME                                     ");
		System.out.println("                       ---------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("***********************************************************************************************************************************************");
		System.out.println();
		
		while(true) {
		System.out.println();
		System.out.println("\t\t\t\t\t\t Choose your choice  :");
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t\t 1--->   APPLY JOB ");
		System.out.println();
	//	System.out.println("\t\t\t\t\t\t 2--->   APPLY JOB");
	//	System.out.println();
		System.out.println("\t\t\t\t\t\t 2--->   VIEW PROFILE");
		System.out.println();
		System.out.println("\t\t\t\t\t\t 3--->   CREATE PORTFOLIO");
		System.out.println();
		System.out.println("\t\t\t\t\t\t 4--->   LOGOUT ");
		System.out.println();
		System.out.print("  --------------------------------------------------------------------------------------------------------------");
		System.out.println();
		
		int temp =0 ;
		
			
		int choice = Integer.parseInt(br.readLine());
		System.out.println();
		System.out.println();
		
	 

		
		switch(choice) {
				
	
		case 1: job.display(list);      //jobadd.addjob();
				break;
	//	case 2 : ApplyJob.display();
	//			ApplyJob.display1();
	//	 		 break;
		case 2 : Profile.display( createportfolio);
		 		 break;
		case 3 : createportfolio = portfolio.create();
				 break;		
		case 4 : temp=1;
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
