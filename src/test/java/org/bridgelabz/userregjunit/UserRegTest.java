package org.bridgelabz.userregjunit;

import org.junit.Test;

import com.jplanes.blog.examples.model.validator.UserReg;

import org.junit.Assert;
public class UserRegTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnHappy() {
		try {
		UserReg user= new UserReg();
		boolean result=user.validateFirstName("Kanishk");
		Assert.assertEquals("Happy",result);
		}
		catch(UserRegException e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void givenFirstName_WhenImProper_ShouldReturnSad() {
		try {
		UserReg user= new UserReg();
		boolean result=user.validateFirstName("sdishk");
		Assert.assertEquals("Sad",result);
		}
		catch(UserRegException e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void givenlastName_WhenProper_ShouldReturnHappy() {
		try {
		UserReg user=new UserReg();
		boolean result=user.validateLastName("Kumar");
		Assert.assertEquals("Happy",result);
		}
		catch(UserRegException e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void givenlastName_WhenImProper_ShouldReturnSad() {
		try {
		UserReg user=new UserReg();
		boolean result=user.validateLastName("@mar");
		Assert.assertEquals("Sad",result);
		}
		catch(UserRegException e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void givenEmail_WhenValid_ShouldReturnhappy()
	{
		try {
		UserReg user=new UserReg();
		boolean result=user.validateEmail("kanishk@gmail.com");
		Assert.assertEquals("Happy",result);
		}
		catch(UserRegException e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void givenEmail_WhenInValid_ShouldReturnSad() 
	{
		try {
		UserReg user=new UserReg();
		boolean result=user.validateEmail("kanish..ail.com");
		Assert.assertEquals("Sad",result);
		}
		catch(UserRegException e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void givenMobileNumber_WhenTrue_ShouldReturnHappy()
	{
		try {
		UserReg user=new UserReg();
		boolean result=user.validateMobileNumber("91 9673648343");
		Assert.assertEquals("Happy",result);
		}
		catch(UserRegException e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void givenMobileNumber_WhenWrong_ShouldReturnSad()
	{
		try {
		UserReg user=new UserReg();
		boolean result=user.validateMobileNumber("9678343");
		Assert.assertEquals("Sad",result);
		}
		catch(UserRegException e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void givenPassword_WhenCorrect_ShouldReturnhappy()
	{
		try {
		UserReg user=new UserReg();
		boolean result=user.validatePassword("Kanishk1*");
		Assert.assertEquals("Happy",result);	
		}
		catch(UserRegException e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void givenPassword_WhenWrong_ShouldReturnSad()
	{
		try {
		UserReg user=new UserReg();
		boolean result=user.validatePassword("Kasa1");
		Assert.assertEquals("Sad",result);
		}
		catch(UserRegException e)
		{
			e.printStackTrace();
		}
	}
}