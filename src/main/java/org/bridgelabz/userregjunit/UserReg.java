package org.bridgelabz.userregjunit;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserReg {

	public static void main(String[] args) {
		List<String> emailId = new ArrayList<String>();

		emailId.add("+bc@yahoo.com");
		emailId.add("abc-100@yahoo.com");
		emailId.add("abc.100@yahoo.com");
		emailId.add("abc111@abc.com");
		emailId.add("abc-100@abc.net");
		emailId.add("abc.100@abc.com.au");
		emailId.add("abc@1.com");
		emailId.add("abc@gmial.com.com");
		emailId.add("abc+100@gmail.com");
		emailId.add("abc-");
		emailId.add(".abc@.com.my");
		emailId.add("abc123@gmail.a");
		emailId.add("abc123@.com");
		emailId.add("abc123@.com.com");
		emailId.add(".abc@abc.com");
		emailId.add("abc()*@gmail.com");
		emailId.add("abc@%*.com");
		emailId.add("abc..2002@gmail.com");
		emailId.add("abc.@gmail.com");
		emailId.add("abc@abc@gmail.com");
		emailId.add("abc@gmail.com.1a");
		emailId.add("abc@gmail.com.au.au");

		String regex = "^[A-Za-z0-9]+([-\\+\\.][A-Za-z0-9]+)?@([A-Za-z0-9-]+)\\.([A-Za-z]{2,3})(\\.[A-Za-z]{1,3})?$";

		Pattern pattern = Pattern.compile(regex);

		for (String email : emailId) {
			Matcher matcher = pattern.matcher(email);
			System.out.println(matcher.matches());
		}
	}
}