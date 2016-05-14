package main.java;
 import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
 import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;

public class convert_hex  {
	static String first="bakr";
	static String second="farouk";
	static String op="0";
	static String opreation; 

static boolean opbool= false;
	static boolean	basebool = false;
	static int fontw =5;
	public static int Base = 16;

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(conv("00", "ones", "AA"));
		// sum("0011","0001");
		launch(args);

	}*/

	public static Button[] btns = new Button[40];

	public static Button[] create_btns() {
		Button[] ss = new Button[40];
		for (int i = 0; i < 40; i++) {
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

		b[0].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[1].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[7].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[8].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[12].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[13].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[14].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[15].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[19].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[20].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[21].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[22].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[28].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[39].setStyle("-fx-background-color:#3a476a; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[29].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[5].setStyle("-fx-background-color:#ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[6].setStyle("-fx-background-color:#ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[35].setStyle("-fx-background-color:#ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		
		b[33].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[34].setStyle("-fx-background-color:#ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[26].setStyle("-fx-background-color:#ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[27].setStyle("-fx-background-color:#ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");

		
		
		
		
		
		b[0].setText("And");
		b[0].setStyle("-fx-background-color: #ea711f; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: white;");
		b[1].setText("OR");
		b[2].setText("D");
		b[3].setText("E");
		b[4].setText("F");
		b[5].setText("AC");
		b[6].setText("C");
		b[7].setText("Nor");

		b[8].setText("Xor");
		b[9].setText("A");
		b[10].setText("B");
		b[11].setText("C");

		b[12].setText("ROl");
		b[13].setText("ROR");
		b[14].setText("<<");
		b[15].setText(">>");
		b[16].setText("7");
		b[17].setText("8");
		b[18].setText("9");
		b[19].setText("2's");
		b[20].setText("1's");
		b[21].setText("X<<Y");
		b[22].setText("X>>Y");

		b[23].setText("4");

		b[24].setText("5");

		b[25].setText("6");

		b[26].setText("+");
		b[27].setText("-");
		b[28].setText("shuffle byte");
		b[28].setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 15));
		b[29].setText("NULl");
		b[30].setText("1");
		b[31].setText("2");
		b[32].setText("3");
		b[33].setText("*");
		b[34].setText("/");
		b[35].setText("shuffle word");
		b[35].setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 15));
		b[36].setText("FF");
		b[37].setText("0");
		b[38].setText("00");
		b[39].setText("=");

		return b;

	}

 
	public static GridPane map() throws Exception {
 
		GridPane pane1 = new GridPane();
		 MenuBar menubar=new MenuBar();
         Menu fileMenu = new Menu("MENU");
          MenuItem standard = new MenuItem("standard");
         MenuItem scientific = new MenuItem("scientific");
         CheckMenuItem sound=new CheckMenuItem("mute sound");
         standard.setOnAction((ActionEvent E) -> {
			 
        	 form.root.getChildren().add(form.pane);
	            double width = form.root.getWidth();
	            KeyFrame start = new KeyFrame(Duration.ZERO,
	                    new KeyValue(form.pane.translateXProperty(), -width),
	                    new KeyValue(form.pane_convert_hex.translateXProperty(), 0));
	            KeyFrame end = new KeyFrame(Duration.seconds(.5),
	                    new KeyValue(form.pane.translateXProperty(), 0),
	                    new KeyValue(form.pane_convert_hex.translateXProperty(), width));
	            Timeline slide = new Timeline(start, end);
	            slide.setOnFinished(e -> form.root.getChildren().remove(form.pane_convert_hex));
	            slide.play();
			});
         scientific.setOnAction((ActionEvent E) -> {
        	 
        	 form.root.getChildren().add(form.pane1);
	            double width = form.root.getWidth();
	            KeyFrame start = new KeyFrame(Duration.ZERO,
	                    new KeyValue(form.pane1.translateXProperty(), -width),
	                    new KeyValue(form.pane_convert_hex.translateXProperty(), 0));
	            KeyFrame end = new KeyFrame(Duration.seconds(.5),
	                    new KeyValue(form.pane1.translateXProperty(), 0),
	                    new KeyValue(form.pane_convert_hex.translateXProperty(), width));
	            Timeline slide = new Timeline(start, end);
	            slide.setOnFinished(e -> form.root.getChildren().remove(form.pane_convert_hex));
	            slide.play();
			});
        /* sound.setOnAction((ActionEvent E) -> {
				if(mute_sound)
					mute_sound=false;
					else
						mute_sound=true;
					});*/
         
         
         MenuItem Converter = new MenuItem("Converter");
         Converter.setOnAction((ActionEvent E) -> {
        	 form.root.getChildren().add(form.pane_convert);
	            double width = form.root.getWidth();
	            KeyFrame start = new KeyFrame(Duration.ZERO,
	                    new KeyValue(form.pane_convert.translateXProperty(), -width),
	                    new KeyValue(form.pane_convert_hex.translateXProperty(), 0));
	            KeyFrame end = new KeyFrame(Duration.seconds(.5),
	                    new KeyValue(form.pane_convert.translateXProperty(), 0),
	                    new KeyValue(form.pane_convert_hex.translateXProperty(), width));
	            Timeline slide = new Timeline(start, end);
	            slide.setOnFinished(e -> form.root.getChildren().remove(form.pane_convert_hex));
	            slide.play();
			});
         MenuItem Converter_hex = new MenuItem("Converter_hex");
         Converter_hex.setOnAction((ActionEvent E) -> {
        	
 			});
        MenuItem exitMenuItem = new MenuItem("Exit");
        
     
         
         
         exitMenuItem.setOnAction(actionEvent ->{ Platform.exit();
         System.exit(0);
         });
         
         fileMenu.getItems().addAll(standard, scientific,
        	        new SeparatorMenuItem(),Converter,Converter_hex,sound,exitMenuItem);
      
         menubar.getMenus().addAll(fileMenu);
			pane1.add(menubar, 0, 0);
          menubar.setStyle("-fx-background-color: transparent;-fx-font-family: Baumans;-fx-font-size: 20px;-fx-text-fill: #00CCFF;");
		Label txt = new Label("0");
		//txt.setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 50));
		pane1.add(txt, 0, 1, 1, 1);
		txt.setStyle("-fx-background-color: black;-fx-text-fill: white;");

		GridPane pane2 = new GridPane();
		Label txt1 = new Label("0");
		//txt1.setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 50));
		pane2.add(txt1, 0, 2, 1, 1);
		txt1.setStyle("-fx-text-fill: white;");
		pane2.setStyle("-fx-background-color: #3a476a  ;");

		pane2.setPrefHeight(500);

		final ToggleGroup group = new ToggleGroup();

		ToggleButton tb1 = new ToggleButton("16");
		tb1.setToggleGroup(group);
		tb1.setSelected(true);
		tb1.setPrefHeight(50);
		tb1.setPrefWidth(50);
		tb1.setOnAction(e->{Base =16;
		basebool=false;});
		ToggleButton tb2 = new ToggleButton("8");
		tb2.setToggleGroup(group);
		tb2.setPrefHeight(50);
		tb2.setPrefWidth(50);
		tb2.setOnAction(e->{Base =8;basebool=true;});
		/*ToggleButton tb3 = new ToggleButton("2");
		tb3.setToggleGroup(group);
		tb3.setPrefHeight(50);
		tb3.setPrefWidth(50);
		tb3.setOnAction(e->Base =2);*/

		HBox h = new HBox();
		h.getChildren().add(tb1);
		h.getChildren().add(tb2);
	//	h.getChildren().add(tb3);
		pane2.add(h, 0, 1);
		h.setAlignment(Pos.TOP_RIGHT);
		pane1.add(pane2, 0, 5);

		/*
		 * txt.setPrefWidth(1000); txt.setPrefHeight(200);
		 */
		btns = create_btns();
		btns = text(btns);
		GridPane pane = new GridPane();
		pane1.add(pane, 0, 8);
		pane.setHgap(1);
		pane.setVgap(1);
		pane.setPadding(new Insets(1, 1, 1, 1));
		int count = 0;
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 7; col++) {
					pane.add(btns[count], col, row);
				count++;
			}
		}
		count++;
		pane.add(btns[28], 0, 4, 2, 1);
		btns[28].setPrefWidth(btns[28].getPrefWidth() * 2);
		for (int row = 1; row < 7; row++) {
			if (count == 29) {

			} else
				pane.add(btns[count], row, 4);
			count++;
		}
		pane.add(btns[35], 0, 5, 2, 1);
		btns[35].setPrefWidth(btns[35].getPrefWidth() * 2);
		count++;
		for (int row = 2; row < 5; row++) {
			pane.add(btns[count], row, 5);
			count++;
		}
		pane.add(btns[39], 5, 5, 2, 1);
		btns[39].setPrefWidth((btns[39].getPrefWidth() * 2));

		Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
	//	Scene scene = new Scene(pane1, 100, 100);
		 Scene scene = new Scene(pane1, screenBounds.getWidth(),
		screenBounds.getHeight());
		pane.prefHeightProperty().bind(scene.heightProperty());
		for (int i = 0; i < 40; i++) {
			btns[i].prefHeightProperty().bind(scene.heightProperty().divide(6));
			btns[i].prefWidthProperty().bind(scene.widthProperty().divide(4));
		}
		btns[28].prefWidthProperty().bind(scene.widthProperty().divide(4).add(40));
		btns[35].prefWidthProperty().bind(scene.widthProperty().divide(4).add(40));
		btns[39].prefWidthProperty().bind(scene.widthProperty().divide(4).add(40));
		
		
        btns[0].setOnAction(e->op="AND");
        btns[1].setOnAction(e->op="OR");
        btns[2].setOnAction(e->{if(op=="0"){if(first=="bakr"){first="";}first+="D";}else {if(second=="farouk"){second="";}second+="D";}});
        btns[3].setOnAction(e->{if(op=="0"){if(first=="bakr"){first="";}first+="E";}else {if(second=="farouk"){second="";}second+="E";}});
        btns[4].setOnAction(e->{if(op=="0"){if(first=="bakr"){first="";}first+="F";}else {if(second=="farouk"){second="";}second+="F";}});
        btns[5].setOnAction(e->{txt.setText("");txt1.setText("");first="bakr";op="0";second="farouk";});
        btns[6].setOnAction(e->{if(second!="farouk"){second="farouk";txt1.setText(hextoocttobin(first, Base)+op);}else if (op!="0"){op="0";hextoocttobin(first, Base);}else first="bakr";txt.setText("");txt1.setText("");});
        btns[7].setOnAction(e->op="XNOR");
        btns[8].setOnAction(e->op="XOR");
        btns[9].setOnAction(e->{if(op=="0"){if(first=="bakr"){first="";}first+="A";}else {if(second=="farouk"){second="";}second+="A";}});
        btns[10].setOnAction(e->{if(op=="0"){if(first=="bakr"){first="";}first+="B";}else {if(second=="farouk"){second="";}second+="B";}});
        btns[11].setOnAction(e->{if(op=="0"){if(first=="bakr"){first="";}first+="C";}else {if(second=="farouk"){second="";}second+="C";}});
        btns[16].setOnAction(e->{if(op=="0"){if(first=="bakr"){first="";}first+="7";}else {if(second=="farouk"){second="";}second+="7";}});
        btns[17].setOnAction(e->{if(op=="0"){if(first=="bakr"){first="";}first+="8";}else {if(second=="farouk"){second="";}second+="8";}});
        btns[18].setOnAction(e->{if(op=="0"){if(first=="bakr"){first="";}first+="9";}else {if(second=="farouk"){second="";}second+="9";}});
        btns[23].setOnAction(e->{if(op=="0"){if(first=="bakr"){first="";}first+="4";}else {if(second=="farouk"){second="";}second+="4";}});
        btns[24].setOnAction(e->{if(op=="0"){if(first=="bakr"){first="";}first+="5";}else {if(second=="farouk"){second="";}second+="5";}});
        btns[25].setOnAction(e->{if(op=="0"){if(first=="bakr"){first="";}first+="6";}else {if(second=="farouk"){second="";}second+="6";}});
        btns[30].setOnAction(e->{if(op=="0"){if(first=="bakr"){first="";}first+="1";}else {if(second=="farouk"){second="";}second+="1";}});
        btns[31].setOnAction(e->{if(op=="0"){if(first=="bakr"){first="";}first+="2";}else {if(second=="farouk"){second="";}second+="2";}});
        btns[32].setOnAction(e->{if(op=="0"){if(first=="bakr"){first="";}first+="3";}else {if(second=="farouk"){second="";}second+="3";}});
        btns[36].setOnAction(e->{if(op=="0"){if(first=="bakr"){first="";}first+="FF";}else {if(second=="farouk"){second="";}second+="FF";}});
        btns[37].setOnAction(e->{if(op=="0"){if(first=="bakr"){first="";}first+="0";}else {if(second=="farouk"){second="";}second+="0";}});
        btns[38].setOnAction(e->{if(op=="0"){if(first=="bakr"){first="";}first+="00";}else {if(second=="farouk"){second="";}second+="00";}});
        btns[39].setOnAction(e->{if(first!="bakr"&&op!="0"){txt.setText(conv(first, op,second));txt1.setText(hextoocttobin(conv(first, op,second),Base));first="bakr";op="0";second="farouk";}});
        btns[33].setOnAction(e->op="*");      
        btns[27].setOnAction(e->op="-");      
        btns[34].setOnAction(e->op="/");
        btns[26].setOnAction(e->op="+");
        btns[19].setOnAction(e->first=conv(first, "tows",""));
        btns[12].setOnAction(e->first=conv(first, "ROL",""));
        btns[14].setOnAction(e->first=conv(first, "ROL",""));
        btns[13].setOnAction(e->{first=conv(first, "ROR","");});
        btns[15].setOnAction(e->{first=conv(first, "ROR","");});
        btns[21].setOnAction(e->first=conv(first, "ROR",""));
        btns[22].setOnAction(e->first=conv(first, "ROL",""));
        btns[28].setOnAction(e->first=conv(first, "byte",""));
        btns[35].setOnAction(e->first=conv(first, "word",""));
        btns[20].setOnAction(e->first=conv(first, "ones",""));

         
         
     new Thread(new Runnable() {
     		 @Override
     		   public void run() {
     		 try {
     		 while (true) {
     		 Platform.runLater(new Runnable() { // Run from JavaFX GUI
     		 @Override
     		 public void run() {
     			 if(fontw==txt1.getText().length()-10)
     			 {
     				 fontw=txt1.getText().length();
     			 }
     			 else
     				 fontw=5;
     			txt.setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 50-(txt.getText().length()/fontw))); 
     			txt1.setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 50-(txt1.getText().length()/fontw))); 
     			if(first=="bakr")
     			 {
     				opbool=true;
     			 }
     			 else if (op=="0")
     			 {
     				 opbool=false;
     				 opreation=first;
     				 txt.setText(opreation);
     				 txt1.setText(hextoocttobin(first, Base)+op);
     			 }
     			 else if(second=="farouk")
     			 {
     				 opreation=first+op;
     				txt.setText(opreation);
     				txt1.setText(hextoocttobin(first, Base)+op);
     			 }
     			 else{ 
     				 opreation=first+op+second;
     				 txt.setText(opreation);
     				txt1.setText(hextoocttobin(first, Base)+op+hextoocttobin(second, Base));	 
     			 }
     			 btns[2].setDisable(basebool);
     			 btns[3].setDisable(basebool);
     			 btns[4].setDisable(basebool);
     			 btns[9].setDisable(basebool);
     			 btns[10].setDisable(basebool);
     			 btns[11].setDisable(basebool);
     			 btns[17].setDisable(basebool);
     			 btns[18].setDisable(basebool);
     			 btns[36].setDisable(basebool);
     			 btns[0].setDisable(opbool);
     			 btns[1].setDisable(opbool);
     			 btns[7].setDisable(opbool);
     			 btns[8].setDisable(opbool);
     			 btns[12].setDisable(opbool);
     			 btns[13].setDisable(opbool);
     			 btns[14].setDisable(opbool);
     			 btns[15].setDisable(opbool);
     			 btns[19].setDisable(opbool);
     			 btns[20].setDisable(opbool);
     			 btns[21].setDisable(opbool);
     			 btns[22].setDisable(opbool);
     			 btns[26].setDisable(opbool);
     			 btns[27].setDisable(opbool);
     			 btns[28].setDisable(opbool);
     			 btns[33].setDisable(opbool);
     			 btns[34].setDisable(opbool);
     			 btns[35].setDisable(opbool);
     			 btns[39].setDisable(opbool);
     		
     		 }
     		 });
     		 Thread.sleep(200);
     		 }
     		 }
     		 catch (InterruptedException ex) {
     		 }
     		 }
     		 }).start();

         

		txt.prefHeightProperty().bind(scene.heightProperty().divide(5));
		txt.prefWidthProperty().bind(scene.widthProperty());
		txt1.prefHeightProperty().bind(scene.heightProperty().divide(5));
		txt1.prefWidthProperty().bind(scene.widthProperty());
		// Scene scene = new Scene(pane1,1000,1000 );
		return pane1;
		 
	}

	private static String[] staticLookup = new String[] { "0000", "0001", "0010", "0011", "0100", "0101", "0110",
			"0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" };

	public static String HexToBinary(char Hex) {
		return staticLookup[Integer.parseInt(Character.toString(Hex), 16)];
	}

	private static String[] staticLookupoc = new String[] { "000", "001", "010", "011", "100", "101", "110", "111" };

	public static String OctalToBinary(char oc) {
		return staticLookupoc[Integer.parseInt(Character.toString(oc), 8)];
	}

	public static String hextoocttobin(String s, int base) {
		char[] p = s.toCharArray();
		s = "";
		if (base == 8) {
			for (int i = 0; i < p.length; i++) {
				s += OctalToBinary(p[i]);

			}
		} else if (base == 16) {

			for (int i = 0; i < p.length; i++) {
				s += HexToBinary(p[i]);

			}
		}

		return s;

	}

	public static int BinaryToDecimal(int binaryNumber) {

		int decimal = 0;
		int p = 0;
		while (true) {
			if (binaryNumber == 0) {
				break;
			} else {
				int temp = binaryNumber % 10;
				decimal += temp * Math.pow(2, p);
				binaryNumber = binaryNumber / 10;
				p++;
			}
		}
		return decimal;
	}
	public static String conv(String s3, String op, String s4) {
		String s = hextoocttobin(s3, Base); // to binary 
		String s2="";
		Integer n2=0;
		
		if(!s4.isEmpty()) // for ROR ,ROL ,Shift ,2's,1's need one string 
		{
		s2 = hextoocttobin(s4, Base);
		n2 = Integer.parseInt(s2,2); // from binary to decimal 
	     
		}

		int n1 = Integer.parseInt(s,2); // from binary to decimal 
		
		int re = 0;

		if (op == "OR") {
			
			re = n1 | n2;

		} else if (op == "XOR") {
			n1=BinaryToDecimal(n1);
			re = n1 ^ n2;

		} else if (op == "XNOR") {
			n1=BinaryToDecimal(n1);
			re = ~(n1 ^ n2);

		} else if (op == "AND") {
			n1=BinaryToDecimal(n1);
			re = n1 & n2;

		} else if (op == "ROR") {
			
			n1=n1/2;
			s=Integer.toString(n1,2); // decimal to binary
			
			
		
		
			if(Base==8)
			{
				return Long.toOctalString(Long.parseLong(s,2));// to octal 
				}
			
			
			else 
				return Long.toHexString(Long.parseLong(s,2)); // to hex 
			
			
			
			
			
			
		} else if (op == "ROL") {
			n1=n1*2;
			s=Integer.toString(n1,2); // decimal to binary
			if(Base==8)
			{
				return Long.toOctalString(Long.parseLong(s,2));// to octal 
				}
			else 
				return Long.toHexString(Long.parseLong(s,2)); // to hex
			
		} 
		else if (op == "byte") {
			
			char[] pp = s.toCharArray();
			s3 = "";
			for (int i = 0; i < pp.length; i++) {
				if (pp[i] == '1') {
					s3 += "0";
				} else
					s3 += "1";

			}
		
			if(Base==8)
			{
				return Long.toOctalString(Long.parseLong(s3,2));// to octal 
				}
			else 
				return Long.toHexString(Long.parseLong(s3,2)); // to hex
			

		} else if (op == "word") {
			char[] pp = s.toCharArray();
			s3 = "";
			for (int i = 0; i < pp.length; i++) {
				if (pp[i] == '1') {
					s3 += "0";
				} else
					s3 += "1";

			}
			for (int i = pp.length; i < 30; i++) {
				s3+="0";

			}

			if(Base==8)
			{
				return Long.toOctalString(Long.parseLong(s3,2));// to octal 
				}
			else 
				return Long.toHexString(Long.parseLong(s3,2)); // to hex
		
		} else if (op == "ones") {
			char[] pp = s.toCharArray();
			s3 = "";
			for (int i = 0; i < pp.length; i++) {
				if (pp[i] == '1') {
					s3 += "0";
				} else
					s3 += "1";

			}
			n1 = Integer.parseInt(s3);
			n1=	BinaryToDecimal(n1);
				String S;
				if(Base==16)
				{ 
					S= Integer.toHexString(n1);}
				else 
					S = Integer.toOctalString(n1);
				
				return S;
			
		} else if (op == "tows") {

			char[] pp = s.toCharArray();
			s3 = "";
			for (int i = 0; i < pp.length; i++) {
				if (pp[i] == '1') {
					s3 += "0";
				} else
					s3 += "1";
				

			}
			
			
			n1 = Integer.parseInt(s3);
			n1=	BinaryToDecimal(n1);
			n1++;
				String S;
				if(Base==16)
				{ S= Integer.toHexString(n1);}
				else 
					S = Integer.toOctalString(n1);
				
				return S;

		} else if (op == "+") {
			re = n1 + n2;
		} else if (op == "-") {
			re = n1 - n2;
		} else if (op == "*") {
			re = n1 * n2;
		} else if (op == "/") {
			try {
				re = n1 / n2;
			} catch (Exception e) {
				
			/*	Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Lazy Team");
				alert.setHeaderText("Can't divide by Zero");
			    
				alert.showAndWait().ifPresent(rs -> {
				    if (rs == ButtonType.OK) {
				    	
				      //  System.out.println("Pressed OK.");
				       
				    }
				});*/
				//System.out.println("Can't divide by Zero");
			}
		}
		//System.out.println(re);
	   //	String res = Integer.toBinaryString(re);
		//System.out.println(res);
		
		if(Base==16)
			
		{
			return Integer.toHexString(re);
			
		}
		
		return Integer.toHexString(re);
		

	}
}