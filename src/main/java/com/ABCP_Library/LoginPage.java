package com.ABCP_Library;

import java.io.IOException;
import java.net.PasswordAuthentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Sign In']")
	private WebElement Sign_In_Button;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement Email_ID_Field;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement Password_Field;

	@FindBy(xpath = "(//p[text()='This field has to be filled.'])[1]\")")
	private WebElement Validation_Message_Email;

	@FindBy(xpath = "(//p[text()='This field has to be filled.'])[2]\")")
	private WebElement Validation_Message_Password;
	
	@FindBy(xpath = "//button[text()='Okay']")
	private WebElement Okay_Button;

	@FindBy(xpath = "//div[text()='Invalid password']")
	private WebElement Validation_Pop_up;

	public void Blank_Field_Validation() throws InterruptedException {
		System.out.println("Executing method :- Blank_Field_Validation()");
		Thread.sleep(5000);
		try {

			Sign_In_Button.click();

			// Email Id field Validation ------------------
			String Email_Validation = Validation_Message_Email.getText();
			Assert.assertTrue(Validation_Message_Email.isDisplayed(),
					"Validation message for Email field is not displayed");

			System.out.println("blank field validation message for email " + Email_Validation);

			// Password field validation -----------------
			String Password_Validation = Validation_Message_Password.getText();
			Assert.assertTrue(Validation_Message_Password.isDisplayed(),
					"Validation message for Password field is not displayed");

			System.out.println("blank field validation message for email " + Password_Validation);

		} catch (Exception e) {
			System.err.println(e);
			System.err.println("Error in method :- " + "Blank_Field_Validation()");
		}
	}

	public void Invalid_Email() {
		System.out.println("Executing Method :- Invalid_Credentials()");

		try {

			Email_ID_Field.sendKeys(UtilityClass.GetData("Invalid_Email_ID"));
			Password_Field.sendKeys(UtilityClass.GetData("Invalid_Password"));
			Sign_In_Button.click();

			String Email_Validation = Validation_Message_Email.getText();
			Assert.assertTrue(Validation_Message_Email.isDisplayed(),
					"Validation message for Email field is not displayed");

			System.out.println("Email Id field validation is :- " + Email_Validation);

			Thread.sleep(2000);
			Email_ID_Field.clear();
			Thread.sleep(1000);
			Password_Field.clear();

		} catch (Exception e) {
			System.err.println(e);
			System.err.println("Error in method :-" + "Invalid_Credentials()");
		}
	}

	public void Invalid_Password() {
		System.out.println("Executing Method :- " + "Invalid_Password()");

		try {

			Email_ID_Field.sendKeys(UtilityClass.GetData("Valid_Email_ID"));
			Password_Field.sendKeys(UtilityClass.GetData("Invalid_Password"));
			Sign_In_Button.click();

			String Password_Validation = Validation_Pop_up.getText();

			Assert.assertTrue(Validation_Pop_up.isDisplayed(),
					"Validation message for Password field is not displayed");
			System.out.println("Password Field validation is :-" + Password_Validation);

			Thread.sleep(2000);
			Okay_Button.click();
			Thread.sleep(1000);
			Email_ID_Field.clear();
			Thread.sleep(1000);
			Password_Field.clear();

		} catch (Exception e) {
			System.err.println(e);
			System.err.println("Error in method :- " + "Invalid Password()");
		}
	}

	public void Valid_Credentials() throws InterruptedException, IOException {
		System.out.println("Executing Method :-" + "Valid_Credentials()");

		Email_ID_Field.sendKeys(UtilityClass.GetData("Valid_Email_ID"));
		Password_Field.sendKeys(UtilityClass.GetData("Valid_Password_ID"));
		Sign_In_Button.click();

		Thread.sleep(4000);
		Okay_Button.click();

	}

}
