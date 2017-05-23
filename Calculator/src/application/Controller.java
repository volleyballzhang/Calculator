 

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
	public TextField input;
	public TextField answer;
	
	public void zero(){
		input.appendText("0");
	}
	public void one(){
		input.appendText("1");
	}
	public void two(){
		input.appendText("2");
	}
	public void three(){
		input.appendText("3");
	}
	public void four(){
		input.appendText("4");
	}
	public void five(){
		input.appendText("5");
	}
	public void six(){
		input.appendText("6");
	}
	public void seven(){
		input.appendText("7");
	}
	public void eight(){
		input.appendText("8");
	}
	
	public void nine(){
		input.appendText("9");
	}
	
	public void add(){
		input.appendText("+");
	}
	
	public void mod(){
		input.appendText("%");
	}
	
	public void perm(){
		input.appendText(" nPr ");
	}
	
	public void comp(){
		input.appendText(" nCr ");
	}
	
	public void subtract(){
		input.appendText("-");
	}
	
	public void multiply(){
		input.appendText("*");
	}
	
	public void divide(){
		input.appendText("/");
	}
	
	public void clear(){
		input.setText("");
	}
	
	public void sin(){
		input.appendText("sin(");
	}
	
	private void sinCalc() {
	    double i = 0;
	    Math.sin(i);
	}
	
	public void cos(){
		input.appendText("cos(");
	}
	
	private void cosCalc() {
	    double i = 0;
	    Math.cos(i);
	}
	
	public void tan(){
		input.appendText("tan(");
	}
	
	private void tanCalc() {
	    double i = 0;
	    Math.tan(i);
	}
	
	public void arcsin(){
		input.appendText("arcsin(");
	}
	
	public void arccos(){
		input.appendText("arccos(");
	}
	
	public void arctan(){
		input.appendText("arctan(");
	}
	
	public void log(){
		input.appendText("log(");
	}
	
	private void logCalc() {
	    double i = 0;
	    Math.log(i);
	}
	
	public void abs(){
		input.appendText("abs(");
	}
	
	private void absCalc() {
	    double i = 0;
	    if(i < 0) i *= -1;
	    else i = i;
	}
	
	public void pi(){
		input.appendText("π");
	}
	
	private void piCalc() {
	    double pi = 3.14159265359;
	}
	
	public void e(){
		input.appendText("e");
	}
	
	private void eCalc() {
	    double e = 2.7182818284590452353602874713527;
	}
	
	public void rand(){
		input.appendText("RAND");
	}
	
	public void power(){
		input.appendText("^");
	}
	
	private void powCalc() {
	    double i = 0;
	    double e = 0;
	    Math.pow(i, e);
	}
	
	public void root(){
		input.appendText("√(");
	}
	
	private void rootCalc() {
	    double i = 0;
	    Math.sqrt(i);
	}
	
	public void factorial(){
		input.appendText("!");
	}
	
	private double factorialCalc() {
	    int i = 0;
	    while(i > 0) {
	        i *= (i - 1);
	     }
	     return i;
	}
	
	public void ln(){
		input.appendText("ln(");
	}
	
	private double lnCalc() {
	    double i = 0;
	    i = (-Math.log(1 - i))/ i;
	    return i;
	 }
	
	//probably need a switcher between radians and degrees
	
	public void calculateFinalGrade(){
	}
	
	public void delete(){
	}
	
	public void enter(){
		
	}
	
	public void scientificNotation(){
	}
	
	
	
}
