package org.bridgelabz.userregjunit;

import java.util.regex.Pattern;

public class UserReg {

	private static final String FIRSTNAMEPATTERN = "^[A-Z]{1}[a-z]{2,}$";
	private static final String LASTNAMEPATTERN = "^[A-Z]{1}[a-z]{2,}$";
	private static final String EMAILIDPATTERN = "^[A-Za-z0-9]+([-\\+\\.][A-Za-z0-9]+)?@([A-Za-z0-9-]+)\\.([A-Za-z]{2,3})(\\.[A-Za-z]{1,3})?$";
	private static final String MOBILENUMBERPATTERN = "^[1-9]([0-9]{1,2})? ([1-9][0-9]{9})$";
	private static final String PASSWORDPATTERN = "(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9]).{8,20}$";

	public boolean validateFirstName(String first) throws UserRegException {
		if (first.matches(FIRSTNAMEPATTERN))
			return true;
		else
			throw new UserRegException("The First Name User Entry is Invalid");
	}

	public boolean validateLastName(String last) throws UserRegException {
		if (last.matches(LASTNAMEPATTERN))
			return true;
		else
			throw new UserRegException("The Last Name User Entry is Invalid");
	}

	public boolean validateEmail(String email) throws UserRegException {
		if (email.matches(EMAILIDPATTERN))
			return true;
		else
			throw new UserRegException("The Email id User Entry is Invalid");
	}

	public boolean validateMobile(String mobile) throws UserRegException {
		if (mobile.matches(MOBILENUMBERPATTERN))
			return true;
		else
			throw new UserRegException("The Mobile Number User Entry is Invalid");
	}

	public boolean validatePassword(String pass) throws UserRegException {
		if (pass.matches(PASSWORDPATTERN))
			return true;
		else
			throw new UserRegException("The Password User Entry is Invalid");
	}

	public boolean MultipleEmailValidation(String email) {

		return email.matches("^[A-Za-z0-9]+([-\\+\\.][A-Za-z0-9]+)?@([A-Za-z0-9-]+)\\.([A-Za-z]{2,3})(\\.[A-Za-z]{1,3})?$");
	}

}
