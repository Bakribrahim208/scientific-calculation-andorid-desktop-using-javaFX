package main.java;

 

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.paint.*;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Screen;
/**
 *
 * @author ahmed
 */
public class JavaFXApplication1 {
    static StringBuilder TMbu = new StringBuilder("                                                  ");
            
            
            static StringBuilder Ibrahimbu = new StringBuilder("                                                  ");
            
            static    StringBuilder Bakrbu = new StringBuilder("                                                  ");
            
            static    StringBuilder Hamdybu = new StringBuilder("                                                  ");
            
            static   StringBuilder Farouqbu = new StringBuilder("                                                  ");
            static   int i=0;
    
  static int count =1;
static  int c=64;
static Text teamname =new Text();
static Text teamname2 = new Text();
static Text Ib =new Text();

static Text Ba =new Text();
static Text Ha =new Text();
static Text Fa =new Text();
                         boolean th = true;
                         static StringBuilder text=new StringBuilder("                                                  ");
                         static int count2=0;
                         static int count3=0;
	 
	public static void map(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane1 = new Pane();
		Ib.setFill(Color.BLUE);
		Ba.setFill(Color.RED);
		Ha.setFill(Color.GOLD);
		Fa.setFill(Color.LINEN);
		pane1.setStyle("-fx-background-color: ea711f");
		
		String TMtxt ="  Lazy Team";
		String Ibrahimtxt ="  Ibrahim mohamed";
		String Bakrtxt="  Baker 3ta";
		String Hamdytxt="  Ahmed hamdy";
		String Farouqtxt= "  Alfarouk Omar";
		 new Thread(new Runnable() {
     		 @Override
     		   public void run() {
     		 try {	       
     		 while (count2<Ibrahimtxt.length()) {
                     if(count2 <TMtxt.length())
                     TMbu.setCharAt(count, TMtxt.charAt(count2));
                     if(count2 <Ibrahimtxt.length())
                     Ibrahimbu.setCharAt(count, Ibrahimtxt.charAt(count2));
                     if(count2 <Bakrtxt.length())
                     Bakrbu.setCharAt(count, Bakrtxt.charAt(count2));
                     if(count2 <Hamdytxt.length())
                     Hamdybu.setCharAt(count, Hamdytxt.charAt(count2));
                     if(count2 <Farouqtxt.length())
                     Farouqbu.setCharAt(count, Farouqtxt.charAt(count2));
     		 Platform.runLater(new Runnable() { // Run from JavaFX GUI
     		 @Override
     		 public void run() {
                        teamname.setText(TMbu.toString());
                        Ib.setText(Ibrahimbu.toString());
                        Ba.setText(Bakrbu.toString());
                       Ha.setText(Hamdybu.toString());
                        Fa.setText(Farouqbu.toString());
                        if(count!=count3)
                        {
                        TMbu.setCharAt(count,' ');
                        Ibrahimbu.setCharAt(count,' ');
                        Bakrbu.setCharAt(count,' ');
                        Hamdybu.setCharAt(count,' ');
                        Farouqbu.setCharAt(count,' ');
                        }
                        if(count==count3)
                     {
                         count=text.length();
                         count2++;
                         count3++;
                     }
                        count--;
     		 }
     		 });
     		 Thread.sleep(30);
     		 }
                 
     		 }
     		 catch (InterruptedException ex) {
     		 }
     		 }
     		 }).start();
		 
     		 
		 teamname.setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 50));
                 
		 teamname2.setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 50));
                 
		 Ib.setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 50));
                 //Ib.setTextAlignment(TextAlignment.CENTER);
		 Ba.setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 50));
                 //Ba.setTextAlignment(TextAlignment.CENTER);
		 Ha.setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 50));
                 //Ha.setTextAlignment(TextAlignment.CENTER);
		 Fa.setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 50));
                 //Fa.setTextAlignment(TextAlignment.CENTER);
		 teamname.setLayoutX(100);
		 teamname.setLayoutY(100);
		 teamname2.setLayoutX(100);
		 teamname2.setLayoutY(100);
		 Ib.setLayoutX(100);
		 Ib.setLayoutY(150);
		 Ba.setLayoutX(100);
		 Ba.setLayoutY(200);
		 Ha.setLayoutX(100);
		 Ha.setLayoutY(250);
		 Fa.setLayoutX(100);
		 Fa.setLayoutY(300);
		 
		pane1.getChildren().add(teamname);		 
		pane1.getChildren().add(teamname2);
		pane1.getChildren().add(Ib);
		pane1.getChildren().add(Ba);
		pane1.getChildren().add(Ha);
		pane1.getChildren().add(Fa);
		Rectangle2D  re=Screen.getPrimary().getVisualBounds();
                
                
		Scene scene = new Scene(pane1,re.getWidth(),re.getHeight());
                
		
		primaryStage.setScene(scene);
		primaryStage.setFullScreen(false);
		primaryStage.show();

}
     
}
