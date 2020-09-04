package service;

import java.io.IOException;
import java.util.Scanner;

import controller.AdminValidate;

public class AdminLogin {
	
	public static void adminlogin() throws IOException {

	
	Scanner sc = new Scanner(System.in);
	System.out.println();
	System.out.print("     USERNAME :  ");
	String uname = sc.nextLine();
	System.out.println();
	System.out.println();
	System.out.print("     PASSWORD :  ");
	String password = sc.nextLine();
	System.out.println();
	System.out.println();
	boolean checkpassword = AdminValidate.checkAdminAccess(uname, password);

	if(checkpassword) {
		System.out.println();
		System.out.println(" Login Successfull");
		AdminHome.display();

	}
	else
	{
		System.out.println();
		System.out.println(" Incorrect Password ! Try again with correct Password . ");
		HomePage.start();

	}
	
	}


}
