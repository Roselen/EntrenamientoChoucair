#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Popup Validation
El usuario debe poder ingresar todos los datos solicitados en el formulario.
Cada campo tiene validaciones obligatorias de longitud y formato. 
El sistema debe notificar por medio de un mensaje las validaciones requeridas en cada campo. 

  @CasoExitoso
  Scenario: Todos los campos son completados de manera exitosa
    Given Inicio sesión con el usuario "demo" y clave "demo"
    And Ingreso a la opción Forms Validation
    When Diligencio formulario Popup Validation
    |Required|Select  |MultipleS1|MultipleS2|Url               |E-mail	     |Password|Password2|MinSize    |MaxSize  |Number|IP           |Date      |Date Earlier|
		|Ros	   |Football|Football  |Golf      |http://roselen.com|ros@pena.com |1234    |1234     |0123456789 |012345   |27    |192.168.3.232|2019-12-01|1992/04/01  |
    Then Verifico ingreso exitoso

	 @CasoAlterno
   Scenario: Se diligencia el formulario Popup Validation con errores y se presenta el globo informativo indicando errores
    Given Inicio sesión con el usuario "demo" y clave "demo"
    And Ingreso a la opción Forms Validation
    When Diligencio formulario Popup Validation
    |Required|Select  |MultipleS1|MultipleS2|Url               |E-mail	      |Password|Password2|MinSize    |MaxSize   |Number|IP           |Date      |Date Earlier|
		|Ros	   |Football|Football  |Golf      |http://roselen.com|ros@pena.com  |1234    |1234     |0123456789 |012345    |27    |192.168.3.232|2019-12-01|1992/04/01  |
    |     	 |Golf    |Golf      |Tennis    |                  |ele@agudelo.co|5678    |5678     |123        |1111111111|28    |192.         |2019/12/31|2020-01-08  |
    Then Verifico que se presente globo informativo
	
