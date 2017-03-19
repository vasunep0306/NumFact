import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;


public class NumFacts extends Application {
	
	Stage window;
	Scene scene1, scene2;
	public int userNum;
	public String stringFactors = "Factors: ";
	
	public static void main( String[] args )
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		
		Label label1 = new Label("Please enter a positive integer");
		Button button1 = new Button("Enter");
		TextField textField1 = new TextField();
		Label label2 = new Label();
		Label label3 = new Label();
		Label label4 = new Label();
		Label label5 = new Label();
		button1.setOnAction(e -> {
			userNum = Integer.parseInt(textField1.textProperty().getValue());
			NumMethods numMethods = new NumMethods(userNum);
			FactMap factMap = new FactMap();
			
			try {
				if (stringFactors.length() > 8){
					stringFactors = "Factors: ";
				}
				List<Integer> factorsCall = new ArrayList<Integer>(numMethods.getFactors());
				for (int i = 0; i < factorsCall.size(); i++){
					stringFactors += factorsCall.get(i);
					if (i == factorsCall.size() - 1){
						stringFactors += ' ';
					}
					else {
						stringFactors += ',';
					}
				}
			}
			catch (Exception E){
				System.out.println("Something happened lol");
			}
			label2.setText(stringFactors);
			
			if (numMethods.isPrime(userNum)){
				label3.setText("This number is prime");
			}
			else {
				label3.setText("This number is not prime");
			}
			
			if (numMethods.isEven(userNum)){
				label4.setText("This number is even");
			}
			else {
				label4.setText("This number is odd");
			}
			
			label5.setText(factMap.getFacts(userNum));
		});
		
		//Layout1 - Children are laid out in a vertical column
		button1.setAlignment(Pos.CENTER);
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, textField1, button1, label2, label3, label4, label5);
		scene1 = new Scene(layout1, 500, 500);
		scene1.getStylesheets().add("NumFacts.css");
		
		window.setScene(scene1);
		window.setOnCloseRequest(e -> closeProgram());
		window.show();
	}
	
	public void closeProgram() {
		System.out.println("Program Ended");
		window.close();
	}		
}