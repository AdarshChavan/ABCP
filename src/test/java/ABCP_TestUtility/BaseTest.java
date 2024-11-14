package ABCP_TestUtility;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.ABCP_Library.BaseClass;
import com.ABCP_Library.LoginPage;

import PageObjects.ChannelPartnerClass;
import PageObjects.ProjectsClass;

public class BaseTest extends BaseClass{

	public LoginPage loginpage;
	public ProjectsClass projectClass;
	public ChannelPartnerClass channelPartnerClass;
	
	@BeforeClass	
	public void PageObjects() throws IOException, InterruptedException {
		loginpage = new LoginPage(driver);
		projectClass = new ProjectsClass(driver);
		channelPartnerClass = new ChannelPartnerClass(driver);
		
	}
	
	
	@BeforeSuite
	@Parameters("browser")
	public void setup(@Optional("chrome") String browser) throws IOException {
		driver = BaseClass.InitializeBrowser("chrome");
	}
}