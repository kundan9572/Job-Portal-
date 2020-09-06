package controller;

import service.SignUp;
import service.StudentLogin;

public class StudentValidate {
	
	public static boolean checkStudentAccess(String name , String password) {
		
		
		if(name.equalsIgnoreCase("Kundan") && password.equalsIgnoreCase("Kundan123"))
		{
			return true;
		}
		else
			return false;
		
	}


}
