package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import service.HomePage;

public class Main {

	public static void main(String[] args) throws IOException {
		
		HomePage home = new HomePage();
		home.start();
		//BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

	}

}
