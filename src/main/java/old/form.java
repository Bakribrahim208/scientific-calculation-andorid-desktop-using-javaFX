package main.java.old;
 
import java.net.MalformedURLException;
import java.net.URL;
import javafx.application.Application;
 
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

      @Override
	public   void start(Stage primaryStage) throws Exception {
	 	
    	  //change_stage( show_standard);
    	  Map_scientific.Map_standard_stage(st_scientific);
			     st_scientific.hide();
			    converter.map(st_converter);
			     st_converter.hide();
			     convert_hex.map(st_converter_hex);
			     st_converter_hex.hide();
			     Map_standard.map(st_standard);	
		         st_standard.show();
 	}
       
      
	public static void main(String[] args) {
		 launch(args);

	}

}
   












