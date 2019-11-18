package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import  net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibFormValidationPage extends PageObject{
	
	//Required
	@FindBy(xpath="//INPUT[@id='req']")
	public WebElementFacade txtRequired;
	
	//Select
	@FindBy(xpath="//SELECT[@id='sport']")
	public WebElementFacade cmbSelect;
	
	//Multiple Select
	@FindBy(xpath="//SELECT[@id='sport2']")
	public WebElementFacade mtpSelect;
	
	//Url
	@FindBy(xpath="//INPUT[@id='url1']")
	public WebElementFacade txtUrl;
	
	//E-mail
	@FindBy(xpath="//INPUT[@id='email1']")
	public WebElementFacade txtEmail;
	
	//Password
	@FindBy(xpath="//INPUT[@id='pass1']")
	public WebElementFacade txtPw1;
	
	//Confirm Password
	@FindBy(xpath="//INPUT[@id='pass2']")
	public WebElementFacade txtPw2;
	
	//Minimum field size (6)
	@FindBy(xpath="//INPUT[@id='minsize1']")
	public WebElementFacade txtMin;
	
	//Maximum field size, optional
	@FindBy(xpath="//INPUT[@id='maxsize1']")
	public WebElementFacade txtMax;
	
	//Number
	@FindBy(xpath="//INPUT[@id='number2']")
	public WebElementFacade txtNumber;
	
	//IP
	@FindBy(xpath="//INPUT[@id='ip']")
	public WebElementFacade txtIP;
	
	//Date
	@FindBy(xpath="//INPUT[@id='date3']")
	public WebElementFacade txtDate;
	
	//Date Earlier
	@FindBy(xpath="//INPUT[@id='past']")
	public WebElementFacade txtDateEarlier;
	
	//Button validate
	@FindBy(xpath="(//INPUT[@type='submit'])[1]")
	public WebElementFacade btnValidate;
	
	
	//Globo informativo
	@FindBy(className = "formErrorContent")
	public WebElementFacade globo;
	
	public void Required(String dato) {
		txtRequired.click();
		txtRequired.clear();
		txtRequired.sendKeys(dato);
	}
	
	public void Select(String dato) {
		cmbSelect.click();
		cmbSelect.selectByVisibleText(dato);
	}
	
	public void MultipleSelect(String dato) {
		mtpSelect.selectByVisibleText(dato);
	}
	
	public void Url(String dato) {
		txtUrl.click();
		txtUrl.clear();
		txtUrl.sendKeys(dato);
	}
	
	public void Email(String dato) {
		txtEmail.click();
		txtEmail.clear();
		txtEmail.sendKeys(dato);
	}
	
	public void Password(String dato) {
		txtPw1.click();
		txtPw1.clear();
		txtPw1.sendKeys(dato);
	}
	
	public void Confirm_Password(String dato) {
		txtPw2.click();
		txtPw2.clear();
		txtPw2.sendKeys(dato);
	}
	
	public void Minimum(String dato) {
		txtMin.click();
		txtMin.clear();
		txtMin.sendKeys(dato);
	}
	
	public void Maximum(String dato) {
		txtMax.click();
		txtMax.clear();
		txtMax.sendKeys(dato);
	}
	
	public void Number(String dato) {
		txtNumber.click();
		txtNumber.clear();
		txtNumber.sendKeys(dato);
	}
	
	public void IP(String dato) {
		txtIP.click();
		txtIP.clear();
		txtIP.sendKeys(dato);
	}
	
	public void Date(String dato) {
		txtDate.click();
		txtDate.clear();
		txtDate.sendKeys(dato);
	}
	
	public void Date_Earlier(String dato) {
		txtDateEarlier.click();
		txtDateEarlier.clear();
		txtDateEarlier.sendKeys(dato);
	}
	
	public void Validate() {
		btnValidate.click();
	}
	
	public void sinError() {
		assertThat(globo.isCurrentlyVisible(), is(false));
	}
	
	public void conError() {
		assertThat(globo.isCurrentlyVisible(), is(true));
	}

}
