package pruebaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page.LoginPage;

public class PruebaLogin {

	@Test
	public void prueba() {
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.facebook.com/");
		
		LoginPage objlogin=new LoginPage(browser);
		objlogin.ingresarEmail("*******");
		objlogin.ingresarClave("*****");
		objlogin.clickBotonSesion();
		
	}
}
