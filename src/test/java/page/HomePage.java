package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// WebElements on the Home Page. Locators by xpath. We
	// should encourage dev team to add IDS for QA. 


	//URL FormPage
	public final String baseURL = "https://www.aepd.es";


	//Submit button
	private final String submitButtonID="ddm-form-submit";
	private final String botonEntendidoCookies = "//*[@id='popup-buttons']/button";




	//Return entendido button object
	public WebElement btn_SubmitEntendidoCookies() {
		return driver.findElement(By.xpath(botonEntendidoCookies));
	}


	//*********Page Methods*********

	//Go to Form Page
	public void goToFormPage() {
		driver.get(baseURL);
	}


	//Click on Entendido Cookies button
	public void submitEntendidoCookies() {
		btn_SubmitEntendidoCookies().click();
	}
}
