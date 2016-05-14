package main.java;
 
import java.net.MalformedURLException;
import java.net.URL;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Screen;
import javafx.stage.Stage;
/**
 * @author Lazy team
 *Ibrahim mohamed mostafa 
 *Abubakr ibrahim Ataa
 *Ahmed hamdy kamal
 *Alfarouk omr farouk
 *
 */
public class form extends Application{

    public static boolean show_standard=true;
    public static boolean show_converter=true;
    public static  Stage st_standard =new Stage();
    public static  Stage st_scientific =new Stage();
    public static  Stage st_converter =new Stage();
    public static  Stage st_converter_hex =new Stage();
    public static    GridPane pane = new GridPane();
    public static 	GridPane pane1 = new GridPane();
    public static 	GridPane pane_convert = new GridPane();
    public static    GridPane pane_convert_hex = new GridPane();
    public static Stage  font_stage=new Stage();
	public static Scene scene;
     public static StackPane root;

int count=0;
      @Override
	public   void start(Stage primaryStage) throws Exception {
	 	
            
    	  
 	 	 pane1=Map_scientific.Map_standard_stage();
 	 	pane =Map_standard.map();
 	 	 root=new StackPane(pane);
 	 	 pane_convert=converter.map();
 	 	pane_convert_hex=convert_hex.map();
 	  		//root=new StackPane(pane_convert);
       	   Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
 			scene = new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());
 			st_standard.setScene(scene);
     	   st_standard.show();
    	   
 	}
      
      
	public static void main(String[] args) {
		 launch(args);

	}

}
   












