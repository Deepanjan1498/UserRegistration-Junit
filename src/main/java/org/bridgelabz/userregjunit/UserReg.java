package org.bridgelabz.userregjunit;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserReg {

	public static void main(String[] args) {
		List<String> firstName = new ArrayList<String>();

		firstName.add("Deepanjan");
		firstName.add("DDepanja");
		firstName.add("2elop");
		String regex = "^[A-Z]{1}[a-z]{2,}$";

		Pattern pattern = Pattern.compile(regex);

		for (String first : firstName) {
			Matcher matcher = pattern.matcher(first);
			System.out.println(matcher.matches());
		}
	}
}