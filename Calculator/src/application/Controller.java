package application;

import java.net.URL;
import java.util.ResourceBundle;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.TDistribution;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller implements Initializable{
	@FXML
	public TextField input;
	public TextField answer;
	public TextField currentGrade;
	public TextField addL1;
	public TextField addL2;
	public TextField finalWorth;
	public TextField gradeDesired;
	public TextField finalGradeAnswer;
	public TextField prop1Test_Po;
	public TextField prop1Test_x;
	public TextField prop1Test_n;
	public TextField prop1Int_x;
	public TextField prop1Int_n;
	public TextField prop1Int_cl;
	public TextField prop2Test_x1;
	public TextField prop2Test_n1;
	public TextField prop2Test_x2;
	public TextField prop2Test_n2;
	public TextField samp1Test_muStat;
	public TextField samp1Test_muData;
	public TextField samp1Test_x;
	public TextField samp1Test_sx;
	public TextField samp1Test_n;
	public TextField samp2Test_x1;
	public TextField samp2Test_sx1;
	public TextField samp2Test_n1;
	public TextField samp2Test_x2;
	public TextField samp2Test_sx2;
	public TextField samp2Test_n2;
	public TextArea prop1Test_answer;
	public TextArea prop1Int_answer;
	public TextArea prop2Test_answer;
	public TextArea samp1Test_answerCalc;
	public TextArea samp1Test_answerData;
	public TextArea samp2Test_answerCalc;
	public TextArea samp2Test_answerData;
	public ChoiceBox<String> prop1Test_Type;
	public ChoiceBox<String> prop2Test_Type;
	public ChoiceBox<String> samp1Test_TypeStat;
	public ChoiceBox<String> samp1Test_TypeData;
	public ChoiceBox<String> samp2Test_TypeStat;
	public ChoiceBox<String> samp2Test_TypeData;
	public TableView<StatListL1> list1;
	public TableColumn<StatListL1, Double> l1;
	public TableView<StatListL2> list2;
	public TableColumn<StatListL2, Double> l2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		l1.setCellValueFactory(new PropertyValueFactory<StatListL1, Double>("l1"));
		l2.setCellValueFactory(new PropertyValueFactory<StatListL2, Double>("l2"));
		prop1Test_Type.getItems().addAll("≠Po", "<Po", ">Po");
		prop1Test_Type.setValue("≠Po");
		prop2Test_Type.getItems().addAll("≠P2", "<P2", ">P2");
		prop2Test_Type.setValue("≠P2");
		samp1Test_TypeStat.getItems().addAll("≠μo", "<μo", ">μo");
		samp1Test_TypeStat.setValue("≠μo");
		samp1Test_TypeData.getItems().addAll("≠μo", "<μo", ">μo");
		samp1Test_TypeData.setValue("≠μo");
		samp2Test_TypeStat.getItems().addAll("≠μ2", "<μ2", ">μ2");
		samp2Test_TypeStat.setValue("≠μ2");
		samp2Test_TypeData.getItems().addAll("≠μ2", "<μ2", ">μ2");
		samp2Test_TypeData.setValue("≠μ2");
		
		
	}
	
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
	
	public void prop1ZInt(){
		this.prop1Int_answer.clear();
		if(this.prop1Int_cl.getText().length() == 0 || this.prop1Int_n.getText().length() == 0 || this.prop1Int_x.getText().length() == 0){
			this.prop1Int_answer.appendText("Fill out all the fields");
		}
		double x = Double.parseDouble(this.prop1Int_x.getText());
		double n = Double.parseDouble(this.prop1Int_n.getText());
		double cl = Double.parseDouble(this.prop1Int_cl.getText());
		double phat = x/n;
		NormalDistribution normal = new NormalDistribution();
		double zstar = normal.inverseCumulativeProbability(cl + (1-cl)/2);
		double stdev = Math.sqrt(phat*(1-phat)/n);
		double lowerBound = phat - zstar*stdev;
		double upperBound = phat + zstar*stdev;
		this.prop1Int_answer.appendText("(" + lowerBound + "," + upperBound + ")" + "\nP: " + phat + "\nN: " + n);
	}
	
	public void prop1Test_calc(){
		this.prop1Test_answer.clear();
		if(this.prop1Test_n.getText().length() == 0 || this.prop1Test_x.getText().length() == 0 || this.prop1Test_Po.getText().length() == 0){
			this.prop1Test_answer.appendText("Please fill out all fields");
			return;
		}
		double sDev = Math.sqrt(Double.parseDouble(this.prop1Test_Po.getText()) * (1-Double.parseDouble(this.prop1Test_Po.getText())) / Double.parseDouble(this.prop1Test_n.getText()));
		double zValue = ((Double.parseDouble(this.prop1Test_x.getText())/Double.parseDouble(this.prop1Test_n.getText())) - Double.parseDouble(this.prop1Test_Po.getText()))/sDev;
		NormalDistribution n = new NormalDistribution();
		double pValue = n.probability(Math.abs(zValue), 10000000);
		if(this.prop1Test_Type.getValue().equals("≠Po")) pValue *= 2;
		this.prop1Test_answer.appendText("Z: " + zValue +  "\nP: " + pValue);
	
	}
	
	public void prop2Test_calc(){
		this.prop2Test_answer.clear();
		if(this.prop2Test_n1.getText().length() == 0 || this.prop2Test_x1.getText().length() == 0 || this.prop2Test_x2.getText().length() == 0 || this.prop2Test_n2.getText().length() == 0){
			this.prop2Test_answer.appendText("Please fill out all fields");
			return;
		}
		double x1 = Double.parseDouble(this.prop2Test_x1.getText());
		double x2 = Double.parseDouble(this.prop2Test_x2.getText());
		double n1 = Double.parseDouble(this.prop2Test_n1.getText());
		double n2 = Double.parseDouble(this.prop2Test_n2.getText());
		double Pc = (x1+x2)/(n1+n2);
		double sDev = Math.sqrt((1/n1 + 1/n2)*Pc*(1-Pc));
		double zValue = (x1/n1 - x2/n2)/sDev;
		NormalDistribution n = new NormalDistribution();
		double pValue = n.probability(Math.abs(zValue), 10000000);
		if(this.prop2Test_Type.getValue().equals("≠P2")) pValue *= 2;
		this.prop2Test_answer.appendText("Z: " + zValue + "\nP: " + pValue);
	
	}
	
	public void samp1Test_calcStat(){
		this.samp1Test_answerCalc.clear();
		if(this.samp1Test_muStat.getText().length() == 0 || this.samp1Test_x.getText().length() == 0 || this.samp1Test_sx.getText().length() == 0 || this.samp1Test_n.getText().length() == 0){
			this.samp1Test_answerCalc.appendText("Please fill out all fields");
			return;
		}
		double mu = Double.parseDouble(this.samp1Test_muStat.getText());
		double x = Double.parseDouble(this.samp1Test_x.getText());
		double sx = Double.parseDouble(this.samp1Test_sx.getText());
		double n = Double.parseDouble(this.samp1Test_n.getText());
		double tValue = (x-mu)/(sx/Math.sqrt(n));
		TDistribution t = new TDistribution(n-1);
		double pValue = t.probability(Math.abs(tValue), 10000000);
		if(this.samp1Test_TypeStat.getValue().equals("≠μo")) pValue*=2;
		this.samp1Test_answerCalc.appendText("T: " + tValue + "\nP: " + pValue);
		
	}
	
	public void samp1Test_calcData(){
		this.samp1Test_answerData.clear();
		if(list1.getItems().size() == 0 || this.samp1Test_muData.getText().length() == 0){
			this.samp1Test_answerCalc.appendText("Fill the Table");
			return;
		}
		double mu = Double.parseDouble(this.samp1Test_muData.getText());
		double total = 0;
		for(StatListL1 st: list1.getItems()){
			total += st.getl1();
		}
		double x = total/list1.getItems().size();
		double variance = 0;
		for(StatListL1 st: list1.getItems()){
			variance += Math.pow(st.getl1()-x,2);
		}
		double sx = Math.sqrt(variance/(list1.getItems().size()-1));
		double tValue = (x-mu)/(sx/Math.sqrt(list1.getItems().size()));
		TDistribution t = new TDistribution(list1.getItems().size()-1);
		double pValue = t.probability(Math.abs(tValue), 10000000);
		if(this.samp1Test_TypeData.getValue().equals("≠μo")) pValue*=2;
		this.samp1Test_answerData.appendText("T: "+tValue +"\nP: " + pValue + "\nX: " + x + "\nSx:" + sx + "\nN: " + list1.getItems().size());
	}
	
	public void samp2Test_calcStat(){
		this.samp2Test_answerCalc.clear();
		if(this.samp2Test_n1.getText().length() == 0 || this.samp2Test_sx1.getText().length() == 0 ||this.samp2Test_x1.getText().length() == 0 ||this.samp2Test_sx2.getText().length() == 0 ||this.samp2Test_x2.getText().length() == 0 ||this.samp2Test_n2.getText().length() == 0){
			this.samp2Test_answerCalc.appendText("Please fill out all fields");
			return;
		}
		double x1 = Double.parseDouble(this.samp2Test_x1.getText());
		double sx1 = Double.parseDouble(this.samp2Test_sx1.getText());
		double n1 = Double.parseDouble(this.samp2Test_n1.getText());
		double x2 = Double.parseDouble(this.samp2Test_x2.getText());
		double sx2 = Double.parseDouble(this.samp2Test_sx2.getText());
		double n2 = Double.parseDouble(this.samp2Test_n2.getText());
		double mean = x1-x2;
		double serror = Math.sqrt(Math.pow(sx1, 2)/n1 + Math.pow(sx2, 2)/n2);
		double tvalue = mean/serror;
		double upper = Math.pow((Math.pow(sx1, 2)/n1 + Math.pow(sx2, 2)/n2),2);
		double lowerLeft = Math.pow(sx1, 4)/((n1-1)*n1*n1);
		double lowerRight = Math.pow(sx2, 4)/((n2-1)*n2*n2);
		double df = upper/(lowerLeft + lowerRight);
		TDistribution t = new TDistribution(df);
		double pValue = t.probability(Math.abs(tvalue), 100000000);
		if(this.samp2Test_TypeStat.getValue().equals("≠μ2")) pValue *=2;
		this.samp2Test_answerCalc.appendText("T: " + tvalue + "\nP: " + pValue + "\nDF: " + df);
	}
	
	public void samp2Test_calcData(){
		this.samp2Test_answerData.clear();
		if(this.list1.getItems().size() == 0 || this.list2.getItems().size() == 0){
			this.samp2Test_answerData.appendText("Please fill in the lists");
			return;
		}
		double total1 = 0;
		double n1 = list1.getItems().size();
		for(StatListL1 st: list1.getItems()){
			total1 += st.getl1();
		}
		double x1 = total1/n1;
		double variance = 0;
		for(StatListL1 st: list1.getItems()){
			variance += Math.pow(st.getl1()-x1,2);
		}
		double sx1 = Math.sqrt(variance/(n1-1));
		double total2 = 0;
		double n2 = list2.getItems().size();
		for(StatListL2 st: list2.getItems()){
			total2 += st.getl2();
		}
		double x2 = total2/n2;
		double variance2 = 0;
		for(StatListL2 st: list2.getItems()){
			variance2 += Math.pow(st.getl2()-x2,2);
		}
		double sx2 = Math.sqrt(variance2/(n2-1));
		double mean = x1-x2;
		double serror = Math.sqrt(Math.pow(sx1, 2)/n1 + Math.pow(sx2, 2)/n2);
		double tvalue = mean/serror;
		double upper = Math.pow((Math.pow(sx1, 2)/n1 + Math.pow(sx2, 2)/n2),2);
		double lowerLeft = Math.pow(sx1, 4)/((n1-1)*n1*n1);
		double lowerRight = Math.pow(sx2, 4)/((n2-1)*n2*n2);
		double df = upper/(lowerLeft + lowerRight);
		TDistribution t = new TDistribution(df);
		double pValue = t.probability(Math.abs(tvalue), 100000000);
		if(this.samp2Test_TypeStat.getValue().equals("≠μ2")) pValue *=2;
		this.samp2Test_answerData.appendText("T: " + tvalue + "\nP: " + pValue + "\nDF: " + df + "\nX1: " + x1 + "\nX2: " + x2 + "\nSx1: " + sx1 + "\nSx2: " + sx2 + "\nN1: " + n1 + "\nN2: " + n2);
	}
	
	//probably need a switcher between radians and degrees
	
	public void calculateFinalGrade(){
		this.finalGradeAnswer.clear();
		if(this.currentGrade.getText().length() == 0 || this.finalWorth.getText().length() == 0 || this.gradeDesired.getText().length() == 0){
			this.finalGradeAnswer.appendText("Please fill in all fields!");
			return;
		}
		double preFinalScore = Double.parseDouble(this.currentGrade.getText()) * (100-Double.parseDouble(this.finalWorth.getText()))/100;
		double finalScore = 100 * (Double.parseDouble(this.gradeDesired.getText()) - preFinalScore)/Double.parseDouble(this.finalWorth.getText());
		this.finalGradeAnswer.appendText(finalScore + "%");
		
	}
	
	public void addPoint(){
		StatListL1 sl1;
		StatListL2 sl2;
		if(addL2.getText().length() == 0){
			sl1 = new StatListL1(Double.parseDouble(addL1.getText()));
			this.list1.getItems().add(sl1);
		}else if(addL1.getText().length() == 0){
			sl2 = new StatListL2(Double.parseDouble(addL2.getText()));
			this.list2.getItems().add(sl2);
		}else{
			sl1 = new StatListL1(Double.parseDouble(addL1.getText())); 
			sl2 = new StatListL2(Double.parseDouble(addL2.getText()));
			this.list1.getItems().add(sl1);
			this.list2.getItems().add(sl2);
		}
		addL1.clear();
		addL2.clear();
	}
	
	public void deletePoint(){
		ObservableList<StatListL1> statPoint, allPoints; 
		statPoint = list1.getItems();
		allPoints = list1.getSelectionModel().getSelectedItems();
		statPoint.removeAll(allPoints);
		ObservableList<StatListL2> statPoint2, allPoints2; 
		statPoint2 = list2.getItems();
		allPoints2 = list2.getSelectionModel().getSelectedItems();
		statPoint2.removeAll(allPoints2);
	}

	public void delete(){
	}
	
	public void enter(){
		
	}
	
	public void scientificNotation(){
	}
		
}

