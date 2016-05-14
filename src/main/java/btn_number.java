package main.java;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
public class btn_number {
	
  public Button btn =new  Button();
	btn_number(){
		
	};
	
	public btn_number(String  btn_text){
		try{
		btn.setText(btn_text);
		btn.setPrefWidth(20);
		 btn.setPrefHeight  (20);
		 btn.setStyle("-fx-background-color: #ddd9de; -fx-background-radius: 30;-fx-background-insets: 0;-fx-text-fill: black;");
		 btn.setFont(Font.font("Kristen ITC", FontWeight.EXTRA_LIGHT, 20));  }
		catch(Exception ex){
			System.out.print(ex.getMessage());
		}
	}
		
	public Button get_btns(){
		return this.btn;
	}
	 
	 
	
}
