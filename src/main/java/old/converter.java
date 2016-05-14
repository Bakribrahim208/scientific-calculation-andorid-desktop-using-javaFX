package main.java.old;

import java.math.BigDecimal;
import java.util.List;

 import javafx.beans.binding.DoubleBinding;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Screen;
import javafx.stage.Stage;
 
public class converter {
	public static boolean point;
	public static Button[] btns = new Button[13];
	public static ComboBox<String> cmb;
	public static ComboBox<String> cmb2;
	public static ComboBox<String> cmb3;
	public static TextField txt2 = new TextField();
	public static 	TextField txt = new TextField();

	public static String[] Volum = new String[] { "milliLiters", "cubic centimeters", "liters", "cubic meters",
			"Gallons" };
	public static String[] weight = new String[] { "milligrams", "centigrams", "Grams", "Kilo grams", "pounds" };
	public static String[] speed = new String[] { "centimeters per second", "meters per second", "kilometers per hour",
			"feet per second" };
	public static String[] Area = new String[] { "square millimeters", "square centimeters", "square meters", "Hacters",
			"square kilimeter", "square inches", "square yards", "Acres", "square miles", };
	public static String[] lengh = new String[] { "Nanometers", "Micro", "Millimeter", "centimeter", "meters",
			"Kilometers", "Inch", "Feet", "yards", "Miles", "Nautical Miles" };
	public static String[] Temperture = new String[] { "celsius", "fahrenheit", "kelvin" };
	public static String[] Energy = new String[] { "Electorn Volts", "joules", "kilojoules" };
	public static String[] Time = new String[] { "microSecond", "Millisecond", "Second", "Mintue", "Hours", "Days",
			"Weaks", "Years" };
	public static String[] power = new String[] { "watts", "kiloWatts", "Horspower (us)" };
	public static String[] Data = new String[] { "Bit", "Byte", "Kilobyte", "Megabyte", "Gigabyte", "Terrabyte",
			"Petabyte", "Exabyte", "Zettabyte", "Yottabyte", };

	/*
	 * chang format of string from -e to ordinary number
	 */ public static String string_format(double d) {
		/*if (d == (long) d)
			return String.format("%d", (long) d);
		else
			return String.format("%s", d);*/
		 return BigDecimal.valueOf(d).toPlainString();
	}

