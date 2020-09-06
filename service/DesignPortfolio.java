package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class DesignPortfolio {
	public static PortfolioConstructor create() throws IOException {

	PortfolioConstructor portfolio =new PortfolioConstructor();
	
	ArrayList<PortfolioConstructor>  prolist = new  ArrayList<PortfolioConstructor>();

	System.out.println("************************************************************************************************************************************************************");
	System.out.println();
	System.out.println("                                              PORTFOLIO                          ");
	System.out.println("                                 ------------------------------------");
	System.out.println("************************************************************************************************************************************************************");
	System.out.println();
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	
	
	
	System.out.print("     Name :    ");
	String name = br.readLine();
	System.out.println();
	System.out.print("     Emaild ID :     ");
	String email = br.readLine();
	System.out.println();
	System.out.print("     Mobile No. :    ");
	String mob = br.readLine();
	System.out.println();
	System.out.print("     Secondary School : \t" );
	String secschool = br.readLine();
	System.out.println();
	System.out.print("     Enter Marks :\t");
	double marks10 = Double.parseDouble(br.readLine());
	System.out.println();
	//System.out.print("     Secondary School : \t" + secschool + "\t"  + marks10);
	System.out.println();
	System.out.print("     High School : \t" );
	String highschool = br.readLine();
	System.out.println();
	System.out.print("     Enter Marks :\t");
	double marks12 = Double.parseDouble(br.readLine());
	System.out.println();
	//System.out.print("     High School : \t" + highschool + "\t" + marks12);
	System.out.println();
	System.out.print("     Graduation  :  \t");
	String graduation = br.readLine();
	System.out.println();
	System.out.print("     Enter Marks :\t");
	double marksgrad = Double.parseDouble(br.readLine());
	System.out.println();
	//System.out.print("     Graduation  :  \t" + graduation + "\t" + marksgrad);
	System.out.println();
	System.out.print("     Computer Skills  :  \t");
	String skills = br.readLine();
	System.out.println();
	System.out.println();
	System.out.println(" I hearby authorised that all details are correct and verified .");
	System.out.println();
	System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
	
	
	//CreatePortfolio createportfolio = new CreatePortfolio(name,email,mob,secschool,marks10,highschool,marks12,graduation,marksgrad,skills);
	portfolio.setName(name);
	portfolio.setEmail(email);
	portfolio.setMob(mob);
	portfolio.setSecschool(secschool);
	portfolio.setMarks10(marks10);
	portfolio.setHighschool(highschool);
	portfolio.setMarks12(marks12);
	portfolio.setGraduation(graduation);
	portfolio.setMarksgrad(marksgrad);
	portfolio.setSkills(skills);
	
	prolist.add(portfolio);
	
	return portfolio;
	
	
	
	

	}
}
