import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;


public class NumFacts extends Application {
	
	Stage window;
	Scene scene1, scene2;
	public int integer;
	public String stringFactors = "Factors: ";
	
	public static void main( String[] args )
	{
		launch(args);
		
		/**
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
		
			try {
				System.out.println("Please select an option");
				System.out.println("1. Compute Factors");
				System.out.println("2. Exit");
				int userInput = scanner.nextInt();
				
				if (userInput == 1) {
					System.out.println("Please enter a positive integer:");
					int numberToFactor = scanner.nextInt();
					while (numberToFactor <= 0){
						System.out.println("Please enter a positive integer:");
						numberToFactor = scanner.nextInt();
						if (numberToFactor > 0){
							break;
						}
					}
					
					NumMethods numMethods = new NumMethods(numberToFactor);
					
					try {
						List<Integer> factorsCall = new ArrayList<Integer>(numMethods.getFactors());
						System.out.println("Factors: ");
						for (int i = 0; i < factorsCall.size(); i++){
							System.out.print(factorsCall.get(i));
							if (i == factorsCall.size() - 1){
								System.out.println(' ');
							}
							else {
								System.out.print(',');
							}
						}
					}
					catch (Exception E){
						System.out.println("Something happened lol");
					}
					
					

				}
				else if (userInput == 2){
					System.out.println("Thanks for using JavaBgFactor.");
					break;
				}
				
				else {
					System.out.println("Invalid selection -please try again");
				}
		
			}
			catch (InputMismatchException misMatch){
				System.out.println("Invalid input -please try again");
				scanner.nextLine();
			}
			
		}
		**/
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		
		Label label1 = new Label("Please enter a positive integer");
		Button button1 = new Button("Enter");
		TextField textField1 = new TextField();
		Label label2 = new Label();
		button1.setOnAction(e -> {
			integer = Integer.parseInt(textField1.textProperty().getValue());
			NumMethods numMethods = new NumMethods(integer);
			
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
			System.out.println(integer);
		});
		
		//Layout1 - Children are laid out in a vertical column
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, textField1, button1, label2);
		scene1 = new Scene(layout1, 500, 500);
		
		window.setScene(scene1);
		window.setOnCloseRequest(e -> closeProgram());
		window.show();
	}
	
	public void closeProgram() {
		System.out.println("Program Ended");
		window.close();
	}
	
}