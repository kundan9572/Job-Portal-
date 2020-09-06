package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import model.ExcelGeneration;
import model.PdfGeneration;

public class JobAdd {
    	static List<JobConstructor> list = new ArrayList<JobConstructor>();
		static BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	
		public static List<JobConstructor> addjob() throws IOException{
		
		System.out.print("     Enter the Job Id : ");
		int jobid = Integer.parseInt(br.readLine());
		System.out.println();
		System.out.print("     Enter Job Title : ");
		String jobtitle = br.readLine();
		System.out.println();
		System.out.print("     Enter Job Description :");
		String jobDesc = br.readLine();
		System.out.println();
		
		System.out.print("     Enter Job Website :");
		String website = br.readLine();
		System.out.println();


		JobConstructor itjob= new JobConstructor(jobid,jobtitle,jobDesc,website);
		
//		itjob.setJobid(jobid);
//		itjob.setJobtitle(jobtitle);
//		itjob.setJobDescription(jobDesc);
		
		
		list.add(itjob);
		
	
		
//		ExcelGeneration  excelgeneration = new ExcelGeneration();
//		excelgeneration.excelgenerate(itjob,list); 
		
		
		PdfGeneration  pdfGeneration = new PdfGeneration();
		pdfGeneration.excelgenerate(itjob,list); 
		
		return list;
		
		
		
		
		
	}
		
		public static void removejob() throws NumberFormatException, IOException {
			
			System.out.println("");
			System.out.println("");
			System.out.print("     Enter The Job ID to Remove Job : \t");
			int jobnum = Integer.parseInt(br.readLine());
			System.out.println("");
			
			
			int removeid = list.indexOf(jobnum);
			System.out.println(removeid);
			
			
			list.remove(removeid);
			
			System.out.println("");
			System.out.println("");
			
			System.out.println("    The  Job  with  jobid " + jobnum + " has been Successfully Removed from the Search List");
			
				
			
		}

	


}
