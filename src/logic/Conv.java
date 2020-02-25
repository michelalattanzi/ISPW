package logic;

import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Conv extends Application{

	Button canc, buttonConv, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9; 
	
	TextField answer = new TextField("");
	private boolean resetDisplay = true;
	boolean control= true;
	
	public double convert(double numero) {
		return numero/100;
	}
	
	public static void main(String[] args) {
		
	}	

		@Override
		public void start(Stage stage) throws Exception{
			
			stage.setTitle("Convert to metres to centimetres");
			VBox vBox = new VBox();
			Scene scene = new Scene(vBox,500,500);
			
			answer.setAlignment(Pos.TOP_LEFT);
			answer.setStyle("-fx-font-size:40");
			
			button7 = new Button("7");
			button7.setOnAction((event) -> {
				if(control==false) {
					  answer.setText(button7.getText());
					  resetDisplay=true;
					  control=true;	  
				  }
				  else {
				  answer.setText(answer.getText()+button7.getText());} 
				});
			
			button8 = new Button("8");
			button8.setOnAction((event) -> {
				if(control==false) {
					  answer.setText(button8.getText());
					  resetDisplay=true;
					  control=true;	  
				  }
				  else {
				  answer.setText(answer.getText()+button8.getText());}	  
				});
			button9 = new Button("9");
			button9.setOnAction((event) -> {
				if(control==false) {
					  answer.setText(button9.getText());
					  resetDisplay=true;
					  control=true;	  
				  }
				  else {
				  answer.setText(answer.getText()+button9.getText());}
				});
			
			button4 = new Button("4"); 
			button4.setOnAction((event) -> {
				if(control==false) {
					  answer.setText(button4.getText());
					  resetDisplay=true;
					  control=true;	  
				  }
				  else {
				  answer.setText(answer.getText()+button4.getText());}
				});
			button5 = new Button("5");
			button5.setOnAction((event) -> {
				if(control==false) {
					  answer.setText(button5.getText());
					  resetDisplay=true;
					  control=true;	  
				  }
				  else {
				  answer.setText(answer.getText()+button5.getText());}
				});
			button6 = new Button("6");
			button6.setOnAction((event) -> {
				if(control==false) {
					  answer.setText(button6.getText());
					  resetDisplay=true;
					  control=true;	  
				  }
				  else {
				  answer.setText(answer.getText()+button6.getText());}
				});
			
			button1 = new Button();
			button1.setText("1");
			button1.setOnAction((event) -> {
				  if(control==false) {
					  answer.setText(button1.getText());
					  resetDisplay=true;
					  control=true;	  
				  }
				  else {
				  answer.setText(answer.getText()+button1.getText());}
				});
		    button2 = new Button("2");
		    button2.setOnAction((event) -> {
		    	if(control==false) {
					  answer.setText(button2.getText());
					  resetDisplay=true;
					  control=true;	  
				  }
				  else {
				  answer.setText(answer.getText()+button2.getText());}
				});
			button3 = new Button("3");
			button3.setOnAction((event) -> {
				if(control==false) {
					  answer.setText(button3.getText());
					  resetDisplay=true;
					  control=true;	  
				  }
				  else {
				  answer.setText(answer.getText()+button3.getText());}
				});
			
			button0 = new Button("0");
			button0.setOnAction((event) -> {
				if(control==false) {
					  answer.setText(button0.getText());
					  resetDisplay=true;
					  control=true;	  
				  }
				  else {
				  answer.setText(answer.getText()+button0.getText());}
				});
			
			canc = new Button("C");
			canc.setOnAction((event) -> {
				  resetDisplay=true;
				  answer.setText("centimetri: ");
				});
			
			buttonConv = new Button("Convert");
			buttonConv.setOnAction((event) -> {
				 double risultato = convert(Double.parseDouble(answer.getText()));
				 answer.setText(String.valueOf(risultato));
				 
			});
			
			button7.setMinSize(80,80);
			button7.setStyle("-fx-font-size:30");
			button8.setMinSize(80,80);
			button8.setStyle("-fx-font-size:30");
			button9.setMinSize(80,80);
			button9.setStyle("-fx-font-size:30");
			button4.setMinSize(80,80);
			button4.setStyle("-fx-font-size:30");
			button5.setMinSize(80,80);
			button5.setStyle("-fx-font-size:30");
			button6.setMinSize(80,80);
			button6.setStyle("-fx-font-size:30");
			button1.setMinSize(80,80);
			button1.setStyle("-fx-font-size:30");
			button2.setMinSize(80,80);
			button2.setStyle("-fx-font-size:30");
			button3.setMinSize(80,80);
			button3.setStyle("-fx-font-size:30");
			button0.setMinSize(80,80);
			button0.setStyle("-fx-font-size:30");
			buttonConv.setMinSize(80,80);
			buttonConv.setStyle("-fx-font-size:30");
			canc.setMinSize(80,80);
			canc.setStyle("-fx-font-size:30");
			
			GridPane grid = new GridPane(); 
			grid.setAlignment(Pos.CENTER);
			grid.add(button7,0,0);
			grid.add(button8,1,0);
			grid.add(button9,2,0);
			grid.add(button4,0,1);
			grid.add(button5,1,1);
			grid.add(button6,2,1);
			grid.add(button1,0,2); 
			grid.add(button2,1,2);
			grid.add(button3,2,2);
			grid.add(button0,1,3);
			grid.add(canc,0,3);
			grid.add(buttonConv,0,4);
			
			vBox.getChildren().addAll(answer,grid);		
			stage.setScene(scene);
			stage.show();
		
		}
		
		
}
