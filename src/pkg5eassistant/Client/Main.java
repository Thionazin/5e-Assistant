/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5eassistant.Client;

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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author Senhe Hao
 */
public class Main extends Application {
    
    //Overrides start method. As soon as application is launched, iniate login.
    @Override
    public void start(Stage primaryStage) {
        initiateLoginStage();
    }
    
    //Creates a small window for logging in.
    public void initiateLoginStage()
    {
        Stage loginStage = new Stage();
        loginStage.setTitle("Login");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        Scene scene = new Scene(grid, 300, 275);
        
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", 20));
        scenetitle.setTextAlignment(TextAlignment.CENTER);
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Label userLabel = new Label("Username");
        grid.add(userLabel, 0, 1);
        
        TextField userBox = new TextField();
        grid.add(userBox, 1, 1);
        
        
        Label pass = new Label("Password");
        grid.add(pass, 0, 2);

        TextField passBox = new TextField();
        grid.add(passBox, 1, 2);
        
        Button login = new Button();
        login.setText("Login");
        grid.add(login, 0, 3, 1, 3);
        
        Button regis = new Button();
        regis.setText("Switch of Register");
        grid.add(regis, 1, 3, 2, 3);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(userBox.getText().equals("") || passBox.getText().equals(""))
                {
                    actiontarget.setFill(Color.FIREBRICK);
                    actiontarget.setText("Invalid Input!");
                }
                else
                {
                    actiontarget.setText("");
                    try 
                    {
                        initiateMainScreen(userBox.getText(), passBox.getText());
                    } catch (Exception e) 
                    {
                        actiontarget.setFill(Color.FIREBRICK);
                        actiontarget.setText("Invalid Input!");
                    }
                }
            }
        });
        
        regis.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                initiateRegisterStage();
                loginStage.close();
            }
        });
        loginStage.setScene(scene);
        loginStage.show();
    }
    
    //Creates a small window for registering a new account.
    public void initiateRegisterStage()
    {
        Stage regisStage = new Stage();
        regisStage.setTitle("Register Account");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(11);
        grid.setVgap(11);
        Scene scene = new Scene(grid, 300, 275);
        
        Text scenetitle = new Text("Input Credentials");
        scenetitle.setFont(Font.font("Tahoma", 20));
        scenetitle.setTextAlignment(TextAlignment.CENTER);
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Label userLabel = new Label("Username");
        grid.add(userLabel, 0, 1);
        
        TextField userBox = new TextField();
        grid.add(userBox, 1, 1);
        
        Label pass = new Label("Password");
        grid.add(pass, 0, 2);

        TextField passBox = new TextField();
        grid.add(passBox, 1, 2);
        
        Button regis = new Button();
        regis.setText("Register");
        grid.add(regis, 0, 3, 1, 3);
        
        Button login = new Button();
        login.setText("Switch to Login");
        grid.add(login, 1, 3, 2, 3);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        regis.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(userBox.getText().equals("") || passBox.getText().equals(""))
                {
                    actiontarget.setFill(Color.FIREBRICK);
                    actiontarget.setText("Invalid Input!");
                }
                else
                {
                    actiontarget.setText("");
                    try 
                    {
                        registerCredentials(userBox.getText(), passBox.getText());
                        initiateMainScreen(userBox.getText(), passBox.getText());
                    } catch (Exception e) 
                    {
                        actiontarget.setFill(Color.FIREBRICK);
                        actiontarget.setText("Invalid Input!");
                    }
                }
            }
        });
        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                initiateLoginStage();
                regisStage.close();
            }
        });
        regisStage.setScene(scene);
        regisStage.show();
    }
    
    public void initiateMainScreen(String username, String password)
    {
        /*todo: HTTP request to fetch nessesary data for the main panel.
        No sockets required as this isn't a session yet.
        */
        
        Stage mainStage = new Stage();
        mainStage.setTitle("5e Assistant | Version 0.1");
        
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(11);
        grid.setVgap(11);
        Scene scene = new Scene(grid, 300, 275);
    }
    
    public void registerCredentials(String username, String password)
    {
        /*todo
        Implement HTTP request in order to register the credentials with the backend.
        */
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}