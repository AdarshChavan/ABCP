package PageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ABCP_Library.UtilityClass;


public class ChannelPartnerClass {

	private WebDriver driver;
	private static final Logger logger = LogManager.getLogger(ProjectsClass.class);
	public WebDriverWait wait;
	
	
	public ChannelPartnerClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	private void enterData(WebElement element, String datakey) throws IOException {
		element.sendKeys(UtilityClass.GetData(datakey));
	}
	
	public void scroll(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);

		} catch (JavascriptException e) {
			logger.error("Error While Scrolling to the Element", e);
		}
	}
	
	
	
	@FindBy(xpath = "//button[text()='Channel Partners']")
	WebElement Channel_Partners_button;	
	
	@FindBy(xpath = "//button[text()='Edit Channel Partner']")
	WebElement Edit_Channel_Partner;
	
	@FindBy(xpath = "//input[@placeholder='Capital Group']")
	WebElement Company_Name;
	
//	@FindBy(xpath = "")
//	WebElement
//	
//	@FindBy(xpath = "")
//	WebElement
//	
//	@FindBy(xpath = "")
//	WebElement
//	
//	@FindBy(xpath = "")
//	WebElement
//	
//	@FindBy(xpath = "")
//	WebElement
//	
//	@FindBy(xpath = "")
//	WebElement
//	
//	@FindBy(xpath = "")
//	WebElement
//	
//	@FindBy(xpath = "")
//	WebElement
//	
//	@FindBy(xpath = "")
//	WebElement
	
	
	public void click_on_ChannelPartner() {
		Channel_Partners_button.click();
	}
	
	public void Find() throws IOException, InterruptedException {
		logger.info("Executing Method :- " + "Find()");
		WebElement table = driver.findElement(By.tagName("table"));		
		wait.until(ExpectedConditions.visibilityOf(table));
	
		List<WebElement> cells = table.findElements(By.tagName("td"));
		String targetWord = UtilityClass.GetData("ChannelPartnerName");
		
		for(WebElement cell:cells) {
			if(cell.getText().equalsIgnoreCase(targetWord)) {
				Thread.sleep(1000);
				cell.click();
				break;
			}
		}
		
		
	}
	
	
	public void Edit_ChannelPartner() {
		Edit_Channel_Partner.click();
	}
	
	public void Edit_CompanyName() throws IOException {
		wait.until(ExpectedConditions.visibilityOf(Company_Name));
		try {

		String a = UtilityClass.GetData("CompanyName");
		if(a != null) {
			Company_Name.clear();
		
			wait.until(ExpectedConditions.attributeToBe(Company_Name, "value", ""));
			enterData(Company_Name, "CompanyName");
		}
		} catch (Exception e) {
			logger.error(e);
		}
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
