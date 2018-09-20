package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	
	private By cajaUsuario = By.id("email");
	private By cajaClave = By.id("pass");
	//@FindBy(id = "u_0_2")
	private By botonSesion=By.id("u_0_2");
	
	private WebDriver webDriver = null;
	
	public LoginPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public void ingresarEmail(String email) {
		webDriver.findElement(cajaUsuario).sendKeys(email);
	}
	
	public void ingresarClave(String clave) {
		webDriver.findElement(cajaClave).sendKeys(clave);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickBotonSesion() {
		webDriver.findElement(botonSesion).click();
		
	}

}



