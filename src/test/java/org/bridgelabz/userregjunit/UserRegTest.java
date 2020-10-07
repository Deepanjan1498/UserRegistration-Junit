package org.bridgelabz.userregjunit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		try {
			UserReg user = new UserReg();
			boolean result = user.validateFirstName("Deepanjan");
			Assert.assertTrue(result);
		} catch (UserRegException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
		try {
			UserReg user = new UserReg();
			boolean result = user.validateFirstName("Deepan43");
			Assert.assertEquals("False", result);
		} catch (UserRegException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		try {
			UserReg user = new UserReg();
			boolean result = user.validateLastName("Sharma");
			Assert.assertTrue(result);
		} catch (UserRegException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenLastName_WhenInvalid_ShouldReturnFalse() {
		try {
			UserReg user = new UserReg();
			boolean result = user.validateLastName("shar56ma");
			Assert.assertEquals("False", result);
		} catch (UserRegException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		try {
			UserReg user = new UserReg();
			boolean result = user.validateEmail("deepanjansh34@gmail.com");
			Assert.assertTrue(result);
		} catch (UserRegException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenEmail_WhenInvalid_ShouldReturnFalse() {
		try {
			UserReg user = new UserReg();
			boolean result = user.validateEmail("shar56ma.co.in.in");
			Assert.assertEquals("False", result);
		} catch (UserRegException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenMobile_WhenProper_ShouldReturnTrue() {
		try {
			UserReg user = new UserReg();
			boolean result = user.validateMobile("91 8695321470");
			Assert.assertTrue(result);
		} catch (UserRegException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenMobile_WhenInvalid_ShouldReturnFalse() {
		try {
			UserReg user = new UserReg();
			boolean result = user.validateMobile("91889695321470");
			Assert.assertEquals("False", result);
		} catch (UserRegException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		try {
			UserReg user = new UserReg();
			boolean result = user.validatePassword("S9@ujkiloper56");
			Assert.assertTrue(result);
		} catch (UserRegException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenPassword_WhenInvalid_ShouldReturnFalse() {
		try {
			UserReg user = new UserReg();
			boolean result = user.validatePassword("Sdfe@#$hji");
			Assert.assertEquals("False", result);
		} catch (UserRegException e) {
			e.printStackTrace();
		}
	}

}