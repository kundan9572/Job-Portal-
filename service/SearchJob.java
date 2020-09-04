package service;

import java.util.List;

public class SearchJob {
	
	public static void display(List<JobConstructor> list) {
		 
		 for(JobConstructor job : list) {
			 System.out.println("----------------------------------------------------------------------------------------------------------------------");
			 System.out.println();
			 System.out.println("                              Recently Uploaded Jobs :                               ");
			 System.out.println("              -------------------------------------------------------");
			 System.out.println();
			 System.out.println("      JOBID\t\t JOBTITLE \t\t  JOB DESCRIPTION   \t\t WEBSITE TO APPLY");
			 System.out.println();
			 System.out.println(" \t"+job.getJobid() + "    \t\t " + job.getJobtitle() + "\t\t\t" + job.getJobDescription() + "\t\t\t"  + job.getWebsite());
		//	 System.out.println("     "+job.getJobtitle());
		//	 System.out.println("    "+job.getJobDescription());
			 
			 
			 System.out.println();
			 System.out.println("-----------------------------------------------------------------------------------------------------------------------");
	

		 }
		 
	}
	
	
	
}
