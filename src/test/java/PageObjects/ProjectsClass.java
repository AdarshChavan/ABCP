package PageObjects;


import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ABCP_Library.UtilityClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProjectsClass {

	private WebDriver driver;
	private Actions action;
	private static final Logger logger = LogManager.getLogger(ProjectsClass.class);
	private WebDriverWait wait;

	public ProjectsClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void scroll(WebElement element) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);

		} catch (JavascriptException e) {
			logger.error("Error While Scrolling to the Element", e);
		}

	}

	private void enterData(WebElement element, String datakey) throws IOException {
		element.sendKeys(UtilityClass.GetData(datakey));
	}

	

	@FindBy(xpath = "//button[text()='Projects']")
	private WebElement Projects_Tab;

	@FindBy(xpath = "//button[text()='+ Add Project']")
	private WebElement Add_Project_Button;

	@FindBy(xpath = "//input[@placeholder='Please enter project ref id']")
	private WebElement Project_Ref_Id_Field;

	@FindBy(xpath = "//input[@placeholder='Please enter project name']")
	private WebElement Project_Name_Field;

	@FindBy(xpath = "//textarea[@placeholder='Please enter project description']")
	private WebElement Description_Field;

	@FindBy(xpath = "(//input[@placeholder='Choose file'])[1]")
	private WebElement Cover_Image;

	@FindBy(xpath = "(//input[@placeholder='Choose file'])[1]")
	private WebElement Sales_Kit;

	@FindBy(xpath = "//input[@placeholder='Please enter website link']")
	private WebElement Website;

	@FindBy(xpath = "//input[@placeholder='Please enter address line 1']")
	private WebElement Address_Line_1;

	@FindBy(xpath = "//input[@placeholder='Please enter address line 2']")
	private WebElement Address_Line_2;

	@FindBy(xpath = "//input[@placeholder='Please enter postal code']")
	private WebElement Postal_Code;

	@FindBy(xpath = "//button[text()='Please select country']")
	private WebElement Country;

	@FindBy(xpath = "//button[text()='Please select state']")
	private WebElement State;

	@FindBy(xpath = "//button[text()='Please select city']")
	private WebElement City;

	@FindBy(xpath = "//input[@placeholder='Please enter locality']")
	private WebElement Locality;

	@FindBy(xpath = "//input[@placeholder='Latitude']")
	private WebElement Latitude;

	@FindBy(xpath = "//input[@placeholder='Longitude']")
	private WebElement Longitude;

	@FindBy(xpath = "//label[text()='Residential']")
	private WebElement Residential;

	@FindBy(xpath = "//label[text()='Commercial']")
	private WebElement Commercial;

	@FindBy(xpath = "//label[text()='Clubhouse']")
	private WebElement Amenities_Clubhouse;

	@FindBy(xpath = "//label[text()='Community Hall']")
	private WebElement Amenities_Community_Hall;

	@FindBy(xpath = "//label[text()='Landscaped Garden']")
	private WebElement Amenities_Landscaped_Garden;

	@FindBy(xpath = "//label[text()='swimming pool']")
	private WebElement Amenities_swimming_pool;

	@FindBy(xpath = "//label[text()='Lifestyle amenitites']")
	private WebElement Amenities_Lifestyle_amenitites;

	@FindBy(xpath = "//label[text()='Poolside Cabana']")
	private WebElement Amenities_Poolside_Cabana;

	@FindBy(xpath = "//label[text()='Kids Pool']")
	private WebElement Kids_Pool;

	@FindBy(xpath = "//label[text()='Daycare Center']")
	private WebElement Daycare_Center;

	@FindBy(xpath = "//label[text()='Kids_Playground']")
	private WebElement Kids_Playground;

	@FindBy(xpath = "//label[text()='Toddler play Area']")
	private WebElement Toddler_play_Area;

	@FindBy(xpath = "//label[text()='1BHK']")
	private WebElement BHK1;

	@FindBy(xpath = "//label[text()='2BHK']")
	private WebElement BHK2;

	@FindBy(xpath = "//label[text()='3BHK']")
	private WebElement BHK3;

	@FindBy(xpath = "//input[@checkedclassname='1BHK' and @placeholder='Please enter typology ref id']")
	private WebElement Typology_Ref_Id_1BHK;

	@FindBy(xpath = "(//input[@checkedclassname='1BHK' and @placeholder='Min'])[1]")
	private WebElement RERA_Carpet_Area_Min_1BHK;

	@FindBy(xpath = "(//input[@checkedclassname='1BHK' and @placeholder='Max'])[1]")
	private WebElement RERA_Carpet_Area_Max_1BHK;

	@FindBy(xpath = "(//input[@checkedclassname='1BHK' and @placeholder='Min'])[2]")
	private WebElement RERA_Exclusive_Area_Min_1BHK;

	@FindBy(xpath = "(//input[@checkedclassname='1BHK' and @placeholder='Max'])[2]")
	private WebElement RERA_Exclusive_Area_Max_1BHK;

	@FindBy(xpath = "//input[@checkedclassname='2BHK' and @placeholder='Please enter typology ref id']")
	private WebElement Typology_Ref_Id_2BHK;

	@FindBy(xpath = "(//input[@checkedclassname='2BHK' and @placeholder='Min'])[1]")
	private WebElement RERA_Carpet_Area_Min_2BHK;

	@FindBy(xpath = "(//input[@checkedclassname='2BHK' and @placeholder='Max'])[1]")
	private WebElement RERA_Carpet_Area_Max_2BHK;

	@FindBy(xpath = "(//input[@checkedclassname='2BHK' and @placeholder='Min'])[2]")
	private WebElement RERA_Exclusive_Area_Min_2BHK;

	@FindBy(xpath = "(//input[@checkedclassname='2BHK' and @placeholder='Max'])[2]")
	private WebElement RERA_Exclusive_Area_Max_2BHK;

	@FindBy(xpath = "//input[@checkedclassname='3BHK' and @placeholder='Please enter typology ref id']")
	private WebElement Typology_Ref_Id_3BHK;

	@FindBy(xpath = "(//input[@checkedclassname='3BHK' and @placeholder='Min'])[1]")
	private WebElement RERA_Carpet_Area_Min_3BHK;

	@FindBy(xpath = "(//input[@checkedclassname='3BHK' and @placeholder='Max'])[1]")
	private WebElement RERA_Carpet_Area_Max_3BHK;

	@FindBy(xpath = "(//input[@checkedclassname='3BHK' and @placeholder='Min'])[2]")
	private WebElement RERA_Exclusive_Area_Min_3BHK;

	@FindBy(xpath = "(//input[@checkedclassname='3BHK' and @placeholder='Max'])[2]")
	private WebElement RERA_Exclusive_Area_Max_3BHK;

	@FindBy(xpath = "//input[@checkedclassname='1BHK' and @placeholder='Choose file']")
	private WebElement images_1BHK;

	@FindBy(xpath = "//input[@checkedclassname='2BHK' and @placeholder='Choose file']")
	private WebElement images_2BHK;

	@FindBy(xpath = "//input[@checkedclassname='3BHK' and @placeholder='Choose file']")
	private WebElement images_3BHK;

	@FindBy(xpath = "//label[text()='Converted Parking']")
	private WebElement Converted_Parking_Amenitie;

	@FindBy(xpath = "//label[text()='Fitness Center']")
	private WebElement Fitness_Center_Amenitie;

	@FindBy(xpath = "//label[text()='Converted Parking']")
	private WebElement Rooftop_terrace_Amenitie;

	@FindBy(xpath = "//label[text()='Converted Parking']")
	private WebElement Everest_Parking_Amenitie;

	@FindBy(xpath = "(//label[text()='Office'])[1]")
	private WebElement Space_Type_Office;

	@FindBy(xpath = "(//label[text()='Retail'])[1]")
	private WebElement Space_Type_Retail;

	@FindBy(xpath = "(//label[text()='Warehouse'])[1]")
	private WebElement Space_Type_Warehouse;

	@FindBy(xpath = "//input[@checkedclassname='Office' and @placeholder='Please enter typology ref id']")
	private WebElement Typology_Ref_Id_Office;

	@FindBy(xpath = "(//input[@checkedclassname='Office' and @placeholder='Min'])[1]")
	private WebElement RERA_Carpet_Area_Min_Office;

	@FindBy(xpath = "(//input[@checkedclassname='Office' and @placeholder='Max'])[1]")
	private WebElement RERA_Carpet_Area_Max_Office;

	@FindBy(xpath = "(//input[@checkedclassname='Office' and @placeholder='Min'])[2]")
	private WebElement RERA_Exclusive_Area_Min_Office;

	@FindBy(xpath = "(//input[@checkedclassname='Office' and @placeholder='Max'])[2]")
	private WebElement RERA_Exclusive_Area_Max_Office;

	@FindBy(xpath = "//input[@checkedclassname='Office' and @placeholder='Choose file']")
	private WebElement images_Office;

	@FindBy(xpath = "//input[@checkedclassname='Retail' and @placeholder='Please enter typology ref id']")
	private WebElement Typology_Ref_Id_Retail;

	@FindBy(xpath = "(//input[@checkedclassname='Retail' and @placeholder='Min'])[1]")
	private WebElement RERA_Carpet_Area_Min_Retail;

	@FindBy(xpath = "(//input[@checkedclassname='Retail' and @placeholder='Max'])[1]")
	private WebElement RERA_Carpet_Area_Max_Retail;

	@FindBy(xpath = "(//input[@checkedclassname='Retail' and @placeholder='Min'])[2]")
	private WebElement RERA_Exclusive_Area_Min_Retail;

	@FindBy(xpath = "(//input[@checkedclassname='Retail' and @placeholder='Max'])[2]")
	private WebElement RERA_Exclusive_Area_Max_Retail;

	@FindBy(xpath = "//input[@checkedclassname='Retail' and @placeholder='Choose file']")
	private WebElement images_Retail;

	@FindBy(xpath = "//input[@checkedclassname='Warehouse' and @placeholder='Please enter typology ref id']")
	private WebElement Typology_Ref_Id_Warehouse;

	@FindBy(xpath = "(//input[@checkedclassname='Warehouse' and @placeholder='Min'])[1]")
	private WebElement RERA_Carpet_Area_Min_Warehouse;

	@FindBy(xpath = "(//input[@checkedclassname='Warehouse' and @placeholder='Max'])[1]")
	private WebElement RERA_Carpet_Area_Max_Warehouse;

	@FindBy(xpath = "(//input[@checkedclassname='Warehouse' and @placeholder='Min'])[2]")
	private WebElement RERA_Exclusive_Area_Min_Warehouse;

	@FindBy(xpath = "(//input[@checkedclassname='Warehouse' and @placeholder='Max'])[2]")
	private WebElement RERA_Exclusive_Area_Max_Warehouse;

	@FindBy(xpath = "//input[@checkedclassname='Warehouse' and @placeholder='Choose file']")
	private WebElement images_Warehouse;

	

	public void Click_On_Projects_Tab() throws InterruptedException {
		logger.info("Executing Method :-" + "Click_On_Projects_Tab()");

		try {
			Thread.sleep(1000);
			Projects_Tab.click();
		} catch (NoSuchElementException e) {
			logger.error("Project Tab button is not clickable", e);
		}

	}

	public void CLick_On_the_Add_Project_Button() {
		logger.info("Executing Method :-" + "CLick_On_the_Add_Project_Button()");

		try {

			Add_Project_Button.click();

		} catch (NoSuchElementException e) {
			logger.error("Add Project Button Is Not Clickable", e);
		}
	}

	public void Enter_Project_Ref_Id() throws IOException {
		logger.info("Executing Method :-" + "Enter_Project_Ref_Id()");

		try {
			enterData(Project_Ref_Id_Field, "Project_Ref_Id");

		} catch (Exception e) {
			System.err.println(e);
			System.err.println("Error in Method :-" + "Enter_Project_Ref_Id()");
		}
	}

	public void Enter_Project_Name() throws IOException {
		logger.info("Executing Method :-" + "Enter_Project_Name()");

		try {
			enterData(Project_Name_Field, "Project_Name");

		} catch (Exception e) {
			System.err.println(e);
			System.err.println("Error in Method :-" + "Enter_Project_Name()");
		}
	}

	public void Enter_Description() throws IOException {
		logger.info("Executing Method :-" + "Enter_Description()");

		try {
			assert Description_Field.isDisplayed() : "Description field not visible";
			enterData(Description_Field, "Description");

		} catch (Exception e) {
			System.err.println(e);
			System.err.println("Error in Method :-" + "Enter_Description()");
		}
	}

	public void Select_Cover_Image() throws IOException {
		logger.info("Executing Method :-" + "Select_Cover_Image()");

		try {
			scroll(Cover_Image);
			enterData(Cover_Image, "Cover_Image");
		} catch (InvalidArgumentException e) {
			logger.error("Invalid file path for cover image", e);
		} catch (NoSuchElementException e) {
			logger.error("Cover Image File Not Found", e);
		}

	}

	public void Select_Sales_Kit() throws IOException {
		logger.info("Executing Method :-" + "Select_Sales_Kit()");
		try {
			enterData(Sales_Kit, "Sales_Kit");

		} catch (NoSuchElementException e) {
			logger.error("Sales Kit Field is not clickable", e);
		} catch (InvalidPathException e) {
			logger.error("Invalid File Path of Sales Kit", e);
		}
	}

	public void Enter_Website() throws IOException {
		logger.info("Executing Method :-" + "Enter_Website()");

		try {
			enterData(Website, "Website");

		} catch (Exception e) {
			System.err.println(e);
			System.err.println("Error in Method :-" + "Enter_Website()");
		}

	}

	public void Enter_Address_Line_1() throws IOException {
		logger.info("Executing Method :-" + "Enter_Address_Line_1()");

		try {
			enterData(Address_Line_1, "Address_Line_1");

		} catch (Exception e) {
			System.err.println(e);
			System.err.println("Error in Method :-" + "Enter_Address_Line_1()");
		}

	}

	public void Enter_Address_Line_2() throws IOException {
		logger.info("Executing Method :-" + "Enter_Address_Line_2()");

		try {
			enterData(Address_Line_2, "Address_Line_2");

		} catch (Exception e) {
			System.err.println(e);
			System.err.println("Error in Method :-" + "Enter_Address_Line_2()");
		}
	}

	public void Enter_Postal_Code() throws IOException {
		logger.info("Executing Method :-" + "Enter_Postal_Code()");

		try {
			enterData(Postal_Code, "Postal_Code");

		} catch (Exception e) {
			System.err.println(e);
			System.err.println("Error in Method :-" + "Enter_Postal_Code()");
		}
	}

	public void Select_Contry() throws IOException {
		logger.info("Executing Method :-" + "Select_Contry()");

		try {
			scroll(Country);
			wait.until(ExpectedConditions.elementToBeClickable(Country));
			Country.click();

			action.sendKeys(UtilityClass.GetData("Country")).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
					.sendKeys(Keys.ENTER).perform();

		} catch (NoSuchElementException e) {
			logger.error("Country Dropdown Not Found", e);
		} catch (MoveTargetOutOfBoundsException e) {
			logger.error("Country Dropdown Can Not Be Interacted ", e);
		}

	}

	public void Select_State() throws IOException {
		logger.info("Executing Method :-" + "Select_State()");

		try {
			State.click();
			action.sendKeys(UtilityClass.GetData("State")).sendKeys(Keys.ENTER).perform();

		} catch (Exception e) {
			System.err.println(e);
			System.err.println("Error in Method :-" + "Select_State()");
		}

	}

	public void Select_City() throws IOException {
		logger.info("Executing Method :-" + "Select_City()");

		try {
			City.click();
			action.sendKeys("kolhapur").sendKeys(Keys.ENTER).perform();

		} catch (Exception e) {
			System.err.println(e);
			System.err.println("Error in Method :-" + "Select_City()");
		}

	}

	public void Locality() throws IOException, InterruptedException {
		logger.info("Executing Method:-" + "Locality()");

		try {
			// Thread.sleep(2000);
			// action.sendKeys(Keys.TAB),"Locality")).perform();
			scroll(Locality);
			wait.until(ExpectedConditions.elementToBeClickable(Locality));
			enterData(Locality, "Locality");
		} catch (NoSuchElementException e) {
			logger.error("Locality Filed is not available", e);
		} catch (ElementNotInteractableException e) {
			logger.error("Not able to Edit Locality Field", e);
		}
	}

	public void Latitude() throws IOException {
		logger.info("Executing Method:-" + "Latitude()");

		try {
			enterData(Latitude, "Latitude");
		} catch (NoSuchElementException e) {
			logger.error("Latitude Filed is not available", e);
		} catch (ElementNotInteractableException e) {
			logger.error("Not able to Edit Latitude Field", e);
		}
	}

	public void Longitude() throws IOException {
		logger.info("Executing Method:-" + "Longitude()");

		try {
			enterData(Longitude, "Longitude");
		} catch (NoSuchElementException e) {
			logger.error("Longitude Filed is not available", e);
		} catch (ElementNotInteractableException e) {
			logger.error("Not able to Edit Longitude Field", e);
		}
	}

	public void ProjectType_Residential() {
		logger.info("Executing Method :-" + "ProjectType_Residential()");

		try {
			Residential.click();
		} catch (NoSuchElementException e) {
			logger.error("Project Type Residential is not clickable", e);
		}

	}

	public void ProjectType_Commercial() {
		logger.info("Executing Method :-" + "ProjectType_Commercial()");

		try {
			Commercial.click();
		} catch (NoSuchElementException e) {
			logger.error("Project Type Commercial is not clickable", e);
		}

	}

	public void Amenities() throws IOException {
		logger.info("Ececuting Method :-" + "Amenities()");
		scroll(Amenities_Clubhouse);
		wait.until(ExpectedConditions.visibilityOf(Amenities_Clubhouse));
		String Clubhouse = UtilityClass.GetData("Social_Clubhouse");
		String Community_Hall = UtilityClass.GetData("Social_Community_Hall");
		String Landscaped_Garden = UtilityClass.GetData("Social_Landscaped_Garden");
		String swimming_pool = UtilityClass.GetData("Social_swimming_pool");
		String Lifestyle_amenitites = UtilityClass.GetData("Social_Lifestyle_amenitites");
		String Poolside_Cabana = UtilityClass.GetData("Social_Poolside_Cabana");

		if (Clubhouse.equalsIgnoreCase("yes")) {
			Amenities_Clubhouse.click();
		}
		if (Community_Hall.equalsIgnoreCase("yes")) {
			Amenities_Community_Hall.click();
		}
		if (Landscaped_Garden.equalsIgnoreCase("yes")) {
			Amenities_Landscaped_Garden.click();
		}
		if (swimming_pool.equalsIgnoreCase("yes")) {
			Amenities_swimming_pool.click();
		}
		if (Lifestyle_amenitites.equalsIgnoreCase("yes")) {
			Amenities_Lifestyle_amenitites.click();
		}
		if (Poolside_Cabana.equalsIgnoreCase("yes")) {
			Amenities_Poolside_Cabana.click();
		}

	}

	public void Kids_Amenities() throws IOException, InterruptedException {
		logger.info("Executing Method :-" + "Kids_Amenities()");
		try {

			scroll(Kids_Pool);
			wait.until(ExpectedConditions.visibilityOf(Kids_Pool));

			String kids_Pool = UtilityClass.GetData("Kids_Pool");
			String daycare_Center = UtilityClass.GetData("Daycare_Center");
			String kids_Playground = UtilityClass.GetData("Kids_Playground");
			String toddler_play_Area = UtilityClass.GetData("Toddler_play_Area");

			Thread.sleep(2000);
			if (kids_Pool.equalsIgnoreCase("yes")) {
				Kids_Pool.click();
			}
			if (daycare_Center.equalsIgnoreCase("yes")) {
				Daycare_Center.click();
			}
			if (kids_Playground.equalsIgnoreCase("yes")) {
				Kids_Playground.click();
			}
			if (toddler_play_Area.equalsIgnoreCase("yes")) {
				Toddler_play_Area.click();
			}
		} catch (Exception e) {
			logger.error("SOmething went wrong while Executing Method :- " + "Kids_Amenities()");
		}
	}

	public void Select_Area_Type() throws InterruptedException {
		logger.info("Executing Method :- " + "Select_Area_Type()");
		Thread.sleep(1000);
		// scroll();
		action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).perform();

	}

	public void Space_Type_1BHK() throws IOException {
		logger.info("Executing Method :- " + "Space_Details");
		scroll(BHK1);

		String space_type = UtilityClass.GetData("Space_type_1BHK");

		if (space_type.equalsIgnoreCase("1BHK")) {
			BHK1.click();

			enterData(Typology_Ref_Id_1BHK, "Typology_Ref_Id_1BHK");
			enterData(RERA_Carpet_Area_Min_1BHK, "RERA_Carpet_Area_Min_1BHK");
			enterData(RERA_Carpet_Area_Max_1BHK, "RERA_Carpet_Area_Max_2BHK");
			enterData(RERA_Exclusive_Area_Min_1BHK, "RERA_Exclusive_Area_Min_1BHK");
			enterData(RERA_Exclusive_Area_Max_1BHK, "RERA_Exclusive_Area_Max_1BHK");
			enterData(images_1BHK, "Images_1BHK");
		}

	}

	public void Space_Type_2BHK() throws IOException {
		logger.info("Executing Method :- " + "Space_Type_2BHK");
		scroll(BHK2);

		String space_type = UtilityClass.GetData("Space_type_2BHK");

		if (space_type.equalsIgnoreCase("2BHK")) {
			BHK2.click();

			enterData(Typology_Ref_Id_2BHK, "Typology_Ref_Id_2BHK");
			enterData(RERA_Carpet_Area_Min_2BHK, "RERA_Carpet_Area_Min_2BHK");
			enterData(RERA_Carpet_Area_Max_2BHK, "RERA_Carpet_Area_Max_2BHK");
			enterData(RERA_Exclusive_Area_Min_2BHK, "RERA_Exclusive_Area_Min_2BHK");
			enterData(RERA_Exclusive_Area_Max_2BHK, "RERA_Exclusive_Area_Max_2BHK");
			enterData(images_2BHK, "Images_2BHK");
		}
	}

	public void Space_Type_3BHK() throws IOException {
		logger.info("Executing Method :- " + "Space_Type_3BHK");
		scroll(BHK3);

		String space_type = UtilityClass.GetData("Space_type_3BHK");

		if (space_type.equalsIgnoreCase("3BHK")) {
			BHK3.click();

			enterData(Typology_Ref_Id_3BHK, "Typology_Ref_Id_3BHK");
			enterData(RERA_Carpet_Area_Min_3BHK, "RERA_Carpet_Area_Min_3BHK");
			enterData(RERA_Carpet_Area_Max_3BHK, "RERA_Carpet_Area_Max_3BHK");
			enterData(RERA_Exclusive_Area_Min_3BHK, "RERA_Exclusive_Area_Min_3BHK");
			enterData(RERA_Exclusive_Area_Max_3BHK, "RERA_Exclusive_Area_Max_3BHK");
			enterData(images_3BHK, "Images_3BHK");
		}
	}

	public void Commercial_Amenities() throws InterruptedException {
		logger.info("Executing Method :-" + "Commercial_Amenities()");

		scroll(Converted_Parking_Amenitie);

		Thread.sleep(1000);
		Converted_Parking_Amenitie.click();
		Rooftop_terrace_Amenitie.click();
	}

	public void Space_Type() throws IOException {
		logger.info("Executing Method :- " + "Space_Type()");

		String Office = UtilityClass.GetData("Space_Type_Office");
		String Retail = UtilityClass.GetData("Space_Type_Retail");
		String Warehouse = UtilityClass.GetData("Space_Type_Warehouse");

		if (Office.equalsIgnoreCase("Office")) {
			scroll(Space_Type_Office);
			Space_Type_Office.click();

			scroll(Typology_Ref_Id_Office);
			enterData(Typology_Ref_Id_Office, "Typology_Ref_Id_Office");
			enterData(RERA_Carpet_Area_Min_Office, "RERA_Carpet_Area_Min_Office");
			enterData(RERA_Carpet_Area_Max_Office, "RERA_Carpet_Area_Max_Office");
			enterData(RERA_Exclusive_Area_Min_Office, "RERA_Exclusive_Area_Min_Office");
			enterData(RERA_Exclusive_Area_Max_Office, "RERA_Exclusive_Area_Max_Office");
			enterData(images_Office, "Images_Office");

		}

		if (Retail.equalsIgnoreCase("Retail")) {
			scroll(Space_Type_Retail);
			Space_Type_Retail.click();

			scroll(Typology_Ref_Id_Retail);
			enterData(Typology_Ref_Id_Retail, "Typology_Ref_Id_Retail");
			enterData(RERA_Carpet_Area_Min_Retail, "RERA_Carpet_Area_Min_Retail");
			enterData(RERA_Carpet_Area_Max_Retail, "RERA_Carpet_Area_Max_Retail");
			enterData(RERA_Exclusive_Area_Min_Retail, "RERA_Exclusive_Area_Min_Retail");
			enterData(RERA_Exclusive_Area_Max_Retail, "RERA_Exclusive_Area_Max_Retail");
			enterData(images_Retail, "Images_Retail");
		}

		if (Warehouse.equalsIgnoreCase("Warehouse")) {
			scroll(Space_Type_Warehouse);
			Space_Type_Warehouse.click();

			scroll(Typology_Ref_Id_Warehouse);
			enterData(Typology_Ref_Id_Warehouse, "Typology_Ref_Id_Warehouse");
			enterData(RERA_Carpet_Area_Min_Warehouse, "RERA_Carpet_Area_Min_Warehouse");
			enterData(RERA_Carpet_Area_Max_Warehouse, "RERA_Carpet_Area_Max_Warehouse");
			enterData(RERA_Exclusive_Area_Min_Warehouse, "RERA_Exclusive_Area_Min_Warehouse");
			enterData(RERA_Exclusive_Area_Max_Warehouse, "RERA_Exclusive_Area_Max_Warehouse");
			enterData(images_Warehouse, "Images_Warehouse");
		}
	}

}
