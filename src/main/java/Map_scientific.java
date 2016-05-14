package main.java;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.media.*;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

import com.sun.media.sound.JavaSoundAudioClip;

import java.awt.Toolkit;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.layout.VBox;

 
/**
 * @author Lazy team
 * 
 *
 */
public class Map_scientific {
	public static Button[] btns = new Button[30];
	// public static TextField txt = new TextField();
	public static double first_nub;
	public static double second_nub;
	public static double result;
	public static int index;
	public static char operator;
	public static CheckBox sound;
	public static boolean mute_sound;
	public static Label txt;
    public static boolean result_lock;
	public static String path = "C:/Users/UsersFiles/workspace/project_calculate/src/form1/cal sound/";
	/*
	 * used to if type . can't add any . again since type any operation
	 */ public static boolean point = false;
	public static boolean operation_lock = false;
	public static GridPane pane = new GridPane();

	Map_scientific() {
	}

	public static GridPane Map_standard_stage() {
		new Thread (new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					while(true)
					{
						Platform.runLater(new Runnable() {
							
							@Override
							public void run() {
								// TODO Auto-generated method stub
								txt.setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 40-(txt.getText().length())/10));
												
							}
						});
						Thread.sleep(100);
						}
					
					
				}
				catch (Exception e)
				{
					
				}
				
			}
		} ).start();
		

		try {
			pane.setHgap(3);
			pane.setVgap(3);
			pane.setPadding(new Insets(3, 3, 3, 3));
			GridPane pane11 = new GridPane();
			txt = new Label("");
			
			txt.setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 40-(txt.getText().length())));
			pane11.add(txt, 0, 2, 1, 1);
			txt.setStyle(" -fx-background-color:   #3a476a;-fx-text-fill: white;");
			pane11.setStyle("-fx-background-color:black  ;");
			// pane11.setPrefHeight(200);

			pane.add(pane11, 0, 1);

			MenuBar menubar = new MenuBar();
			Menu fileMenu = new Menu("Menu");
			MenuItem standard = new MenuItem("standard");
			MenuItem scientific = new MenuItem("scientific");
			CheckMenuItem sound = new CheckMenuItem("mute sound");
			sound.setOnAction((ActionEvent e) -> {
				if (mute_sound)
					mute_sound = false;
				else
					mute_sound = true;
				});
			Stage stage = new Stage();

			standard.setOnAction((ActionEvent E) -> {
				 form.root.getChildren().add(form.pane);
	 	            double width = form.root.getWidth();
	 	            KeyFrame start = new KeyFrame(Duration.ZERO,
	 	                    new KeyValue(form.pane.translateXProperty(), -width),
	 	                    new KeyValue(form.pane1.translateXProperty(), 0));
	 	            KeyFrame end = new KeyFrame(Duration.seconds(.5),
	 	                    new KeyValue(form.pane.translateXProperty(), 0),
	 	                    new KeyValue(form.pane1.translateXProperty(), width));
	 	            Timeline slide = new Timeline(start, end);
	 	            slide.setOnFinished(e -> form.root.getChildren().remove(form.pane1));
	 	            slide.play();

			

			});

			MenuItem Converter = new MenuItem("Converter");
			Converter.setOnAction((ActionEvent E) -> {
				  form.root.getChildren().add(form.pane_convert);
  	            double width = form.root.getWidth();
  	            KeyFrame start = new KeyFrame(Duration.ZERO,
  	                    new KeyValue(form.pane_convert.translateXProperty(), width),
  	                    new KeyValue(form.pane1.translateXProperty(), 0));
  	            KeyFrame end = new KeyFrame(Duration.seconds(.5),
  	                    new KeyValue(form.pane_convert.translateXProperty(), 0),
  	                    new KeyValue(form.pane1.translateXProperty(), -width));
  	            Timeline slide = new Timeline(start, end);
  	            slide.setOnFinished(e -> form.root.getChildren().remove(form.pane1));
  	            slide.play();

			});
			
			
			MenuItem Converter_hex = new MenuItem("Converter_hex");
			Converter_hex.setOnAction((ActionEvent E) -> {
				  form.root.getChildren().add(form.pane_convert_hex);
	  	            double width = form.root.getWidth();
	  	            KeyFrame start = new KeyFrame(Duration.ZERO,
	  	                    new KeyValue(form.pane_convert_hex.translateXProperty(), width),
	  	                    new KeyValue(form.pane1.translateXProperty(), 0));
	  	            KeyFrame end = new KeyFrame(Duration.seconds(.5),
	  	                    new KeyValue(form.pane_convert_hex.translateXProperty(), 0),
	  	                    new KeyValue(form.pane1.translateXProperty(), -width));
	  	            Timeline slide = new Timeline(start, end);
	  	            slide.setOnFinished(e -> form.root.getChildren().remove(form.pane1));
	  	            slide.play();

			

			});
			MenuItem exitMenuItem = new MenuItem("Exit");
			exitMenuItem.setOnAction(actionEvent ->{ Platform.exit();
				System.exit(0);
				
			});

			fileMenu.getItems().addAll(standard, scientific, new SeparatorMenuItem(), Converter,Converter_hex,new SeparatorMenuItem(), sound, exitMenuItem);

			menubar.getMenus().addAll(fileMenu);

			pane.add(menubar, 0, 0);
			menubar.setStyle(
					"-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: #3a476a;");
		 
			GridPane pane2 = new GridPane();
			pane2.setHgap(3);
			pane2.setVgap(3);
			// pane2.setPadding(new Insets(10, 10, 10, 10));

			btns = create_btns();
			btns = text(btns);
			int count = 0;
			for (int row = 0; row < 6; row++) {
				for (int column = 0; column < 5; column++) {
					pane2.add(btns[count], column, row);
					count++;
				}
			}

			equal();
			handel_standard();
			handel_num_btns();
			handel_basic_operation_btns();
			handel_btns_other();

			pane.add(pane2, 0, 8);
			Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
			Scene scene = new Scene(pane, screenBounds.getWidth(), screenBounds.getHeight());

			// pane2.prefHeightProperty().bind(scene.heightProperty(
			// ).divide(5));

			txt.prefHeightProperty().bind(scene.heightProperty().divide(7));
			txt.prefWidthProperty().bind(scene.widthProperty());
			for (int i = 0; i < 30; i++) {
				btns[i].prefHeightProperty().bind(scene.heightProperty().divide(7));
				btns[i].prefWidthProperty().bind(scene.widthProperty().divide(4));
			}

			return pane;
		//	primaryStage.show();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return pane;
	}

	public static Button[] create_btns() {
		Button[] ss = new Button[30];
		for (int i = 0; i < 30; i++) {
			btn_number a = new btn_number("");
			ss[i] = a.get_btns();
			ss[i].setPrefWidth(80);
			ss[i].setPrefHeight(50);
			ss[i].setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 20));
			a = null;
		}

		return ss;
	}

	public static Button[] text(Button[] b) {

		b[0].setText("n!");
		b[0].setStyle(
				"-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[1].setText("^");
		b[1].setStyle(
				"-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[2].setText("sqr");
		b[2].setStyle(
				"-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[3].setText("π");
		b[3].setStyle(
				"-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[4].setText("c");
		b[4].setStyle(
				"-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[5].setText("sin");
		b[5].setStyle(
				"-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[6].setText("(");
		 

		b[7].setText(")");
		 

		b[8].setText("%");
		 

		b[9].setText("del");
		b[9].setStyle(
				"-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[10].setText("cos");
		b[10].setStyle(
				"-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[11].setText("7");
		 

		b[12].setText("8");
		 
		b[13].setText("9");
		 

		b[14].setText("/");
		b[14].setStyle(
				"-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[15].setText("tan");
		b[15].setStyle(
				"-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[16].setText("4");
		 
		b[17].setText("5");
		//b[17].setStyle(
			//	"-fx-background-color: #3a476a; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[18].setText("6");
		 

		b[19].setText("*");
		b[19].setStyle(
				"-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[20].setText("Ln");
		b[20].setStyle(
				"-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[21].setText("1");
	 

		b[22].setText("2");
		//b[22].setStyle(
				//"-fx-background-color: #3a476a; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[23].setText("3");
 
		b[24].setText("-");
		b[24].setStyle(
				"-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[25].setText("log");
		b[25].setStyle(
				"-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[26].setText("0");
		 
		b[27].setText(".");
	 

		b[28].setText("=");
		b[28].setStyle(
				"-fx-background-color: #3a476a; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[29].setText("+");
		b[29].setStyle(
				"-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		return b;
	}

	public static void handel_standard() {
		btns[25].setOnAction((ActionEvent e) -> {
			
			txt.setText(txt.getText() + "log(");
			operation_lock = false;
			if (mute_sound) {
			} else {
 			}
		});

		btns[20].setOnAction((ActionEvent e) -> {
			txt.setText(txt.getText() + "ln(");
			operation_lock = false;
			 
		});
		btns[15].setOnAction((ActionEvent e) -> {
			txt.setText(txt.getText() + "tan(");
			operation_lock = false;
			 

		});
		btns[10].setOnAction((ActionEvent e) -> {
			txt.setText(txt.getText() + "cos(");
			operation_lock = false;
			 

		});

		btns[8].setOnAction((ActionEvent e) -> {
		double per=Double.parseDouble(txt.getText().substring(0, txt.getText().length()))/100.0;/////////////////////////////////////////////////////
			txt.setText(per + "%");
			operation_lock = false;

		});
		btns[5].setOnAction((ActionEvent e) -> {
			txt.setText(txt.getText() + "sin(");
			operation_lock = false;
			 
		});
		btns[3].setOnAction((ActionEvent e) -> {
			txt.setText(txt.getText() + "22/7");
			operation_lock = false;
			 
		});
		btns[2].setOnAction((ActionEvent e) -> {
			txt.setText(txt.getText() + "sqr(");
			operation_lock = false;
		 

		});
		btns[1].setOnAction((ActionEvent e) -> {
			txt.setText(txt.getText() + "^");
			operation_lock = false;
			 

		});
	}

	public static void handel_num_btns() {
		btns[26].setOnAction((ActionEvent e) -> {
			delete_screen_when_press_equal();

			txt.setText(txt.getText() + "0");
			operation_lock = false;
			 
		});
		btns[23].setOnAction((ActionEvent e) -> {
			delete_screen_when_press_equal();

			txt.setText(txt.getText() + "3");
			operation_lock = false;
			 
		});
		btns[22].setOnAction((ActionEvent e) -> {
			delete_screen_when_press_equal();

			txt.setText(txt.getText() + "2");
 			operation_lock = false;
			 
		});
		btns[21].setOnAction((ActionEvent e) -> {
			delete_screen_when_press_equal();

			txt.setText(txt.getText() + "1");
 			operation_lock = false;
			 
		});

		btns[18].setOnAction((ActionEvent e) -> {
			delete_screen_when_press_equal();

			txt.setText(txt.getText() + "6");
 			operation_lock = false;
			 
		});
		btns[17].setOnAction((ActionEvent e) -> {
			delete_screen_when_press_equal();

			txt.setText(txt.getText() + "5");
			operation_lock = false;
			 
		});
		btns[16].setOnAction((ActionEvent e) -> {
			delete_screen_when_press_equal();
			
			txt.setText(txt.getText() + "4");
			operation_lock = false;
			 
		});

		btns[13].setOnAction((ActionEvent e) -> {
			delete_screen_when_press_equal();

			txt.setText(txt.getText() + "9");
			operation_lock = false;
		 
		});
		btns[12].setOnAction((ActionEvent e) -> {
			delete_screen_when_press_equal();

			txt.setText(txt.getText() + "8");
 			operation_lock = false;
			 
		});
		btns[11].setOnAction((ActionEvent e) -> {
			delete_screen_when_press_equal();

			txt.setText(txt.getText() + "7");
			operation_lock = false;
			 
		});
		btns[27].setOnAction((ActionEvent e) -> {
			if (txt.getText().toCharArray()[txt.getText().length() - 1] == '.' && txt.getText().length() > 0) {
			} else {
				if (point) {
				} else {
					delete_screen_when_press_equal();

					txt.setText(txt.getText() + ".");
					point = true;
					operation_lock = false;
				 
				}
			}
		});

	}

	public static void handel_basic_operation_btns() {
		btns[29].setOnAction((ActionEvent e) -> {
			if (operation_lock) {

			} else {
				if (txt.getText().length() < 1) {
				} else {
					txt.setText(txt.getText() + "+");
					point = false;
					result_lock=false;

					operation_lock = true;
					 
				}
			}
		});

		btns[19].setOnAction((ActionEvent e) -> {
			if (operation_lock) {

			} else {
				if (txt.getText().length() < 1) {
				} else {
					txt.setText(txt.getText() + "*");
					point = false;
					result_lock=false;

					operation_lock = true;
					 
				}
			}
		});
		btns[24].setOnAction((ActionEvent e) -> {
			if (operation_lock) {

			} else {
				txt.setText(txt.getText() + "-");
				result_lock=false;

				point = false;
				operation_lock = true;
				 
			}
		});
		btns[14].setOnAction((ActionEvent e) -> {
			if (operation_lock) {

			} else {

				if (txt.getText().length() < 1) {
				} else {
					txt.setText(txt.getText() + "/");
					result_lock=false;

					point = false;
					operation_lock = true;
				 
				}
			}
		});
	}

	public static void handel_btns_other() {
		btns[6].setOnAction((ActionEvent e) -> {
			txt.setText(txt.getText() + "(");
			operation_lock = false;
			 
		});
		btns[7].setOnAction((ActionEvent e) -> {
			txt.setText(txt.getText() + ")");
			operation_lock = false;
			 
		});
		/*
		 * to reset the txt
		 */ btns[4].setOnAction((ActionEvent e) -> {
			txt.setText("");
			operation_lock = false;

		});
		/*
		 * using to delete the last element in txt
		 */ btns[9].setOnAction((ActionEvent e) -> {
			if (txt.getText() != null && txt.getText().length() > 0) {
				operation_lock = false;
				txt.setText(txt.getText().substring(0, txt.getText().length() - 1));
			}
		});

		btns[0].setOnAction((ActionEvent e) -> {

			txt.setText(txt.getText() + "fac(");
			 
			
			 
		});

	}

	public static void equal() {
		 try{
		btns[28].setOnAction((ActionEvent e) -> {
			if (txt.getText().length() < 1) {
			} else {
				 
				operation op = new operation();
				if (op.brackets(txt.getText()) == "Error: incorrect brackets placement")
					txt.setText("0");
				else
					txt.setText(op.brackets(txt.getText()));
				
				point = false;
				result_lock=true;

			}
		}); 
		
		 }
		 catch(Exception ex){
			 btns[4].fire();
			 txt.setText("INvaild input");
		 }
	}

	public static void sound_func(String sound) {
		if (mute_sound) {
		} else {
			Group root = new Group();
			File file = new File(path + sound + ".mp3");
			Media m = new Media(file.toURI().toString());
			MediaPlayer p = new MediaPlayer(m);
			MediaView v = new MediaView(p);
			root.getChildren().add(v);
			p.play();
		}
	}

	  public  static void delete_screen_when_press_equal(){
	    	 if(result_lock){
	    		 btns[4].fire();
					result_lock=false;}
	     }

}
