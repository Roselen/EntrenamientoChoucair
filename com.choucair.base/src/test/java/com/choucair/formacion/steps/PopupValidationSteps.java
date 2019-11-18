package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ColorlibLoginPage;
import com.choucair.formacion.pageobjects.ColorlibMenuPage;

import net.thucydides.core.annotations.Step;


public class PopupValidationSteps {
	
	ColorlibLoginPage colorlibLoginPage;
	ColorlibMenuPage colorlibMenuPage;
		
	@Step
	public void login(String userLogin, String pwLogin) {
		colorlibLoginPage.open();
		colorlibLoginPage.IngresaDatos(userLogin, pwLogin);
		colorlibLoginPage.VerificaHome();
	}
	
	@Step
	public void formValidation() {
		colorlibMenuPage.menuFormValidation();		
	}
}