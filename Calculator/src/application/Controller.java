package application;

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
	
	public void cos(){
		input.appendText("cos(");
	}
	
	public void tan(){
		input.appendText("tan(");
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
	public void abs(){
		input.appendText("abs(");
	}
	public void pi(){
		input.appendText("π");
	}
	public void e(){
		input.appendText("e");
	}
	public void rand(){
		input.appendText("RAND");
	}
	
	public void power(){
		input.appendText("^");
	}
	
	public void root(){
		input.appendText("√(");
	}
	
	public void factorial(){
		input.appendText("!");
	}
	
	public void ln(){
		input.appendText("ln(");
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
