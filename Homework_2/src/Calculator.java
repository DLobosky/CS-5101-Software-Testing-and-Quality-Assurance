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

public class Calculator extends Application 
{
	String display = new String();
	int num1, num2, op_num = 0, ans;
	
	@Override
    public void start(Stage myStage) 
	{
		//Setup the scene
        myStage.setTitle("Master Calculator 5000!!!");

        BorderPane rootNode = new BorderPane();
        
        GridPane gp = new GridPane();
        gp.setHgap(5);
        gp.setVgap(5);
		
		HBox hb = new HBox();

		FlowPane fp = new FlowPane();
		fp.setVgap(2);
		fp.setHgap(2);
		fp.setPrefWrapLength(200); // preferred width = 100

        Scene myScene = new Scene(rootNode, 120, 150);

		rootNode.setCenter(gp);
		rootNode.setTop(hb);
		
		// Input Box	
		//TextField result_textbox = new TextField();
		Label result_label = new Label();
			
		Button but_1 = new Button("1");
		gp.add(but_1, 1, 1);
		
		Button but_2 = new Button("2");
		gp.add(but_2, 2, 1);
		
		Button but_3 = new Button("3");
		gp.add(but_3, 3, 1);
		
		Button but_4 = new Button("4");
		gp.add(but_4, 1, 2);
		
		Button but_5 = new Button("5");
		gp.add(but_5, 2, 2);

		Button but_6 = new Button("6");
		gp.add(but_6, 3, 2);

		Button but_7 = new Button("7");
		gp.add(but_7, 1, 3);

		Button but_8 = new Button("8");
		gp.add(but_8, 2, 3);

		Button but_9 = new Button("9");
		gp.add(but_9, 3, 3);

		Button but_0 = new Button("0");
		gp.add(but_0, 2, 4);

		Button but_add = new Button("+");
		gp.add(but_add, 4, 4);
		
		Button but_sub = new Button("-");
		gp.add(but_sub, 4, 3);
		
		Button but_mult = new Button("*");
		gp.add(but_mult, 4, 2);
		
		Button but_div = new Button("/");
		gp.add(but_div, 4, 1);
		
		Button but_eq = new Button("=");
		gp.add(but_eq, 3, 4);
		
		Button but_clr = new Button("c");
		gp.add(but_clr, 1, 4);
		
		//hb.getChildren().addAll(result_textbox);
		hb.getChildren().addAll(result_label);
		
		
		but_1.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{
				display = display + "1";
				result_label.setText(display);
				
			}
		});
		
		but_2.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{
				display = display + "2";
				result_label.setText(display);
				
			}
		});

		but_3.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{
				display = display + "3";
				result_label.setText(display);
				
			}
		});
		
		but_4.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{
				display = display + "4";
				result_label.setText(display);
				
			}
		});
		
		but_5.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{
				display = display + "5";
				result_label.setText(display);
				
			}
		});
		
		but_6.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{
				display = display + "6";
				result_label.setText(display);
				
			}
		});
		
		but_7.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{
				display = display + "7";
				result_label.setText(display);
				
			}
		});
		
		but_8.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{
				display = display + "8";
				result_label.setText(display);
				
			}
		});
		
		but_9.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{
				display = display + "9";
				result_label.setText(display);
				
			}
		});
		
		but_0.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{
				display = display + "0";
				result_label.setText(display);
				
			}
		});
		
		but_add.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{				
				num1 = Integer.parseInt(display);
				display = "";
				result_label.setText(display);
				op_num = 1;
				
			}
		});
		
		but_sub.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{				
				num1 = Integer.parseInt(display);
				display = "";
				result_label.setText(display);
				op_num = 2;
				
			}
		});
		
		but_mult.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{				
				num1 = Integer.parseInt(display);
				display = "";
				result_label.setText(display);
				op_num = 3;
				
			}
		});
		
		but_div.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{				
				num1 = Integer.parseInt(display);
				display = "";
				result_label.setText(display);
				op_num = 4;
				
			}
		});
		
		but_clr.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{				
				display = "";
				result_label.setText(display);			
			}
		});
		
		but_eq.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{				
				num2 = Integer.parseInt(display);
				switch(op_num)
				{
					case 1:
					{
						ans = num1 + num2;
					}
					break;
					
					case 2:
					{
						ans = num1 - num2;
					}
					break;
					
					case 3:
					{
						ans = num1 * num2;
					}
					break;
					
					case 4:
					{
						ans = num1 / num2;
					}
					break;
				}
				
				display = String.valueOf(ans);
				
				result_label.setText(display);
				
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