package org.bridgelabz.userregjunit;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserReg {

	public static void main(String[] args) {
		List<String> password = new ArrayList<String>();

		password.add("456789");
		password.add("14Ju2345@a");
		password.add("AsDfGhJk@l");
		password.add("!@#$%^&*()");
		password.add("--");
		password.add("asdfghjkl");
		password.add("15A123456857978965412");
		password.add("15 0234568579");
		password.add("abcderfgth");
		password.add("SD45685793");

		String regex = "(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9]).{8,20}$";

		Pattern pattern = Pattern.compile(regex);

		for (String pass : password) {
			Matcher matcher = pattern.matcher(pass);
			System.out.println(matcher.matches());
		}
	}
}