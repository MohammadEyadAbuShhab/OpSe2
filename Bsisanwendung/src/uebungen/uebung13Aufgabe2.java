package uebungen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class uebung13Aufgabe2 extends Application {

	public static void main(String[] args) {
		 launch(args);

	}

	@Override
	public void start(Stage st) throws Exception {
		BorderPane bp = new BorderPane();
		Scene scene = new Scene(bp, 400, 500);
			
		Label result = new Label();
		
		TextField t = new TextField();
		
		
		
		
		Button b1 = new Button("Umfang");
		b1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Stage st1 = new Stage();
				BorderPane bp1 = new BorderPane();
				Scene scene1 = new Scene(bp1, 400, 500);
				
				Label l1 = new Label();
				TextField t1 = new TextField();
				
				Button b1 = new Button("Berechnung");
				RadioButton rb1 = new RadioButton("r");
				rb1.setSelected(true);
				RadioButton rb2 = new RadioButton("d");
				
				
				ToggleGroup tg = new ToggleGroup();
				rb1.setToggleGroup(tg);
				rb2.setToggleGroup(tg);
				
				b1.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent arg0) {
						if(rb1.isSelected()) {
							l1.setText("Der Umfang lautet" + (2* Integer.parseInt(t1.getText()) * Math.PI));
						}else if(rb2.isSelected()) {
							l1.setText("Der Umfang lautet" + (Integer.parseInt(t1.getText()) * Math.PI));
						}
						
					}
				});
				HBox hbox = new HBox(10, rb1, rb2, t1, b1, l1);
				
				bp1.setTop(hbox);
				
				st1.setScene(scene1);
				st1.show();
			}
		});
		Button b2 = new Button("Flaeche");
		b2.setDisable(true);
		
		
		HBox hBox = new HBox(t, b1, b2);
		
		bp.setTop(hBox);
		bp.setCenter(result);
		
		st.setScene(scene);
		st.show();
		
	}

}
