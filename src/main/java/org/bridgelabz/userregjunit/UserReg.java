package org.bridgelabz.userregjunit;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserReg {

	public static void main(String[] args) {
		List<String> lastName = new ArrayList<String>();

		lastName.add("Sharma");
		lastName.add("sharMa");
		lastName.add("2sma");
		String regex = "^[A-Z]{1}[a-z]{2,}$";

		Pattern pattern = Pattern.compile(regex);

		for (String last : lastName) {
			Matcher matcher = pattern.matcher(last);
			System.out.println(matcher.matches());
		}
	}
}
