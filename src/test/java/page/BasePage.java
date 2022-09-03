package page;

import org.openqa.selenium.WebDriver;

public class BasePage {
	public WebDriver driver;

	// Constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	// Get tittle of the Current Page
	public String getTitlePage() {
		return driver.getTitle();
	}

	// Get Source Code of the Current Page
	public String getSourceCodeOfHTMLPage() {
		return driver.getPageSource();
	}
}