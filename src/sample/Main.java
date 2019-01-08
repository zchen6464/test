package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        Button start = new Button("Press to Start");

        EventHandler<ActionEvent> gameStart = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                for(int i = 0; i < 5; i ++)
                {
                    int num = (int)(Math.random()*3);
                    buttonLight(num,primaryStage);
                }
            }
        };

        start.setOnAction(gameStart);
        Pane main = new Pane();
        main.getChildren().add(start);
        Scene primary = new Scene(main,500,200);
        primaryStage.setScene(primary);
        primaryStage.show();
    }

    public void buttonLight(int num, Stage primaryStage) {
        Button blue = new Button("Blue");
        Button green = new Button("Green");
        Button yellow = new Button("Yellow");
        Button red = new Button("Red");
        Button submit = new Button("Submit");
        if (num == 0) {
            blue.setStyle("-fx-background-color: blue");
        } else if (num == 1) {
            green.setStyle("-fx-background-color: green");
        } else if (num == 2) {
            yellow.setStyle("-fx-background-color: yellow");
        } else if (num == 3) {
            red.setStyle("-fx-background-color: red");
        }

        EventHandler<ActionEvent> setColor = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                reset(primaryStage);
            }
        };
        red.setOnAction(setColor);
        yellow.setOnAction(setColor);
        green.setOnAction(setColor);
        blue.setOnAction(setColor);

        Pane game = new Pane();
        HBox hitBox = new HBox(red, yellow, green, blue, submit);
        game.getChildren().add(hitBox);
        Scene secondary = new Scene(game, 500, 200);
        primaryStage.setScene(secondary);
        primaryStage.show();
        int x = (int)(System.currentTimeMillis() x+500);
        int y = 0;
        while (y != x)
        {
            y = (int)System.currentTimeMillis();
        }
        System.out.print(System.currentTimeMillis());
        reset(primaryStage);
    }

    public void reset(Stage primaryStage)
    {
        Button blue = new Button("Blue");
        Button green = new Button("Green");
        Button yellow = new Button("Yellow");
        Button red = new Button("Red");
        Button submit = new Button("Submit");

        red.setStyle("-fx-background-color: white");
        yellow.setStyle("-fx-background-color: white");
        green.setStyle("-fx-background-color: white");
        blue.setStyle("-fx-background-color: white");
        submit.setStyle("-fx-background-color: white");

        Pane game = new Pane();
        HBox hitBox = new HBox(red,yellow,green,blue,submit);
        game.getChildren().add(hitBox);
        Scene secondary = new Scene(game,500,200);
        primaryStage.setScene(secondary);
        primaryStage.show(); 
        
        int x = (int)(System.currentTimeMillis() x+500);
        int y = 0;
        while (y != x)
        {
            y = (int)System.currentTimeMillis();
        }
        System.out.print(System.currentTimeMillis());

    }

    public static void main(String[] args) {
        launch(args);
    }
}
