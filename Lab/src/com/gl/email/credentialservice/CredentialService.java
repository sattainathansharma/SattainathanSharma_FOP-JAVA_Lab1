package com.gl.email.credentialservice;

import com.gl.email.model.Employee;

public interface CredentialService {
	public String generatePassword();

	public String generateEmailAddress(Employee employee, String department);

	public void showCredentials(Employee employee, String department);

}