	public  static void map(Stage primaryStage) {
		try {
			GridPane pane = new GridPane();
			pane.setHgap(10);
			pane.setVgap(10);
			cmb = new ComboBox<>();
			cmb.getItems().addAll("Volum", "weight", "speed", "Area", "lengh", "Temperture", "Energy", "Time", "power","Data");
			cmb.setPromptText("choos");
			cmb.setPrefWidth(200);
			cmb.setStyle("-fx-font: 30px \"Serif\";");
			pane.add(cmb, 0, 1);

			cmb2 = new ComboBox<>();
			// cmb2.getItems().addAll(Area);
			cmb2.setStyle("-fx-font: 30px \"Serif\";");
			pane.add(cmb2, 0, 5);

			pane.add(txt, 0, 7);
			txt.setLayoutX(0);
			txt.setLayoutY(0);
			txt.setPrefHeight(100);
			txt.setPrefWidth(250);
			txt.setFont(Font.font("Helvetica", FontWeight.BOLD, 20));
			txt.setStyle(
					"-fx-background-color: linear-gradient(gray, gray); -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

			
			pane.add(txt2, 0, 11);
			txt2.setLayoutX(0);
			txt2.setLayoutY(0);
			txt2.setPrefHeight(100);
			txt2.setPrefWidth(250);
			txt2.setFont(Font.font("Helvetica", FontWeight.BOLD, 20));
			txt2.setStyle(
					"-fx-background-color: linear-gradient(gray, gray); -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

			cmb3 = new ComboBox<>();
			// cmb3.getItems().addAll(Area);
			cmb3.setStyle("-fx-font: 30px \"Serif\";");
			pane.add(cmb3, 0, 9);
			cmb3.setStyle(" -fx-font-weight: bold;-fx-text-fill: white; ");
			cmb.setStyle(" -fx-font-weight: bold;-fx-text-fill: white; ");
			cmb2.setStyle(" -fx-font-weight: bold;-fx-text-fill: white; ");
			txt.setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 50));
 			txt2.setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 50));
 			txt.setStyle(
					"-fx-background-color: #3a476a;-fx-text-fill: white;");
 			txt2.setStyle(
					"-fx-background-color: #3a476a;-fx-text-fill: white;");
 			cmb.setValue("Area");
 			cmb2.setValue("square millimeters");
 			cmb3.setValue("square millimeters");
			cmb.setOnAction((ActionEvent E) -> {
				switch (cmb.getValue()) {

				case "Volum":
					cmb2.getItems().clear();
					cmb3.getItems().clear();
					cmb2.getItems().addAll(Volum);
					cmb3.getItems().addAll(Volum);
					break;
				case "weight":
					cmb2.getItems().clear();
					cmb3.getItems().clear();
					cmb2.getItems().addAll(weight);
					cmb3.getItems().addAll(weight);
					break;

				case "speed":
					cmb2.getItems().clear();
					cmb3.getItems().clear();
					cmb2.getItems().addAll(speed);
					cmb3.getItems().addAll(speed);
					break;
				case "Area":
					cmb2.getItems().clear();
					cmb3.getItems().clear();
					cmb2.getItems().addAll(Area);
					cmb3.getItems().addAll(Area);
					break;
				case "lengh":
					cmb2.getItems().clear();
					cmb3.getItems().clear();
					cmb2.getItems().addAll(lengh);
					cmb3.getItems().addAll(lengh);
					break;
				case "Temperture":
					cmb2.getItems().clear();
					cmb3.getItems().clear();
					cmb2.getItems().addAll(Temperture);
					cmb3.getItems().addAll(Temperture);
					break;
				case "Energy":
					cmb2.getItems().clear();
					cmb3.getItems().clear();
					cmb2.getItems().addAll(Energy);
					cmb3.getItems().addAll(Energy);
					break;
				case "Time":
					cmb2.getItems().addAll(Time);
					cmb3.getItems().addAll(Time);
					break;
				case "power":
					cmb2.getItems().clear();
					cmb3.getItems().clear();
					cmb2.getItems().addAll(power);
					cmb3.getItems().addAll(power);
					break;
				case "Data":
					cmb2.getItems().clear();
					cmb3.getItems().clear();
					cmb2.getItems().addAll(Data);
					cmb3.getItems().addAll(Data);
					break;

				}
			});
			cmb3.setOnAction((ActionEvent e) -> {
				switch (cmb.getValue()) {

				case "Volum":
					 
					break;
				case "weight":
					weight();
					break;

				case "speed":
					 
					break;
				case "Area":
					Area();
					break;
				case "lengh":
					 
					break;
				case "Temperture":
					tempture();
					break;
				case "Energy":
					energy();
					break;
				case "Time":
					 
					break;
				case "power":
				 
					break;
				case "Data":
					 
					break;

				}
			});
		 	
		 	btns=create_btns();
		  	text(btns);
		  	Handle_Number_buttons();
		  	Handle_DElete_buttons();
		  	
		  	
		  	
		  	int count=2;
			GridPane pane2=new GridPane();
			pane2.add(btns[0], 0, 0);
			btns[0].setStyle("-fx-background-color: #3a476a; -fx-background-radius: 30;-fx-text-fill: white;-fx-border-color: white;");
			pane2.add(btns[1], 1, 0,2,1);
			btns[1].setStyle("-fx-background-color: #3a476a; -fx-background-radius: 30;-fx-text-fill: white;-fx-border-color: white;");
			for (int row = 1; row <4; row++) {
				for (int column = 0; column < 3; column++) {
					pane2.add(btns[count], column, row);
					count++;
				}
			} 
			pane2.add(btns[11], 0,4,2,1);
			pane2.add(btns[12], 2, 4);
 			pane2.setPadding(new Insets(100, 100, 100, 100));

