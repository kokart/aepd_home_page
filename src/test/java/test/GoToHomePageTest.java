package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.HomePage;

public class GoToHomePageTest extends BaseTest {

	// Create datasheet
	@DataProvider(name = "CookiesNombreBoton")
	public Object[][] create_dataset1() {
		return new Object[][] { { "Agencia Española de Protección de Datos | AEPD" } };
	}

	/**
	 * This test fill the form. Happy path.
	 * 
	 * @throws InterruptedException
	 */
	@Test(dataProvider = "CookiesNombreBoton")
	public void  cookiesButtonClicked(String titleFormPageToCheck) throws InterruptedException {

		HomePage homePage = new HomePage(driver);

		homePage.goToFormPage();

		// Check we are at AEPD Home Page
		Assert.assertEquals(homePage.getTitlePage(), titleFormPageToCheck);
		
		//Click to disable Cookies button
		homePage.btn_SubmitEntendidoCookies();



		}

}