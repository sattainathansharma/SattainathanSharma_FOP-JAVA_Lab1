package com.gl.email.main;

import java.util.Scanner;

import com.gl.email.credentialservice.CredentialService;
import com.gl.email.credentialservice.CredentialServiceImp;
import com.gl.email.model.Employee;

public class SupportAdmin {

	public static void main(String[] args) {

		CredentialService cs = new CredentialServiceImp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First Name");
		String firstName = sc.next();
		System.out.println("Enter Your Last Name");
		String lastName = sc.next();
		Employee employee = new Employee(firstName, lastName);
		String department = "";
		cs.generatePassword();
		System.out.println("Please Enter the Department from the following");
		System.out.println("1. Enter 1 for Technical");
		System.out.println("2. Enter 2 for Admin");
		System.out.println("3. Enter 3 for Human Resource");
		System.out.println("4. Enter 4 for Legal");
		System.out.println("---------------------------------------");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		cs.generateEmailAddress(employee, department);
		switch (choice) {
		case 1:
			department = "tech";
			cs.showCredentials(employee, department);
			break;
		case 2:
			department = "admin";
			cs.showCredentials(employee, department);
			break;
		case 3:
			department = "hr";
			cs.showCredentials(employee, department);
			break;
		case 4:
			department = "legal";
			cs.showCredentials(employee, department);
			break;

		default:
			System.out.println("Invalid Choice");
			break;
		}
		
		
	}

}
