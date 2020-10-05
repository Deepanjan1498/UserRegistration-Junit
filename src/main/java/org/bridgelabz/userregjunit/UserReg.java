package org.bridgelabz.userregjunit;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserReg {

	public static void main(String[] args) {
		List<String> Mobile = new ArrayList<String>();

		Mobile.add("456789");
		Mobile.add("91 7896354128");
		Mobile.add("00 1234567896");
		Mobile.add("103 2314569875");
		Mobile.add("1 1234567895");
		Mobile.add("15 12345685");
		Mobile.add("15  1234568579");
		Mobile.add("15 0234568579");
		Mobile.add("15 12345685793");

		String regex = "^[1-9]([0-9]{1,2})? ([1-9][0-9]{9})$";

		Pattern pattern = Pattern.compile(regex);

		for (String number : Mobile) {
			Matcher matcher = pattern.matcher(number);
			System.out.println(matcher.matches());
		}
	}
}