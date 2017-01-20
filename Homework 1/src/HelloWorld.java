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

   
		
		Label text1 = new Label("Hello World! TEst 2");
		Label text2 = new Label("!dlroW olleH");

        Scene myScene = new Scene(rootNode, 253, 50);

		rootNode.setCenter(fp);
		rootNode.setTop(hb);
		
		
		// Input Box
		Label mod_label = new Label("Modifier:");
		TextField mod_textbox = new TextField();
			
		// Submit Button
		Button submit = new Button("Submit");
 		
		hb.getChildren().addAll(mod_label, mod_textbox, submit);
		
		submit.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{
				fp.getChildren().clear();
				
			
				fp.getChildren().addAll(text1);
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