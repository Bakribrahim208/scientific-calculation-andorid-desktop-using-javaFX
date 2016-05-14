package main.java.old;
 import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
 import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class convert_hex  {
	static String first="bakr";
	static String second="farouk";
	static String op="0";
static boolean opbool= false;
	static boolean	basebool = false;
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

		b[0].setText("And");
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

	
	public static void map(Stage primaryStage) throws Exception {
 		
		
		GridPane pane1 = new GridPane();
		Label txt = new Label("0");
		txt.setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 50));
		pane1.add(txt, 0, 0, 1, 1);
		txt.setStyle("-fx-background-color: #3a476a;-fx-text-fill: white;");

		GridPane pane2 = new GridPane();
		Label txt1 = new Label("bakr");
		txt1.setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 50));
		pane2.add(txt1, 0, 2, 1, 1);
		txt1.setStyle("-fx-text-fill: white;");
		pane2.setStyle("-fx-background-color:black  ;");

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
		ToggleButton tb3 = new ToggleButton("2");
		tb3.setToggleGroup(group);
		tb3.setPrefHeight(50);
		tb3.setPrefWidth(50);
		tb3.setOnAction(e->Base =2);

		HBox h = new HBox();
		h.getChildren().add(tb1);
		h.getChildren().add(tb2);
		h.getChildren().add(tb3);
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
         btns[5].setOnAction(e->{first="bakr";op="0";second="farouk";});
         btns[6].setOnAction(e->{if(second!="farouk"){second="farouk";}else if (op!="0"){op="0";}else first="bakr";});
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
         btns[39].setOnAction(e->{if(first!="bakr"&&op!="0"){txt.setText(conv(first, op,second));txt1.setText(HEXorOctal(conv(first, op,second),Base));first="bakr";op="0";second="farouk";}});
         btns[33].setOnAction(e->op="*");      
         btns[34].setOnAction(e->op="/");
         btns[26].setOnAction(e->op="+");
         btns[19].setOnAction(e->first=conv(first, "tows",second));
         btns[12].setOnAction(e->first=conv(first, "ROL",second));
         btns[13].setOnAction(e->first=conv(first, "ROR",second));
         btns[21].setOnAction(e->first=conv(first, "ROR",second));
         btns[22].setOnAction(e->first=conv(first, "ROL",second));
         btns[28].setOnAction(e->first=conv(first, "byte",second));
         btns[35].setOnAction(e->first=conv(first, "word",second));
         
         
     new Thread(new Runnable() {
     		 @Override
     		   public void run() {
     		 try {
     		 while (true) {
     		 Platform.runLater(new Runnable() { // Run from JavaFX GUI
     		 @Override
     		 public void run() {
     			 if(first=="bakr")
     			 {
     				opbool=true;
     			 }
     			 else if (op=="0")
     			 {
     				 opbool=false;
     				 txt.setText(first);
     				 txt1.setText(HEXorOctal(first, Base));
     			 }
     			 else if(second=="farouk")
     			 {
     				
     			 }
     			 else{ 
     				 txt.setText(second);
     				txt1.setText(HEXorOctal(second, Base));	 
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
		primaryStage.setScene(scene);
		primaryStage.setFullScreen(true);
		primaryStage.show();

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

	public static String HEXorOctal(String s, int base) {
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
		String s = HEXorOctal(s3, Base);
		String s2 = HEXorOctal(s4, Base);

		int n1 = Integer.parseInt(s);
		int n2 = Integer.parseInt(s2);
		int re = 0;

		if (op == "OR") {
			re = n1 | n2;

		} else if (op == "XOR") {
			re = n1 ^ n2;

		} else if (op == "XNOR") {
			re = ~(n1 ^ n2);

		} else if (op == "AND") {
			re = n1 & n2;

		} else if (op == "ROR") {
			char[] pp = s.toCharArray();
			s3 = "";
			for (int i = 0; i < pp.length - 1; i++) {
				s3 += pp[i];
			}

			return s3;
		} else if (op == "ROL") {
			char[] pp = s.toCharArray();
			s3 = "";
			for (int i = 1; i < pp.length; i++) {
				s3 += pp[i];
			}
			return s3;
		} else if (op == "byte") {
			char[] pp = s.toCharArray();
			s3 = "";
			for (int i = 0; i < pp.length; i++) {
				if (pp[i] == 1) {
					s3 += "0";
				} else
					s3 += "1";

			}
			return s3;

		} else if (op == "word") {
			char[] pp = s.toCharArray();
			s3 = "";
			s3 += conv(s3, "byte", s4);
			for (int i = pp.length; i < 64; i++) {
				s3 += "0";
			}
			return s3;

		} else if (op == "ones") {
			char[] pp = s.toCharArray();
			s3 = "";
			for (int i = 0; i < pp.length; i++) {
				if (pp[i] == 1) {
					s3 += "0";
				} else
					s3 += "1";

			}
			return s3;
		} else if (op == "tows") {

			s3 = conv(s3, "ones", s4);
			int x = Integer.parseInt(s3);
			x = BinaryToDecimal(x);
			x++;
			re = x;

		} else if (op == "+") {
			re = BinaryToDecimal(n1) + BinaryToDecimal(n2);
		} else if (op == "-") {
			re = BinaryToDecimal(n1) - BinaryToDecimal(n2);
		} else if (op == "*") {
			re = BinaryToDecimal(n1) * BinaryToDecimal(n2);
		} else if (op == "/") {
			try {
				re = BinaryToDecimal(n1) / BinaryToDecimal(n2);
			} catch (Exception e) {
				System.out.println("Can't divide by Zero");
			}
		}
		System.out.println(re);
		String res = Integer.toBinaryString(re);
		System.out.println(res);
		String res2 = Integer.toHexString(re);
		return res2;

	}
}