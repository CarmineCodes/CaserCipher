/*
Carmine Attanasio
Caser Cipher GUI
*/
package caeser.cipher;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class CaeserCipher extends Application {
    
    
    //declaration of controls
   TextField tfPlainTxt = new TextField();
   TextField tfShift = new TextField();
   
   //button to encrypt text
    private Button btnEncrypt;
    
    //Labels for app
    private Label lblHeader;
    private Label lblPlaintxt;
    private Label lblencryptedtxt;
    private Label lblencdesc;
    private Label lblDescription;
             Label lblShift;
    private Label lblShiftVal;
    private Label lblShiftValDesc;

        
    //vbox for layout of items
     private VBox vBoxInput;
     private VBox vBoxOutput;
    
   
    
    //creates JavaFX
    @Override
    public void start(Stage primaryStage) {
       
        //header to describe function of program to user
        lblHeader = new Label("Encrypt your text using the caeser cipher");
        lblHeader.setMinWidth(1000);
        lblHeader.setAlignment(Pos.CENTER);
        lblHeader.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 28px; -fx-text-fill: white; -fx-background-color: slateblue; -fx-font-weight: bold;");
    
        //initiates label for shift key
        lblShift = new Label("Enter a integer for the key of the cipher");
        lblShift.setMinWidth(25);
        lblShift.setAlignment(Pos.CENTER);
        lblShift.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 20px; -fx-text-fill: black; -fx-background-color:#FFF8DC); -fx-font-weight: bold;");

        //initiates label to display shift key value
        String key = tfShift.getText();
        lblShiftVal = new Label(key);
        lblShiftVal.setMinWidth(25);
        lblShiftVal.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 20px; -fx-text-fill: black; -fx-background-color:#FFF8DC); -fx-font-weight: bold;");

        //initiates label to display shift key value label
        lblShiftValDesc = new Label("Shift Value: ");
        lblShiftValDesc.setMinWidth(25);
        lblShiftValDesc.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 20px; -fx-text-fill: black; -fx-background-color:#FFF8DC); -fx-font-weight: bold;");
        
        //initiates label for encrypted text
        lblencdesc = new Label("Here is your encrypted text:");
        lblencdesc.setMinWidth(25);
        lblencdesc.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 20px; -fx-text-fill: black; -fx-background-color:#FFF8DC); -fx-font-weight: bold;");
        
        lblencryptedtxt = new Label(" ");
        lblencryptedtxt.setMinWidth(100);
        
        //initiates labels
         lblPlaintxt= new Label ("Enter plain text to be encrypted");
         lblPlaintxt.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 20px; -fx-text-fill: black; -fx-background-color:#FFF8DC); -fx-font-weight: bold;");
         
         lblDescription = new Label("Plain text is encrypted using caser cipher and shift key input");
         
        //creates encrypt button
        btnEncrypt = new Button("Encrypt Text");
        btnEncrypt.setStyle("-fx-text-fill: white; -fx-background-color: tan; -fx-font-weight: bold;");
        btnEncrypt.setOnAction( e -> encryptText(e) );

        //sizing for text fields
        tfPlainTxt.setPrefWidth(300);
        tfShift.setPrefWidth(25);
    
        //makes vbox for input
        vBoxInput = new VBox(30,lblPlaintxt, tfPlainTxt, lblShift ,tfShift, btnEncrypt);
        vBoxInput.setPrefWidth(450);
        
        //create vbox for results
        vBoxOutput = new VBox(50,lblDescription,lblShiftValDesc, lblShiftVal,lblencdesc,lblencryptedtxt);
        vBoxOutput.setPrefWidth(400);
        vBoxOutput.setPrefHeight(500);
        vBoxOutput.setPadding( new Insets(10) );
        vBoxOutput.setStyle("-fx-background-color: lightblue; -fx-border-color: black; -fx-border-radius: 10;");
        
        GridPane grid = new GridPane();

        grid.addRow(0, lblHeader);
        GridPane.setColumnSpan(lblHeader, 2);
        GridPane.setHalignment(lblHeader, HPos.CENTER);
        
        grid.addRow(1, vBoxInput, vBoxOutput);
        
        Scene scene = new Scene(grid, 1000, 500);

        primaryStage.setTitle("Caeser Cipher");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    
    }
    
    /*
    event handler that uses user input to encrypt text
    uses user input of plain text and shift key to output encrypted text
    */
    public void encryptText(ActionEvent e)
    {
       String plainText=tfPlainTxt.getText();
       String key=tfShift.getText();
       String encText="";
       int keyInt =Integer.parseInt(key);
       char conv ='a';
       
       lblShiftVal.setText(key);
        char[] inputConv = plainText.toCharArray(); //converts input string to char array
        
        for(char  c : inputConv) //c is key for shifting
        {
            c += keyInt;
            
            conv=c;
            encText+=c;
            
               
          
        }
          
        lblencryptedtxt.setText(encText);

        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
