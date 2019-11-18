package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class ColorlibLoginPage extends PageObject{
	
	//Campo usuario
	@FindBy(xpath="(//INPUT[@type='text'])[1]")
	public WebElementFacade txtUSer;
	
	//Campo pw
	@FindBy(xpath="(//INPUT[@type='password'])[1]")
	public WebElementFacade txtPw;
	
	//Boton login
	@FindBy(xpath="//BUTTON[@class='btn btn-lg btn-primary btn-block'][text()='Sign in']")
	public WebElementFacade btnLogin;
	
	//label home
	@FindBy(xpath="//H1[@id='bootstrap-admin-template']")
	public WebElementFacade lblHome;
	

	public void IngresaDatos(String user, String pw) {
		txtUSer.sendKeys(user);
		txtPw.sendKeys(pw);
		btnLogin.click();
	}
	
	public void VerificaHome() {
		String label = "Bootstrap-Admin-Template";
		String msj = lblHome.getText();
		assertThat(msj, containsString(label));
	}
}