/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5eassistant;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author Senhe Hao
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Stage loginStage = new Stage();
        loginStage.setTitle("Connect To A Server");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        Scene scene = new Scene(grid, 300, 275);
        
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", 20));
        scenetitle.setTextAlignment(TextAlignment.CENTER);
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Label serverIp = new Label("Username");
        grid.add(serverIp, 0, 1);
        
        TextField ipBox = new TextField();
        grid.add(ipBox, 1, 1);
        
        
        Label port = new Label("Password");
        grid.add(port, 0, 2);

        TextField portBox = new TextField();
        grid.add(portBox, 1, 2);
        
        Button launch = new Button();
        launch.setText("Login");
        grid.add(launch, 0, 3, 1, 3);
        
        Button regis = new Button();
        regis.setText("Register");
        grid.add(regis, 1, 3, 2, 3);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        loginStage.setScene(scene);
        loginStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
