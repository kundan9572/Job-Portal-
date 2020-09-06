package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import homepage.Home;

public class SignUp {
	
public static void signup() throws IOException {
		
		//ArrayList<String> signupdetails = new ArrayList<String>();
		
		System.out.println("************************************************************************************************************************");
		System.out.println();		
		System.out.println("                         						SIGNUP                   ");
		System.out.println("                                --------------------------------------------------------------------");
		System.out.println();
		System.out.println("************************************************************************************************************************");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		BufferedReader sc = new BufferedReader(new InputStreamReader( System.in));
		//Scanner sc = new Scanner(System.in);
		System.out.print("     \t\tEnter Your Name :    ");
		String name = sc.readLine();
		System.out.println();
		System.out.println();
		System.out.print("     \t\tEnter Your Email ID  :   ");
		String email = sc.readLine();
		System.out.println();
		System.out.println();
		System.out.print("     \t\tCreate a New Password  :    ");
		String passowrd = sc.readLine();
		System.out.println();
		System.out.println();
		System.out.print("     \t\tEnter Your Gender  :    ");
		String gender = sc.readLine();
		System.out.println();
		System.out.println();
		System.out.print("     \t\tEnter Your Age  :     ");
		int age = Integer.parseInt(sc.readLine());

		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t Your Details has been successfully recorder .");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		

		HomePage.start();
		
	}


}
