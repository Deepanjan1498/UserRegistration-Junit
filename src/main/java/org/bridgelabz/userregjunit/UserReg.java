package org.bridgelabz.userregjunit;

import java.util.regex.Pattern;

public class UserReg {

	private static final String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
	private static final String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
	private static final String emailIdPattern = "^[A-Za-z0-9]+([-\\+\\.][A-Za-z0-9]+)?@([A-Za-z0-9-]+)\\.([A-Za-z]{2,3})(\\.[A-Za-z]{1,3})?$";
	private static final String mobileNumberPattern = "^[1-9]([0-9]{1,2})? ([1-9][0-9]{9})$";
	private static final String passwordPattern = "(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9]).{8,20}$";

	public String validateFirstName(String first) {
		Pattern pattern = Pattern.compile(firstNamePattern);
		if (pattern.matcher(first).matches())
			return "Happy";
		else
			return "Sad";
	}

	public String validateLastName(String last) {
		Pattern pattern = Pattern.compile(lastNamePattern);
		if (pattern.matcher(last).matches())
			return "Happy";
		else
			return "Sad";
	}

	public String validateEmail(String email) {
		Pattern pattern = Pattern.compile(emailIdPattern);
		if (pattern.matcher(email).matches())
			return "Happy";
		else
			return "Sad";
	}

	public String validateMobile(String mobile) {
		Pattern pattern = Pattern.compile(mobileNumberPattern);
		if (pattern.matcher(mobile).matches())
			return "Happy";
		else
			return "Sad";
	}

	public String validatePassword(String pass) {
		Pattern pattern = Pattern.compile(passwordPattern);
		if (pattern.matcher(pass).matches())
			return "Happy";
		else
			return "Sad";
	}

}
