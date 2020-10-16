package com.onlineshop.javaPage;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.onlineshop.Utility.GenericMethod;
import com.onlineshop.Utility.WaitUtil;

public class DemoBlaze_JavaPage extends GenericMethod {
	
	
	
	public DemoBlaze_JavaPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	By Delete = By.xpath("//td[text()='Dell i7 8gb']/following-sibling::td/a");
	By PlaceOrder = By.xpath("//button[@class='btn btn-success']");
	By Cart = By.xpath("//a[@class='nav-link'][text()='Cart']");
	By Home = By.xpath("//a[@class='nav-link'][text()='Home ']");
	By AddToCart = By.xpath("//a[text()='Add to cart']");
	By SonyViaoI5 = By.xpath("//a[text()='Sony vaio i5']");
	By DellI78GB = By.xpath("//a[text()='Dell i7 8gb']");

	By Laptops = By.xpath("//a[@class='list-group-item'][text()='Laptops']");
	By textfetch = By.xpath("//p[@class='lead text-muted ']");
	By Ok = By.xpath("//button[text()='OK']");

	By Name = By.xpath("//input[@class='form-control'][@id='name']");
	By Country = By.xpath("//input[@class='form-control'][@id='country']");
	By City = By.xpath("//input[@class='form-control'][@id='city']");
	By Card = By.xpath("//input[@class='form-control'][@id='card']");
	By Month = By.xpath("//input[@class='form-control'][@id='month']");
	By Year = By.xpath("//input[@class='form-control'][@id='year']");
	By Purchage = By.xpath("//button[@class='btn btn-primary'][text()='Purchase']");
	
	By Price = By.xpath("//h3[@id='totalp']");
	

	public void ClickLaptopAndSelectSony() {

		try {
			WaitUtil.sleep(3000);
			click(Laptops);
			WaitUtil.sleep(4000);
			click(SonyViaoI5);

		} catch (Exception e) {

		}
	}

	public void addToCart() {

		try {
			WaitUtil.sleep(3000);
			click(AddToCart);

		} catch (Exception e) {

		}
	}

	public void acceptPopUP() {

		try {
			WaitUtil.sleep(3000);
			switchToAlertAccept();

		} catch (Exception e) {

		}
	}

	public void clickHome() {

		try {
			WaitUtil.sleep(3000);
			click(Home);

		} catch (Exception e) {

		}
	}

	public void NavigateToLaptopAndSelectDell() {

		try {
			WaitUtil.sleep(3000);
			click(Laptops);
			WaitUtil.sleep(4000);
		
			click(DellI78GB);

		} catch (Exception e) {

		}
	}

	public void clickCart() {

		try {
			WaitUtil.sleep(3000);
			click(Cart);
			WaitUtil.sleep(3000);

		} catch (Exception e) {

		}
	}

	public void clickDelete() {

		try {
			WaitUtil.sleep(3000);
			click(Delete);

		} catch (Exception e) {

		}
	}
	
	public int PlaceOrder() {
		int pricevalue = 0;
			try {
				WaitUtil.sleep(6000);
				String text = getText(Price);
				pricevalue = Integer.parseInt(text);
				System.out.println("price of product: "+pricevalue);
				WaitUtil.sleep(5000);
				click(PlaceOrder);

			} catch (Exception e) {

			}
			return pricevalue;
	}
	public void FillAllDetails(String name, String country, String city, String card, String month, String year) {

				try {
					WaitUtil.sleep(3000);
					setInput(Name, name);
					WaitUtil.sleep(3000);
					setInput(Country, country);
					WaitUtil.sleep(3000);
					setInput(City, city);
					WaitUtil.sleep(3000);
					setInput(Card, card);
					WaitUtil.sleep(3000);
					setInput(Month, month);
					WaitUtil.sleep(3000);
					setInput(Year, year);

				} catch (Exception e) {

				}	
	}
	public void clickPurchage() {

		try {
			WaitUtil.sleep(3000);
			click(Purchage);

		} catch (Exception e) {

		}
	}
	public void FetchIDAndAmount() {

		try {
			WaitUtil.sleep(3000);
			String text = getText(textfetch);
			System.out.println(text);
		
		} catch (Exception e) {

		}
	}

	
	public String verifyAmount() {
		String text = null;
		try {
			WaitUtil.sleep(3000);
			getText(textfetch);

		} catch (Exception e) {

		}
		return text;
	}
	public void clickOk() {

		try {
			WaitUtil.sleep(3000);
			click(Ok);
			quit();

		} catch (Exception e) {

		}
	}
}
