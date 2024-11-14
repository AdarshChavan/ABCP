package ABCP_TestClass;

import java.io.IOException;

import org.testng.annotations.Test;

import ABCP_TestUtility.BaseTest;

public class TestClass_ChannelPartner extends BaseTest{

	@Test(priority = 1)
	public void Click_On_the_ChannelPartner() throws IOException {
		channelPartnerClass.click_on_ChannelPartner();
	}
	
	@Test(priority = 2)
	public void Find_ChannelPartnerName_and_Click() throws IOException, InterruptedException {
		channelPartnerClass.Find();
	}
	
	@Test(priority = 3)
	public void click_On_the_EditChannelPartner_Button() {
		channelPartnerClass.Edit_ChannelPartner();
	}
	
	@Test(priority = 4)
	public void Edit_CompanyName() throws IOException {
		channelPartnerClass.Edit_CompanyName();
	}
}
