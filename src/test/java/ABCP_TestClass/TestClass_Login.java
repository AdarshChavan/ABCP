package ABCP_TestClass;

import java.io.IOException;

import org.testng.annotations.Test;

import ABCP_TestUtility.BaseTest;

public class TestClass_Login extends BaseTest{

//	@Test(priority = 1)
//	public void Login_Without_Credentials() throws InterruptedException {
//		loginpage.Blank_Field_Validation();
//	}
//	
//	@Test(priority = 2)
//	public void Login_With_Invalid_Email() {
//		loginpage.Invalid_Email();
//	}
//	
//	@Test(priority = 3)
//	public void Login_With_Invalid_Password() {
//		loginpage.Invalid_Password();
//	}
	
	@Test//(priority = 4)
	public void Login_With_Valid_Credentials() throws InterruptedException, IOException {
		loginpage.Valid_Credentials();
	}
}
