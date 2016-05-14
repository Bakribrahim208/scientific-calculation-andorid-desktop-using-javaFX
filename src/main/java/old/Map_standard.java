package main.java.old;
import java.io.File;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
 import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
public class Map_standard {
	public static Button[] btns = new Button[16];
	public static Label txt = new Label();
	public static boolean point;
	public static boolean operation_lock = false;
	public static Scene scene;
	public static GridPane pane = new GridPane();
	final static Clipboard clipboard = Clipboard.getSystemClipboard();
	final static ClipboardContent content = new ClipboardContent();
	public static boolean mute_sound;
	public static String path = "C:/Users/UsersFiles/workspace/project_calculate/src/form1/cal sound/";

	Map_standard() {}
	public static void  map(Stage primaryStage) {
		try {
			// pane
			pane.setHgap(2);
			pane.setVgap(2);
			pane.setPadding(new Insets(2, 2, 2, 2));
             MenuBar menubar=new MenuBar();
             Menu fileMenu = new Menu("MENU");
              MenuItem standard = new MenuItem("standard");
             MenuItem scientific = new MenuItem("scientific");
             CheckMenuItem sound=new CheckMenuItem("mute sound");
             
             scientific.setOnAction((ActionEvent E) -> {
 				form.show_standard = false;
 				form.st_scientific.show();
 				form.st_standard.hide();
 			});
             sound.setOnAction((ActionEvent E) -> {
 				if(mute_sound)
 					mute_sound=false;
 					else
 						mute_sound=true;
 					});
             
             
             MenuItem Converter = new MenuItem("Converter");
             Converter.setOnAction((ActionEvent E) -> {
   				form.show_standard = false;
   				 form.st_converter.show();
   				form.st_standard.hide();
   			});
             MenuItem Converter_hex = new MenuItem("Converter_hex");
             Converter_hex.setOnAction((ActionEvent E) -> {
   				form.show_standard = false;
   				 form.st_converter_hex.show();
   				form.st_standard.hide();
   			});
            MenuItem exitMenuItem = new MenuItem("Exit");
            
             Converter.setOnAction((ActionEvent E) -> {
   				form.st_converter.show();
  				form.st_standard.hide();
  			});
             
             
             
            
             exitMenuItem.setOnAction(actionEvent -> Platform.exit());
             
             fileMenu.getItems().addAll(standard, scientific,
            	        new SeparatorMenuItem(),Converter,Converter_hex,sound,exitMenuItem);
            
             menubar.getMenus().addAll(fileMenu);
 			pane.add(menubar, 0, 0);
              menubar.setStyle("-fx-background-color: transparent;-fx-font-family: Baumans;-fx-font-size: 10px;-fx-text-fill: #00CCFF;");

             
			// textfield Properties
			txt.setLayoutX(0);
			txt.setLayoutY(0);
			//txt.setDisable(true);// to make it read only
			txt.setPrefHeight(50);
			txt.setPrefWidth(50);
			txt.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
			txt.setStyle(
					"-fx-background-color: #3a476a;-fx-text-fill: white;");
			
			//context menu for copy ,cut paste the value in textffield
			final ContextMenu contextMenu = new ContextMenu();
			MenuItem cut = new MenuItem("Cut");
			MenuItem copy = new MenuItem("Copy");
			MenuItem paste = new MenuItem("Paste");
			contextMenu.getItems().addAll(cut, copy, paste);
			copy.setOnAction(new EventHandler<ActionEvent>() {
			    @Override
			    public void handle(ActionEvent event) {
			    	
			    	content.putString(txt.getText());
			    	clipboard.setContent(content);
			    }
			});
			
			
			
			cut.setOnAction(new EventHandler<ActionEvent>() {
			    @Override
			    public void handle(ActionEvent event) {
			    	content.putString(txt.getText());
			    	clipboard.setContent(content);
			    	txt.setText("");
			    }
			});
			paste.setOnAction(new EventHandler<ActionEvent>() {
			    @Override
			    public void handle(ActionEvent event) {
			    	if(content.hasString()){
			    		txt.setText(txt.getText()+content.getString());
			    	}
			    
 			    }
			});
			txt.setContextMenu(contextMenu);
			pane.add(txt, 0, 4,1,2);

			// grid pane to hold the buttons of number and operation
			GridPane pane2 = new GridPane();
			pane2.setHgap(1);
			pane2.setVgap(1);
			  pane2.setPadding(new Insets(1, 1, 1, 1));

			// array of buttons that contians all buttons
			btns = create_btns();
			btns = text(btns);
			int count = 0;
			// drow button on grid pane in the shape of columns and rows
			for (int row = 0; row < 5; row++) {
				for (int column = 0; column < 4; column++) {
					pane2.add(btns[count], column, row);
					count++;
				}
			}
			pane.add(pane2, 0, 7);

			
			
			// handle events
			Handle_Number_buttons();
			Handle_DElete_buttons();
			Handle_Operation_buttons();
			equal();
			
			
			
			Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
			scene = new Scene(pane, screenBounds.getWidth(), screenBounds.getHeight());
			//pane2.prefHeightProperty().bind(scene.heightProperty());
			for (int i = 0; i < 20; i++) {
				btns[i].prefHeightProperty().bind(scene.heightProperty().divide(7));
				btns[i].prefWidthProperty().bind(scene.widthProperty().divide(4));
			}
			txt.prefHeightProperty().bind(scene.heightProperty().divide(7));
			txt.prefWidthProperty().bind(scene.widthProperty());
			primaryStage.setScene(scene);
			//primaryStage.setResizable(true);
			//primaryStage.setFullScreen(true);
		//	primaryStage.show();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void Handle_DElete_buttons() {

		try {
			// delete the last char in txtfield
			btns[1].setOnAction((ActionEvent E) -> {
				if (txt.getText() != null && txt.getText().length() > 0) {
					txt.setText(txt.getText().substring(0, txt.getText().length() - 1));
				}
			});
			// make textfield empty
			btns[0].setOnAction((ActionEvent E) -> {
				txt.setText("");
			});

		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}

	public static void Handle_Operation_buttons() {
		try {

			// operation
			btns[7].setOnAction((ActionEvent e) -> {
				if (operation_lock) {

				} else {
					if (txt.getText().length() < 1) {
					} else {
						txt.setText(txt.getText() + "/");
						point = false;
						operation_lock = true;

					}
				}
			});

			btns[11].setOnAction((ActionEvent e) -> {
				if (operation_lock) {

				} else {
					if (txt.getText().length() < 1) {
					} else {
						txt.setText(txt.getText() + "*");
						point = false;
						operation_lock = true;

					}
				}
			});

			btns[15].setOnAction((ActionEvent e) -> {
				if (operation_lock) {

				} else {
					txt.setText(txt.getText() + "-");
					point = false;
					operation_lock = true;

				}
			});

			btns[19].setOnAction((ActionEvent e) -> {
				if (operation_lock) {

				} else {
					if (txt.getText().length() < 1) {
					} else {
						txt.setText(txt.getText() + "+");
						point = false;
						operation_lock = true;

					}
				}
			});

			//form1.events.btn_equal btn_equal = new form1.events.btn_equal();
		
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}

	public static void Handle_Number_buttons() {

		try {
			btns[17].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "0");
				operation_lock = false;
			});
			btns[12].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "1");
				operation_lock = false;

			});
			btns[13].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "2");
				operation_lock = false;

			});
			btns[14].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "3");
				operation_lock = false;
				

			});
			btns[8].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "4");
				operation_lock = false;

			});
			btns[9].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "5");
				operation_lock = false;

			});
			btns[10].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "6");
 				operation_lock = false;

			});
			btns[4].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "7");
				operation_lock = false;

			});
			btns[5].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "8");
				operation_lock = false;
				

			});
			btns[6].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "9");
				operation_lock = false;

			});

			btns[3].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + ")");
				operation_lock = false;
			});

			btns[2].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "(");
				operation_lock = false;

			});

			btns[18].setOnAction((ActionEvent e) -> {
				if (txt.getText().toCharArray()[txt.getText().length() - 1] == '.' && txt.getText().length() > 0) {
				} else {
					if (point) {
					} else {
						txt.setText(txt.getText() + ".");
						point = true;

					}
				}
			});
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}

	public static Button[] create_btns() {
		Button[] ss = new Button[20];
		for (int i = 0; i < 20; i++) {
			btn_number a = new btn_number("");
			ss[i] = a.get_btns();

			a = null;
		}

		return ss;
	}

	public static Button[] text(Button[] b) {

		b[0].setText("C");
		b[0].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[1].setText("Del");
		b[1].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[2].setText("(");
		b[2].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[3].setText(")");
		b[3].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[4].setText("7");
		b[5].setText("8");
		b[6].setText("9");
		b[7].setText("/");
		b[7].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[8].setText("4");
		b[9].setText("5");
		b[10].setText("6");
		b[11].setText("*");
		b[11].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[12].setText("1");
		b[13].setText("2");
		b[14].setText("3");
		b[15].setText("-");
		b[15].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[16].setText("=");
		b[16].setStyle("-fx-background-color:#3a476a; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[17].setText("0");
		b[18].setText(".");
		b[19].setText("+");
		b[19].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		return b;

	}
	public static void equal() {
		btns[16].setOnAction((ActionEvent e) -> {
			if (txt.getText().length() < 1) {
			} else {
				operation op = new operation();
				if (op.brackets(txt.getText()) == "Error: incorrect brackets placement")
					txt.setText("0");
				else
					txt.setText(op.brackets(txt.getText()));
				point = false;
				
			}
		});
	
	
 
	}
	public static void sound_func(String sound) {
		try{
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
		catch(Exception ex){
			txt.setText(ex.toString());
		}
	}
   
}
