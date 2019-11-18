package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ColorlibFormValidationPage;

import java.util.List;
import net.thucydides.core.annotations.Step;

public class ColorlibFormValidationSteps {
	
	ColorlibFormValidationPage colorlibFormValidationPage;
	
	@Step
	public void diligencio_Popup_datos_tabla(List<List<String>> data, int id) {	
		colorlibFormValidationPage.Required(data.get(id).get(0).trim()); //Fila - Columna
		colorlibFormValidationPage.Select(data.get(id).get(1).trim());
		colorlibFormValidationPage.MultipleSelect(data.get(id).get(2).trim());
		colorlibFormValidationPage.MultipleSelect(data.get(id).get(3).trim());
		colorlibFormValidationPage.Url(data.get(id).get(4).trim());
		colorlibFormValidationPage.Email(data.get(id).get(5).trim());
		colorlibFormValidationPage.Password(data.get(id).get(6).trim());
		colorlibFormValidationPage.Confirm_Password(data.get(id).get(7).trim());
		colorlibFormValidationPage.Minimum(data.get(id).get(8).trim());
		colorlibFormValidationPage.Maximum(data.get(id).get(9).trim());
		colorlibFormValidationPage.Number(data.get(id).get(10).trim());
		colorlibFormValidationPage.IP(data.get(id).get(11).trim());
		colorlibFormValidationPage.Date(data.get(id).get(12));
		colorlibFormValidationPage.Date_Earlier(data.get(id).get(13).trim());
		colorlibFormValidationPage.Validate();
	}
	
	@Step
	public void verificar_ingreso_exitoso() {
		colorlibFormValidationPage.sinError();
	}

	@Step
	public void verificar_ingreso_fallido() {
		colorlibFormValidationPage.conError();
	}
}
