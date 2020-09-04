package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import controller.StudentValidate;

public class StudentLogin {
	
public static void loginStud() throws IOException {
		
		BufferedReader sc = new BufferedReader(new InputStreamReader( System.in));
		//Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("     USERNAME :  ");
		String uname = sc.readLine();
		System.out.println();
		System.out.println();
		System.out.print("     PASSWORD :  ");
		String password = sc.readLine();
		System.out.println();
		System.out.println();
		boolean checkpassword = StudentValidate.checkStudentAccess(uname, password);
		
		if(checkpassword) {
			System.out.println();
			System.out.println("     Login Successfull");
			AdminHome.display1();
		}
		else {
			System.out.println();
			System.out.println(" Incorrect Password  ");
			HomePage.start();

		}

	}


}
