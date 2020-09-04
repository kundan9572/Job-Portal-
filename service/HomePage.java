package service;

import java.io.IOException;
import java.util.Scanner;
import java.lang.System;

//import HomePage.adm;
//import homepage.LoginStud;
//import homepage.SignUp;

public class HomePage {

	public static void start() throws IOException {
		System.out.println("................................................................................................................");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("                                    WELCOME                  ");
		System.out.println("                            --------------------------");
		System.out.println();
		System.out.println("                               PROGRADE JOB SEARCH                                             ");
		System.out.println("               --------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("................................................................................................................");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
			
		
		System.out.println("    ENTER  YOUR  CHOICE ");
		System.out.println();
		System.out.println();
		System.out.println("    1  ---   SIGNUP    ");
		System.out.println();
		System.out.println("    2  ---   LOGIN AS STUDENT  ");
		System.out.println();
		System.out.println("    3  ---   LOGIN AS HR   ");
		System.out.println();
		System.out.println("    4  ---   EXIT   ");
		System.out.println();
		System.out.println();
		System.out.print(" ---------------------------------------------------------------------------------------------------------------   ");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		//String name=sc.nextLine();
		//System.out.println(name);
		
		
		switch(choice) {
		
		case 1 : SignUp.signup();
				 break;
		case 2 : StudentLogin.loginStud();
		 		 break;
		case 3 : AdminLogin.adminlogin();
		 		 break;
		case 4 : System.exit(0);
				break;

		}

		}
		

}
