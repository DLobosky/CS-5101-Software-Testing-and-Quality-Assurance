//package code;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.*;

/**@authors Dalton Lobosky and Jason Beard*/

public class HelloWorld extends Application 
{
	@Override
    public void start(Stage myStage) 
	{
		//Setup the scene
        myStage.setTitle("Hello World Y'all!!!!");

        BorderPane rootNode = new BorderPane();
		
		HBox hb = new HBox();

		FlowPane fp = new FlowPane();
		fp.setVgap(2);
		fp.setHgap(2);
		fp.setPrefWrapLength(200); // preferred width = 100

        Scene myScene = new Scene(rootNode, 400, 400);

		rootNode.setCenter(fp);
		rootNode.setTop(hb);
		
		
		Text descriptionText = new Text("\nEnter desired modifier based on input letter:\n"
				+ " B - Bold \n"
				+ " D - Default \n"
				+ " G - Green \n"
				+ "  I  -  Italic \n"
				+ " R - Reverse \n");
		
		descriptionText.setStyle("-fx-font: 12 arial;");
		descriptionText.relocate(150 ,150);
		fp.getChildren().add(descriptionText);
		
		Text mod_text = new Text("Hello World!");
		Text mod_text_reverse = new Text("!dlroW olleH");
		
		// Input Box
		Label mod_label = new Label("Modifier:");		
		TextField mod_textbox = new TextField();
			
		// Submit Button
		Button submit = new Button("Submit");
		
		fp.getChildren().addAll(mod_text);
 		
		hb.getChildren().addAll(mod_label, mod_textbox, submit);
		
		submit.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{
				fp.getChildren().clear();
				fp.getChildren().add(descriptionText);
				
				String x1 = mod_textbox.getText();
				
				switch(x1)
				{
					case "I":
					{
						mod_text.setFill(Color.BLACK);
						mod_text.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 12));
						fp.getChildren().addAll(mod_text);
					}
					break;
					
					case "B":
					{
						mod_text.setFill(Color.BLACK);
						mod_text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
						fp.getChildren().addAll(mod_text);
					}
					break;
					
					case "G":
					{
						mod_text.setFont(Font.font("Times New Roman", 12));
						mod_text.setFill(Color.GREEN);
						fp.getChildren().addAll(mod_text);
					}
					break;
					
					case "R":
					{
						mod_text.setFill(Color.BLACK);
						fp.getChildren().addAll(mod_text_reverse);
					}
					break;
					
					case "D":
					{
						mod_text.setFont(Font.font("Times New Roman", 12));
						mod_text.setFill(Color.BLACK);
						fp.getChildren().addAll(mod_text);
					}
					break;
					
					default:
					{
						mod_text.setFill(Color.BLACK);
						fp.getChildren().addAll(new Text("Please enter a proper letter"));
					}
					
				}
			}
		});
		
        myStage.setScene(myScene);

        myStage.show();
    }
	
	/** Main method */
    public static void main(String[] args)
	{
        launch(args);
    }
}