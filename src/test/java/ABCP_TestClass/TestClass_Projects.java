package ABCP_TestClass;

import java.io.IOException;

import org.testng.annotations.Test;

import ABCP_TestUtility.BaseTest;

public class TestClass_Projects extends BaseTest{

	
	@Test(priority = 1)
	public void Open_Project_Tab() throws InterruptedException {
		projectClass.Click_On_Projects_Tab();
	}
	
	@Test(priority = 2)
	public void Add_Project() {
		projectClass.CLick_On_the_Add_Project_Button();
	}
	
	@Test(priority = 3)
	public void Enter_PRoject_Ref_ID() throws IOException {
		projectClass.Enter_Project_Ref_Id();
	}
	
	@Test(priority = 4)
	public void Enter_Project_Name() throws IOException {
		projectClass.Enter_Project_Name();
	}
	
	@Test(priority = 5)
	public void Enter_Description() throws IOException {
		projectClass.Enter_Description();
	}
	
	@Test(priority = 6)
	public void select_Cover_Image() throws IOException {
		projectClass.Select_Cover_Image();
	}
	
	@Test(priority = 7)
	public void select_Sales_Kit() throws IOException {
		projectClass.Select_Sales_Kit();
	}
	
	@Test(priority = 8)
	public void Enter_Website() throws IOException {
		projectClass.Enter_Website();
	}
	
	@Test(priority = 9)
	public void Enter_Address_Line_1() throws IOException {
		projectClass.Enter_Address_Line_1();
	}
	
	@Test(priority = 10)
	public void Enter_Address_Line_2() throws IOException {
		projectClass.Enter_Address_Line_2();
	}
	
	@Test(priority = 11)
	public void enter_Postal_Code() throws IOException {
		projectClass.Enter_Postal_Code();
	}
	
	@Test(priority = 12)
	public void Select_Contry() throws IOException {
		projectClass.Select_Contry();
	}
	
	@Test(priority = 13)
	public void Select_State() throws IOException {
		projectClass.Select_State();
	}
	
	
	@Test(priority = 14)
	public void Select_City() throws IOException {
		projectClass.Select_City();
	}
	
	
	@Test(priority = 15)
	public void Locality() throws IOException, InterruptedException {
		projectClass.Locality();
	}
	
	@Test(priority = 16)
	public void Latitude() throws IOException {
		projectClass.Latitude();
	}
	
	
	@Test(priority = 17)
	public void Longitude() throws IOException {
		projectClass.Longitude();
	}
	
	@Test(priority = 18)
	public void ProjectType_Residential() throws IOException {
		projectClass.ProjectType_Residential();
	}
	
	@Test(priority = 19)
	public void ProjectType_Commercial() throws IOException {
		projectClass.ProjectType_Commercial();
	}
	
	
	@Test(priority = 20)
	public void Amenities() throws IOException {
		projectClass.Amenities();
	}
	
	
	@Test(priority = 21)
	public void Kids_Amenities() throws IOException, InterruptedException {
		projectClass.Kids_Amenities();
	}
	
	@Test(priority = 22)
	public void Select_Area_Type() throws InterruptedException {
		//projectClass.Select_Area_Type();
	}
	
	@Test(priority = 23)
	public void Space_Type_1BHK() throws IOException {
		projectClass.Space_Type_1BHK();
	}
	
	
	@Test(priority = 24)
	public void Space_Type_2BHK() throws IOException {
		projectClass.Space_Type_2BHK();
	}
	
	@Test(priority = 25)
	public void Space_Type_3BHK() throws IOException {
		projectClass.Space_Type_3BHK();
	}
	
	
	@Test(priority = 26)
	public void Commercial_Amenities() throws IOException, InterruptedException {
		projectClass.Commercial_Amenities();
	}
	
	@Test(priority = 27)
	public void Space_Type() throws IOException {
		projectClass.Space_Type();
	}
	
	
}
