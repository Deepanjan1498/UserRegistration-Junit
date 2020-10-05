package org.bridgelabz.userregjunit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnHappy() {
		UserReg user = new UserReg();
		String result = user.validateFirstName("Deepanjan");
		Assert.assertEquals("Happy", result);
	}

	@Test
	public void givenFirstName_WhenWithNumbers_ShouldReturnSad() {
		UserReg user = new UserReg();
		String result = user.validateFirstName("Deepa43njan");
		Assert.assertEquals("Sad", result);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnHappy() {
		UserReg user = new UserReg();
		String result = user.validateLastName("Sharma");
		Assert.assertEquals("Happy", result);
	}

	@Test
	public void givenLastName_WhenWithNumbers_ShouldReturnSad() {
		UserReg user = new UserReg();
		String result = user.validateLastName("35sharma");
		Assert.assertEquals("Sad", result);
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnHappy() {
		UserReg user = new UserReg();
		String result = user.validateEmail("deepanjansh34@gmail.com");
		Assert.assertEquals("Happy", result);
	}

	@Test
	public void givenEmail_WhenViolatesRules_ShouldReturnSad() {
		UserReg user = new UserReg();
		String result = user.validateEmail("+dfhj@gmail.com.au.au");
		Assert.assertEquals("Sad", result);
	}

	@Test
	public void givenMobile_WhenProper_ShouldReturnHappy() {
		UserReg user = new UserReg();
		String result = user.validateMobile("91 8695321470");
		Assert.assertEquals("Happy", result);
	}

	@Test
	public void givenMobile_WhenWithCharacters_ShouldReturnSad() {
		UserReg user = new UserReg();
		String result = user.validateMobile("98563214we");
		Assert.assertEquals("Sad", result);
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnHappy() {
		UserReg user = new UserReg();
		String result = user.validatePassword("S2@wertyuhi");
		Assert.assertEquals("Happy", result);
	}

	@Test
	public void givenPassword_WhenViolatesRules_ShouldReturnSad() {
		UserReg user = new UserReg();
		String result = user.validatePassword("S23@olk");
		Assert.assertEquals("Sad", result);
	}
}
