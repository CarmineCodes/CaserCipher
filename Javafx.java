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
    private Label lblDescription;

        
    //vbox for layout of items
     private VBox vBoxInput;
     private VBox vBoxOutput;
    
   
    
    //creates JavaFX
    @Override
    public void start(Stage primaryStage) {
       
        //header to describe function of program to user
        lblHeader = new Label("Encrypt your text using the caeser cipher");
        lblHeader.setMinWidth(350);
        lblHeader.setAlignment(Pos.CENTER);
        lblHeader.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 28px; -fx-text-fill: white; -fx-background-color: rgb(104, 50, 0); -fx-font-weight: bold;");
    
        //initiates labels
         lblPlaintxt= new Label ("Enter plain text to be encrypted");
         lblPlaintxt.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 14px; -fx-text-fill: black; -fx-background-color:#FFF8DC); -fx-font-weight: bold;");
         lblencryptedtxt = new Label("");
         lblDescription = new Label("Plain text is encrypted using caser cipher and shift key input");
         
         //creates encrypt button
        btnEncrypt = new Button("Encrypt Text");
        btnEncrypt.setStyle("-fx-text-fill: white; -fx-background-color: tan; -fx-font-weight: bold;");
    
        //makes vbox for input
        vBoxInput = new VBox(30,lblPlaintxt, tfPlainTxt, btnEncrypt);
        
        //create vbox for results
        vBoxOutput = new VBox(50,lblDescription, lblDescription);
        vBoxOutput.setPrefWidth(140);
        vBoxOutput.setPrefHeight(270);
        vBoxOutput.setPadding( new Insets(10) );
        vBoxOutput.setStyle("-fx-background-color: lightblue; -fx-border-color: black; -fx-border-radius: 10;");
        
        GridPane grid = new GridPane();

        grid.addRow(0, lblHeader);
        GridPane.setColumnSpan(lblHeader, 2);
        GridPane.setHalignment(lblHeader, HPos.CENTER);
        
        grid.addRow(1, vBoxInput, vBoxOutput);
        
        Scene scene = new Scene(grid, 500, 310);

        primaryStage.setTitle("Find Prime Factors");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