			  GridPane Main_pane=new GridPane();
			  Main_pane.add(pane, 0, 0);
			  Main_pane.add(pane2, 1, 0,4,1);
			  Main_pane.setHgap(30);
			  Main_pane.setVgap(30);
			Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
			Scene scene = new Scene(Main_pane, screenBounds.getWidth(), screenBounds.getHeight());
			for (int i = 0; i < 13; i++) {
				
				btns[i].prefHeightProperty().bind(scene.heightProperty().divide(10));
				btns[i].prefWidthProperty().bind(scene.widthProperty().divide(10));
			}
 			btns[1].prefWidthProperty().bind(scene.widthProperty().divide(10).multiply(2));
 			btns[11].prefWidthProperty().bind(scene.widthProperty().divide(10).multiply(2));

 			cmb.prefHeightProperty().bind(scene.heightProperty().divide(10));
			cmb2.prefHeightProperty().bind(scene.heightProperty().divide(10));
			cmb3.prefHeightProperty().bind(scene.heightProperty().divide(10));
			txt2.prefHeightProperty().bind(scene.heightProperty().divide(5));
			txt.prefHeightProperty().bind(scene.heightProperty().divide(5));
			cmb.prefWidthProperty().bind(scene.widthProperty().divide(3));
			cmb2.prefWidthProperty().bind(scene.widthProperty().divide(3));
			cmb3.prefWidthProperty().bind(scene.widthProperty().divide(3));
			txt2.prefWidthProperty().bind(scene.widthProperty().divide(3));
			txt.prefWidthProperty().bind(scene.widthProperty().divide(3));
 			primaryStage.setFullScreen(true);
			primaryStage.setScene(scene);
			primaryStage.show();

		} 
		catch (Exception ex) {

		}

	}
	public static void Handle_Number_buttons() {

		try {
			btns[11].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "0");
				 cmb3.fireEvent(e);

			});
			btns[8].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "1");
				 cmb3.fireEvent(e);

			});
			btns[9].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "2");
				 cmb3.fireEvent(e);

			});
			btns[10].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "3");
				 cmb3.fireEvent(e);

			});
			btns[5].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "4");
				 cmb3.fireEvent(e);

			});
			btns[6].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "5");
				 cmb3.fireEvent(e);

			});
			btns[7].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "6");
				 cmb3.fireEvent(e);

			});
			btns[2].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "7");
				 cmb3.fireEvent(e);

			});
			btns[3].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "8");
				 cmb3.fireEvent(e);

			});
			btns[4].setOnAction((ActionEvent e) -> {
				txt.setText(txt.getText() + "9");
				 cmb3.fireEvent(e);

			});

			btns[12].setOnAction((ActionEvent e) -> {
				 if(txt.getText().contains(".")){ 
 
			}
				 else
						txt.setText(txt.getText() + ".");
				 cmb3.fireEvent(e);

			});
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
	public static void Handle_DElete_buttons() {

		try {
			// delete the last char in txtfield
			btns[1].setOnAction((ActionEvent E) -> {
				if(txt.getText().length()==0){
					txt2.setText("");
				}
				else{
					
				if (txt.getText() != null && txt.getText().length() > 0) {
					txt.setText(txt.getText().substring(0, txt.getText().length() - 1));
					 cmb3.fireEvent(E);
					 
				}
				}
			});
			// make textfield empty
			btns[0].setOnAction((ActionEvent E) -> {
				txt.setText("");
				txt2.setText("");
          
			});

		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
	public static Button[] text(Button[] b) {

		b[0].setText("C");
		b[0].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[1].setText("Del");
		b[1].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[2].setText("7");
		b[2].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[3].setText("8");
		b[3].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[4].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[5].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[6].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[7].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[8].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[9].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[10].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[11].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[12].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		b[4].setText("9");
		b[5].setText("4");
		b[6].setText("5");
		b[7].setText("6");
		b[8].setText("1");
		b[9].setText("2");
		b[10].setText("3");
		b[11].setText("0");
		b[12].setText(".");
		return b;

	}
	public static Button[] create_btns() {
		Button[] ss = new Button[13];
		for (int i = 0; i < 13; i++) {
			btn_number a = new btn_number("");
			ss[i] = a.get_btns();

			a = null;
		}

		return ss;
	}
	
	public static void Area()
       {switch (cmb2.getValue()) {

		case "square millimeters":
			if (cmb3.getValue() == "square meters") {
				double value = Double.parseDouble(txt.getText());
				value = value / 1000000;
				txt2.setText(String.valueOf(value));
			} else if (cmb3.getValue() == "square millimeters") {
				txt2.setText(txt.getText());
			} else if (cmb3.getValue() == "square centimeters") {
				double value = Double.parseDouble(txt.getText());
				value = value / 10.000;
				txt2.setText(String.valueOf(value));
			} else if (cmb3.getValue() == "Hacters") {
				double value = Double.parseDouble(txt.getText());
				value = value / 10000000000D;
				txt2.setText(String.valueOf(value));
			} else if (cmb3.getValue() == "square kilimeter") {
				double value = Double.parseDouble(txt.getText());
				value = value / 1000000;
				txt2.setText(String.valueOf(value));
			} else if (cmb3.getValue() == "square inches") {
				double value = Double.parseDouble(txt.getText());
				value = value * 0.039370;
				txt2.setText(String.valueOf(value));
			} else if (cmb3.getValue() == "square yards") {
				double value = Double.parseDouble(txt.getText());

				value = value * 0.0010936;
				txt2.setText(String.valueOf(value));

			} else if (cmb3.getValue() == "Acres") {
				double value = Double.parseDouble(txt.getText());

				value = value * 2.4710538e-10D;
				txt2.setText(String.valueOf(value));

			} else if (cmb3.getValue() == "square miles") {
				double value = Double.parseDouble(txt.getText());

				value = value * 6.2137119e-07D;
				txt2.setText(String.valueOf(value));

			}

			break;

		// cm
		case "square centimeters":
			if (cmb3.getValue() == "square millimeters") {
				double value = Double.parseDouble(txt.getText());
				value = value / 0.010000;
				txt2.setText(String.valueOf(value));

			} else if (cmb3.getValue() == "square centimeters") {
				txt2.setText(txt.getText());

			} else if (cmb3.getValue() == "square meters") {
				double value = Double.parseDouble(txt.getText());
				value = value / 10000;
				txt2.setText(String.valueOf(value));

			} else if (cmb3.getValue() == "Hacters") {
				double value = Double.parseDouble(txt.getText());

				value = value / 100000000d;
				txt2.setText(String.valueOf(value));

			} else if (cmb3.getValue() == "square kilimeter") {
				double value = Double.parseDouble(txt.getText());

				value = value / 10000000000d;
				txt2.setText(String.valueOf(value));

			}

			else if (cmb3.getValue() == "square inches") {
				double value = Double.parseDouble(txt.getText());

				value = value * 0.15500;
				txt2.setText(String.valueOf(value));

			} else if (cmb3.getValue() == "square yards") {
				double value = Double.parseDouble(txt.getText());

				value = value * 0.00011960;
				txt2.setText(String.valueOf(value));

			} else if (cmb3.getValue() == "Acres") {
				double value = Double.parseDouble(txt.getText());

				value = value * 2.4710538e-08D;
				txt2.setText(String.valueOf(value));

			} else if (cmb3.getValue() == "square miles") {
				double value = Double.parseDouble(txt.getText());
				value = value * 3.8610216e-11D;
				txt2.setText(String.valueOf(value));
			}

			break;
		// m
		case "square meters":
			if (cmb3.getValue() == "square millimeters") {
				double value = Double.parseDouble(txt.getText());
				value = value * 1000000;
				txt2.setText(String.valueOf(value));

			} else if (cmb3.getValue() == "square centimeters") {

				double value = Double.parseDouble(txt.getText());
				value = value / 0.00010000;
				txt2.setText(String.valueOf(value));

			} else if (cmb3.getValue() == "square meters") {

				txt2.setText(txt.getText());

			} else if (cmb3.getValue() == "Hacters") {
				double value = Double.parseDouble(txt.getText());

				value = value / 10000d;
				txt2.setText(String.valueOf(value));

			} else if (cmb3.getValue() == "square kilimeter") {
				double value = Double.parseDouble(txt.getText());

				value = value / 1000000d;
				txt2.setText(String.valueOf(value));

			}

			else if (cmb3.getValue() == "square inches") {
				double value = Double.parseDouble(txt.getText());

				value = value * 1550.0;
				txt2.setText(String.valueOf(value));

			} else if (cmb3.getValue() == "square yards") {
				double value = Double.parseDouble(txt.getText());

				value = value * 1.1960;
				txt2.setText(String.valueOf(value));

			} else if (cmb3.getValue() == "Acres") {
				double value = Double.parseDouble(txt.getText());

				value = value * 0.00024711D;
				txt2.setText(String.valueOf(value));

			} else if (cmb3.getValue() == "square miles") {
				double value = Double.parseDouble(txt.getText());
				value = value * 3.8610216e-07D;
				txt2.setText(String.valueOf(value));
			}

			break;
		// Hacters
		case "Hacters":
			if (cmb3.getValue() == "square millimeters") {
				double value = Double.parseDouble(txt.getText());
				value = value / 1e-10;

				txt2.setText(string_format(value));
			} else if (cmb3.getValue() == "square centimeters") {
				double value = Double.parseDouble(txt.getText());
				value = value / 1e-08;
				txt2.setText(string_format(value));

			} else if (cmb3.getValue() == "square meters") {

				double value = Double.parseDouble(txt.getText());
				value = value / 0.00010000;
				txt2.setText(string_format(value));
			} else if (cmb3.getValue() == "Hacters") {

				txt2.setText(txt.getText());

			} else if (cmb3.getValue() == "square kilimeter") {
				double value = Double.parseDouble(txt.getText());

				value = value / 100.00;
				txt2.setText(String.valueOf(value));

			}

			else if (cmb3.getValue() == "square inches") {
				double value = Double.parseDouble(txt.getText());

				value = value * 15500000;
				txt2.setText(string_format(value));

			} else if (cmb3.getValue() == "square yards") {
				double value = Double.parseDouble(txt.getText());

				value = value * 11960;
				txt2.setText(string_format(value));

			} else if (cmb3.getValue() == "Acres") {
				double value = Double.parseDouble(txt.getText());

				value = value * 2.4711D;
				txt2.setText(string_format(value));

			} else if (cmb3.getValue() == "square miles") {
				double value = Double.parseDouble(txt.getText());
				value = value * 0.0038610D;
				txt2.setText(string_format(value));
			}

			break;
		// square kilimeter
		case "square kilimeter":
			if (cmb3.getValue() == "square millimeters") {
				double value = Double.parseDouble(txt.getText());
				value = value / 1e-12;

				txt2.setText(string_format(value));
			} else if (cmb3.getValue() == "square centimeters") {
				double value = Double.parseDouble(txt.getText());
				value = value / 1e+10;
				txt2.setText(string_format(value));

			} else if (cmb3.getValue() == "square meters") {

				double value = Double.parseDouble(txt.getText());
				value = value / 1e-06;
				txt2.setText(string_format(value));
			} else if (cmb3.getValue() == "Hacters") {

				double value = Double.parseDouble(txt.getText());
				value = value / 0.010000;
				txt2.setText(string_format(value));

			} else if (cmb3.getValue() == "square kilimeter") {

				txt2.setText(String.valueOf(txt.getText()));

			}

			else if (cmb3.getValue() == "square inches") {
				double value = Double.parseDouble(txt.getText());

				value = value * 1550000000;
				txt2.setText(string_format(value));

			} else if (cmb3.getValue() == "square yards") {
				double value = Double.parseDouble(txt.getText());

				value = value * 1196000;
				txt2.setText(string_format(value));

			} else if (cmb3.getValue() == "Acres") {
				double value = Double.parseDouble(txt.getText());

				value = value * 247.11D;
				txt2.setText(string_format(value));

			} else if (cmb3.getValue() == "square miles") {
				double value = Double.parseDouble(txt.getText());
				value = value * 0.38610D;
				txt2.setText(string_format(value));
			}
			break;

		// square inches
		case "square inches":
			if (cmb3.getValue() == "square millimeters") {
				double value = Double.parseDouble(txt.getText());
				value = value / 0.0015500;

				txt2.setText(string_format(value));
			} else if (cmb3.getValue() == "square centimeters") {
				double value = Double.parseDouble(txt.getText());
				value = value / 0.15500;
				txt2.setText(string_format(value));

			} else if (cmb3.getValue() == "square meters") {

				double value = Double.parseDouble(txt.getText());
				value = value / 1550.0;
				txt2.setText(string_format(value));
			} else if (cmb3.getValue() == "Hacters") {

				double value = Double.parseDouble(txt.getText());
				value = value / 15500000;
				txt2.setText(string_format(value));

			} else if (cmb3.getValue() == "square kilimeter") {

				double value = Double.parseDouble(txt.getText());

				value = value * 1550000000;
				txt2.setText(string_format(value));

			}

			else if (cmb3.getValue() == "square inches") {
				txt2.setText(String.valueOf(txt.getText()));

			} else if (cmb3.getValue() == "square yards") {
				double value = Double.parseDouble(txt.getText());

				value = value * 0.00077160d;
				txt2.setText(string_format(value));

			} else if (cmb3.getValue() == "Acres") {
				double value = Double.parseDouble(txt.getText());

				value = value * 1.59422506961438e-07D;
				txt2.setText(string_format(value));

			} else if (cmb3.getValue() == "square miles") {
				double value = Double.parseDouble(txt.getText());
				value = value * 2.49097669546596e-10D;
				txt2.setText(string_format(value));
			}
			break;

		// square inches
		case "square yards":
			if (cmb3.getValue() == "square millimeters") {
				double value = Double.parseDouble(txt.getText());
				value = value / 1.19599e-06;

				txt2.setText(string_format(value));
			} else if (cmb3.getValue() == "square centimeters") {
				double value = Double.parseDouble(txt.getText());
				value = value / 0.00011960;
				txt2.setText(string_format(value));

			} else if (cmb3.getValue() == "square meters") {

				double value = Double.parseDouble(txt.getText());
				value = value / 1.1960;
				txt2.setText(string_format(value));
			} else if (cmb3.getValue() == "Hacters") {

				double value = Double.parseDouble(txt.getText());
				value = value / 11960;
				txt2.setText(string_format(value));

			} else if (cmb3.getValue() == "square kilimeter") {

				double value = Double.parseDouble(txt.getText());

				value = value / 1196000;
				txt2.setText(string_format(value));

			}

			else if (cmb3.getValue() == "square inches") {
				double value = Double.parseDouble(txt.getText());

				value = value * 1296.0;
				txt2.setText(string_format(value));

			} else if (cmb3.getValue() == "square yards") {
				txt2.setText(String.valueOf(txt.getText()));

			} else if (cmb3.getValue() == "Acres") {
				double value = Double.parseDouble(txt.getText());

				value = value * 0.00020661D;
				txt2.setText(string_format(value));

			} else if (cmb3.getValue() == "square miles") {
				double value = Double.parseDouble(txt.getText());
				value = value * 3.22830592229032e-07D;
				txt2.setText(string_format(value));
			}
			break;

		// Acres
		case "Acres":
			if (cmb3.getValue() == "square millimeters") {
				double value = Double.parseDouble(txt.getText());
				value = value / 2.4710538e-10;

				txt2.setText(string_format(value));
			} else if (cmb3.getValue() == "square centimeters") {
				double value = Double.parseDouble(txt.getText());
				value = value / 2.4710538e-08;
				txt2.setText(string_format(value));

			} else if (cmb3.getValue() == "square meters") {

				double value = Double.parseDouble(txt.getText());
				value = value / 0.00024711;
				txt2.setText(string_format(value));
			} else if (cmb3.getValue() == "Hacters") {

				double value = Double.parseDouble(txt.getText());
				value = value / 2.4711;
				txt2.setText(string_format(value));
			} else if (cmb3.getValue() == "square kilimeter") {
				double value = Double.parseDouble(txt.getText());

				value = value / 247.11;
				txt2.setText(string_format(value));
			}

			else if (cmb3.getValue() == "square inches") {
				double value = Double.parseDouble(txt.getText());

				value = value * 6272600;
				txt2.setText(string_format(value));
			} else if (cmb3.getValue() == "square yards") {
				double value = Double.parseDouble(txt.getText());

				value = value * 4840.0;
				txt2.setText(string_format(value));
			} else if (cmb3.getValue() == "Acres") {

				txt2.setText(String.valueOf(txt.getText()));

			} else if (cmb3.getValue() == "square miles") {
				double value = Double.parseDouble(txt.getText());
				value = value * 0.0015625D;
				txt2.setText(string_format(value));
			}
			break;

		}
    	   
       }

       public static void weight(){
    	   switch (cmb2.getValue()) {
    	   
   		case "milligrams":
   			if (cmb3.getValue() == "milligrams") {
   				txt2.setText(txt.getText());
   			} else if (cmb3.getValue() == "centigrams") {
   				double value = Double.parseDouble(txt.getText());
   				value = value /10;
   				txt2.setText(string_format(value));
   				 
   			} else if (cmb3.getValue() == "Grams") {
   				double value = Double.parseDouble(txt.getText());
   				value = value / 1000;
   				txt2.setText(string_format(value));
   			} else if (cmb3.getValue() == "Kilo grams") {
   				double value = Double.parseDouble(txt.getText());
   				value = value / 1000000;
   				txt2.setText(string_format(value));
   			} else if (cmb3.getValue() == "pounds") {
   				double value = Double.parseDouble(txt.getText());
   				value = value * 2.2046228e-06;
   				txt2.setText(string_format(value));
   			}
   			break;
   		case "centigrams":
   			if (cmb3.getValue() == "milligrams") {
   				double value = Double.parseDouble(txt.getText());
   				value = value *10;
   				txt2.setText(string_format(value));
   			} else if (cmb3.getValue() == "centigrams") {
   				txt2.setText(txt.getText());
   				 
   			} else if (cmb3.getValue() == "Grams") {
   				double value = Double.parseDouble(txt.getText());
   				value = value / 100;
   				txt2.setText(string_format(value));
   			} else if (cmb3.getValue() == "Kilo grams") {
   				double value = Double.parseDouble(txt.getText());
   				value = value / 100000;
   				txt2.setText(string_format(value));
   			} else if (cmb3.getValue() == "pounds") {
   				double value = Double.parseDouble(txt.getText());
   				value = value / 45359.237;
   				txt2.setText(string_format(value));
   			}
   			break;
   			
   		case "Kilo grams":
   			if (cmb3.getValue() == "milligrams") {
   				double value = Double.parseDouble(txt.getText());
   				value = value *1000000;
   				txt2.setText(string_format(value));
   			} else if (cmb3.getValue() == "centigrams") {
   				double value = Double.parseDouble(txt.getText());
   				value = value *100000;
   				txt2.setText(string_format(value));
   				 
   			} else if (cmb3.getValue() == "Grams") {
   				double value = Double.parseDouble(txt.getText());
   				value = value * 1000;
   				txt2.setText(string_format(value));
   			} else if (cmb3.getValue() == "Kilo grams") {
   				txt2.setText(txt.getText());
   			} else if (cmb3.getValue() == "pounds") {
   				double value = Double.parseDouble(txt.getText());
   				value = value * 2.2046;
   				txt2.setText(string_format(value));
   			}
   			break;
   			
   		case "Grams":
   			if (cmb3.getValue() == "milligrams") {
   				double value = Double.parseDouble(txt.getText());
   				value = value *1000;
   				txt2.setText(string_format(value));
   			} else if (cmb3.getValue() == "centigrams") {
   				double value = Double.parseDouble(txt.getText());
   				value = value *100;
   				txt2.setText(string_format(value));
   				 
   			} else if (cmb3.getValue() == "Grams") {
   				txt2.setText(txt.getText());

   				
   			} else if (cmb3.getValue() == "Kilo grams") {
   				double value = Double.parseDouble(txt.getText());
   				value = value /1000;
   				txt2.setText(string_format(value));
   			} else if (cmb3.getValue() == "pounds") {
   				double value = Double.parseDouble(txt.getText());
   				value = value *0.0022046;
   				txt2.setText(string_format(value));
   			}
   			break;
   			
   		case "pounds":
   			if (cmb3.getValue() == "milligrams") {
   				double value = Double.parseDouble(txt.getText());
   				value = value /2.2046228e-06;
   				txt2.setText(string_format(value));
   			} else if (cmb3.getValue() == "centigrams") {
   				double value = Double.parseDouble(txt.getText());
   				value = value *45359.237;
   				txt2.setText(string_format(value));
   				 
   			} else if (cmb3.getValue() == "Grams") {
   				txt2.setText(txt.getText());
   				double value = Double.parseDouble(txt.getText());
   				value = value /0.0022046;
   				txt2.setText(string_format(value));
   				
   			} else if (cmb3.getValue() == "Kilo grams") {
   				double value = Double.parseDouble(txt.getText());
   				value = value /2.2046;
   				txt2.setText(string_format(value));
   			} else if (cmb3.getValue() == "pounds") {
   				txt2.setText(txt.getText());
   			}
   			break;
    	   }
       }
       public static void tempture(){
    	   //"celsius", "fahrenheit", "kelvin"
    	   
    	   switch (cmb2.getValue()) {
    	   
      		case "celsius":
      			if (cmb3.getValue() == "celsius") {
      				txt2.setText(txt.getText());
      			} else if (cmb3.getValue() == "fahrenheit") {
      				double value = Double.parseDouble(txt.getText());
      				value =( value*1.8 )+32;
      				txt2.setText(string_format(value));
      				 
      			} else if (cmb3.getValue() == "kelvin") {
      				double value = Double.parseDouble(txt.getText());
      				value = value +  273.15;
      				txt2.setText(string_format(value));
      			}
      			break;
      		case "fahrenheit":
      			if (cmb3.getValue() == "celsius") {
      				double value = Double.parseDouble(txt.getText());
      				value =( value-32 )/1.8;
      				txt2.setText(string_format(value));
      			} else if (cmb3.getValue() == "fahrenheit") {
      				txt2.setText(txt.getText());
      			} else if (cmb3.getValue() == "kelvin") {
      				double value = Double.parseDouble(txt.getText());
         				value = ( (value-32)*(0.55555555555555555555555555555556))+ 273.15;
      				txt2.setText(string_format(value));
      			}
      			break;
      		case "kelvin":
      			if (cmb3.getValue() == "celsius") {
      				double value = Double.parseDouble(txt.getText());
      				value =  value-273.15;
      				txt2.setText(string_format(value));
      			} else if (cmb3.getValue() == "fahrenheit") {
      				double value = Double.parseDouble(txt.getText());
     				value =(value*1.8)- 459.67;
  				txt2.setText(string_format(value));
      			} else if (cmb3.getValue() == "kelvin") {
      				
      				txt2.setText(txt.getText());
      			}
      			break;
      			}
       }
       public static void  energy(){
    	//"Electorn Volts", "joules", "kilojoules" };
    	   switch (cmb2.getValue()) {
    	   
      		case "Electorn Volts":
      			if (cmb3.getValue() == "Electorn Volts") {
      				txt2.setText(txt.getText());
      			} else if (cmb3.getValue() == "joules") {
      				double value = Double.parseDouble(txt.getText());
      				value =(value/1.602176565e-19 );
      				txt2.setText(string_format(value));
      				 
      			} else if (cmb3.getValue() == "kilojoules") {
      				double value = Double.parseDouble(txt.getText());
      				value = value/1.602176565e-22;
      				txt2.setText(string_format(value));
      			}
      			break;
      		case "joules":
      			if (cmb3.getValue() == "Electorn Volts") {
      				double value = Double.parseDouble(txt.getText());
      				value =(value*1.602176565e-19 );
      				txt2.setText(string_format(value));
      				} else if (cmb3.getValue() == "joules") {
      				txt2.setText(txt.getText());
      				 
      			} else if (cmb3.getValue() == "kilojoules") {
      				double value = Double.parseDouble(txt.getText());
      				value = value*1.602176565e-22;
      				txt2.setText(string_format(value));
      			}
      			break;
       }}

}   
