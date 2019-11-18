package com.choucair.formacion.definition;

import com.choucair.formacion.steps.ColorlibFormValidationSteps;
import com.choucair.formacion.steps.PopupValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import net.thucydides.core.annotations.Steps;

public class PopupValidationDefinition {
	
	@Steps
	PopupValidationSteps popupValidationSteps;
	@Steps 
	ColorlibFormValidationSteps colorlibFormValidationSteps;
	
	@Given("^Inicio sesión con el usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void inicio_sesión_con_el_usuario_y_clave(String user, String pw) {
		popupValidationSteps.login(user, pw);
	}

	@Given("^Ingreso a la opción Forms Validation$")
	public void ingreso_a_la_opción_Form_Validation() {
	    popupValidationSteps.formValidation();
	}

	@When("^Diligencio formulario Popup Validation$")
	public void diligencio_formulario_Popup_Validation(DataTable table) {
	   List<List<String>> data = table.raw();
	   
	   for(int i=1; i<data.size(); i++) {
		   colorlibFormValidationSteps.diligencio_Popup_datos_tabla(data, i);
		   try {
			   Thread.sleep(5000);
		   }catch(InterruptedException e) {}
	   }
	}

	@Then("^Verifico ingreso exitoso$")
	public void verifico_ingreso_exitoso() {
		colorlibFormValidationSteps.verificar_ingreso_exitoso();
	}
	
	@Then("^Verifico que se presente globo informativo$")
	public void verifico_que_se_presente_globo_informativo() {
		colorlibFormValidationSteps.verificar_ingreso_fallido();
	}

}
