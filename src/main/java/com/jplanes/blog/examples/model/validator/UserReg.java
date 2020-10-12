


package com.jplanes.blog.examples.model.validator;

import com.jplanes.blog.examples.model.Person;




import java.util.*;

import org.bridgelabz.userregjunit.UserRegException;
@FunctionalInterface
interface NewUserValidationInterface
	{
		boolean validate(String userInput);
	}
public class UserReg 
{
	NewUserValidationInterface validateFirstName = firstName -> firstName.matches("^[A-Z][a-z]{2,}");
	NewUserValidationInterface validateLastName = lastName -> lastName.matches("^[A-Z][a-z]{2,}");
	NewUserValidationInterface validateEmail = emailId -> emailId.matches("^[0-9a-zA-Z]+([+._-]{1}[0-9a-zA-Z]+)?@[0-9a-zA-Z]+[.]{1}[a-zA-z]{2,4}([.]{1}[a-zA-z]{2,3})?$");
	NewUserValidationInterface validateMobileNumber = mobileNo -> mobileNo.matches("^(\\d{2})\\s{1}\\d{10}");
	NewUserValidationInterface validatePassword = password -> password.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9 ]).{8,}");
	public boolean validateFirstName(String firstName) throws UserRegException
	{
		if(validateFirstName.validate(firstName)) 
			return true;
		else
			throw new UserRegException("Invalid First name");
	}
	public boolean validateLastName(String lastName) throws UserRegException
	{
		if(validateLastName.validate(lastName))
			return true;
		else
			throw new UserRegException("Invalid Last Name");
	}
	public boolean validateMobileNumber(String MobileNumber) throws UserRegException
	{
		if(validateMobileNumber.validate(MobileNumber))
			return true;
		else
			throw new UserRegException("Invalid Mobile Number");
	}
	public boolean validatePassword(String password) throws UserRegException
	{
		if(validatePassword.validate(password))
			return true;
		else
			throw new UserRegException("Invalid PassWord ! Re-Enter");
	}
    public boolean validateEmail(String emailId) throws UserRegException
    {
    	if(validateEmail.validate(emailId))
			return true;
		else
			throw new UserRegException("Invalid EmailId");
    }
    public boolean validateMultipleEmail(String email)
    {
    	return email.matches("^[0-9a-zA-Z]+([+._-]{1}[0-9a-zA-Z]+)?@[0-9a-zA-Z]+[.]{1}[a-zA-z]{2,4}([.]{1}[a-zA-z]{2,3})?$");
    }
    public static void main( String[] args ) 
    {
		UserReg obj = new UserReg();
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name: ");
		String firstName=sc.nextLine();
		try {
			if(obj.validateFirstName(firstName))
				System.out.println("Valid First Name");
		}
		catch(UserRegException e) {
			e.printStackTrace();
		}

		System.out.println("Last Name: ");
		String lastName=sc.nextLine();
		try {
			if(obj.validateLastName(lastName))
				System.out.println("Valid Last Name");
		} catch (UserRegException e) {
			e.printStackTrace();
		}

		System.out.println("Email ID: ");
		String emailId=sc.nextLine();
		try 
		{
			if(obj.validateEmail(emailId))
				System.out.println("Valid Email Id");
		} catch (UserRegException e) {
			e.printStackTrace();
		}

		System.out.println("Mobile No: ");
		String mobileNo = sc.nextLine();
		try 
		{
			if(obj.validateMobileNumber(mobileNo))
				System.out.println("Valid Mobile No");
		} catch (UserRegException e) {
			e.printStackTrace();
		}

		System.out.println("Password: ");
		String password=sc.nextLine();
		try 
	{
			if(obj.validatePassword(password))
				System.out.println("Valid Password");
		} catch (UserRegException e) {
			e.printStackTrace();
		}
	}
	public boolean MultipleEmailValidation(String email) {
		// TODO Auto-generated method stub
		return false;
	}
}