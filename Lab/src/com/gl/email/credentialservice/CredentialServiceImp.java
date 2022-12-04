package com.gl.email.credentialservice;

import java.util.Random;

import com.gl.email.model.Employee;

public class CredentialServiceImp implements CredentialService {

	
	public String generatePassword() {
		String capChars = "QWERTYUIOPLKJHGFDSAZXCVBNM";
		String smallChars = "qwertyuioplkjhgfdsazxcvbnm";
		String numbers = "1234567890";
		String symbols = "!@#$%^&*()_+|?><:";
		String values = capChars + smallChars + numbers + symbols;
		
		Random random = new Random();
		char [] password = new char [8];
		for (int i=0; i<8;i++) {
			
		int randomNumber = random.nextInt(values.length());
		password[i] = values.charAt(randomNumber);
	}

	
		return new String(password);
	}

	
	public String generateEmailAddress(Employee employee, String department) {
		
		return (employee.getFirstName() + employee.getLastName()).toLowerCase() + "@" + department + ".abc.com";
	}

	
	public void showCredentials(Employee employee, String department) {
System.out.println("Dear " + employee.getFirstName() + " " + employee.getLastName() + " your generated credentials are as follows");
System.out.println("Email    ----> " + generateEmailAddress(employee, department));
System.out.println("Password ----> " + generatePassword());
	}

}
