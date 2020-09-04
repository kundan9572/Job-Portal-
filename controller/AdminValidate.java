package controller;

public class AdminValidate {
	
	public static boolean checkAdminAccess(String name , String password) {
		if(name.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("Admin123"))
		{
			return true;
		}
		else
			return false;

}

}
