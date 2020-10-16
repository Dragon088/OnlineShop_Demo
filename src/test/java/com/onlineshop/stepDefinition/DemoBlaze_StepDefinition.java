package com.onlineshop.stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.onlineshop.Utility.AssertionLibrary;
import com.onlineshop.Utility.GenericMethod;
import com.onlineshop.baseClass.BaseClass;
import com.onlineshop.javaPage.DemoBlaze_JavaPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class DemoBlaze_StepDefinition {

	WebDriver driver;
	BaseClass base;
	DemoBlaze_JavaPage javaPage;
	static int pricevalue;
	
	@Before
	public void InitailSetUp() throws IOException {
		base = new BaseClass();

	}

	@Given("I am on landing page of online shop demoblaze")
	public void i_am_on_landing_page_of_online_shop_demoblaze() {
		this.driver = BaseClass.invokeApplication();
	}

	@When("navigate to Laptop and select Sony vaio i5 product")
	public void navigate_to_Laptop_and_select_Sony_vaio_i_product() throws IOException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		GenericMethod gm = new GenericMethod(driver);
		javaPage = new DemoBlaze_JavaPage(driver);
		javaPage.ClickLaptopAndSelectSony();
		
	}

	@And("navigate to Laptop and select Dell i7 8gb product")
	public void navigate_to_Laptop_and_select_Dell_i_gb_product() {
		javaPage.NavigateToLaptopAndSelectDell();
	}

	

	@And("click on add to cart")
	public void click_on_add_to_cart() {
		javaPage.addToCart();
	}

	@And("accept pop up confirmation")
	public void accept_pop_up_confirmation() {
		javaPage.acceptPopUP();
	}

	@And("click on home page icon")
	public void click_on_home_page_icon() {
		javaPage.clickHome();
	}

	@And("click on cart")
	public void click_on_cart() {
		javaPage.clickCart();
	}

	@And("click on Delete Dell i7 8gb from cart")
	public void click_on_Delete_Dell_i_gb_from_cart() {
		javaPage.clickDelete();
	}

	@And("click on Place order")
	public void click_on_Place_order() {
		
		pricevalue = javaPage.PlaceOrder();
		System.out.println(pricevalue);
	}
	@Then("verify that purchase amount equals expected")
	public void verify_that_purchase_amount_equals_expected() {
		System.out.println(pricevalue);
		 AssertionLibrary.assertEquals(790, pricevalue);
	}

	@And("^fill in all web form fields$")
	public void fill_in_all_web_form_fields(DataTable datatable) {
		List<Map<String, String>> list = datatable.asMaps(String.class, String.class);
		String name = list.get(0).get("name");
		String country = list.get(0).get("country");
		String city = list.get(0).get("city");
		String creditcard = list.get(0).get("creditcard");
		String month = list.get(0).get("month");
		String year = list.get(0).get("year");		
		
		javaPage.FillAllDetails(name,country, city, creditcard, month, year);


	}

	@And("click on Purchase")
	public void click_on_Purchase() {
		javaPage.clickPurchage();
	}

	@And("capture and log purchase Id and Amount")
	public void capture_and_log_purchase_Id_and_Amount() {
		javaPage.FetchIDAndAmount();
		
	}

	@And("click on ok")
	public void click_on_ok() {
		javaPage.clickOk();
	}

	@After
	public void tearDown() throws IOException {

		base.report.flush();
		
		// driver.quit();

	}
}
