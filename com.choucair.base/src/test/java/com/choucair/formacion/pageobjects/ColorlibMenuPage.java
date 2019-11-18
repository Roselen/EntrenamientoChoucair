package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ColorlibMenuPage extends PageObject{
	
	//Menú Forms
	@FindBy(xpath="(//A[@href='javascript:;'])[3]")
	public WebElementFacade mnForms;
	
	//Submenú Form Validation
	@FindBy(xpath="(//A[@href='form-validation.html'])[2]")
	public WebElementFacade smnFormV;
	
	//Popup Validation lbl
	@FindBy(xpath="//H5[text()='Popup Validation']")
	public WebElementFacade lblPopUp;
	
	//submenú Form General
	@FindBy(xpath="(//A[@href='form-general.html'])[2]")
	public WebElementFacade mnFormGral;
	
	public void menuFormValidation() {
		mnForms.click();
		smnFormV.click();
		String msj = lblPopUp.getText();
		assertThat(msj, containsString("Popup Validation"));
	}

}
