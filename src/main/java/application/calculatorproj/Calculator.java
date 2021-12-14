package application.calculatorproj;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.input.InputEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.util.Objects;
import java.lang.Math.*;
import java.lang.Float;


public class Calculator extends Application {

    private float total = 0;
    boolean afterSymbol = false;
    String binary;
    float sum = 0;
    float fnum = 0;
    float lnum = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gridPane = new GridPane();
        TextField textfield = new TextField();

        Scene scene = new Scene(gridPane, 370, 60);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();

        scene.getStylesheets().add( getClass().getResource("CalcDesign.css").toExternalForm());

        Button number0 = new Button();
        Button number1 = new Button();
        Button number2 = new Button();
        Button number3 = new Button();
        Button number4 = new Button();
        Button number5 = new Button();
        Button number6 = new Button();
        Button number7 = new Button();
        Button number8 = new Button();
        Button number9 = new Button();
        Button plus = new Button();
        Button minus = new Button();
        Button times = new Button();
        Button divide = new Button();
        Button power = new Button();
        Button negation = new Button();
        Button square = new Button();
        Button root = new Button();
        Button equals = new Button();
        Button clear = new Button();
        Button clear_entry = new Button();
        Button decimal = new Button();

        textfield.getStyleClass().add("gray");

        number0.getStyleClass().add( "dark-blue2" );
        number1.getStyleClass().add( "dark-blue" );
        number2.getStyleClass().add( "dark-blue" );
        number3.getStyleClass().add( "dark-blue" );
        number4.getStyleClass().add( "dark-blue" );
        number5.getStyleClass().add( "dark-blue" );
        number6.getStyleClass().add( "dark-blue" );
        number7.getStyleClass().add( "dark-blue" );
        number8.getStyleClass().add( "dark-blue" );
        number9.getStyleClass().add( "dark-blue" );
        plus.getStyleClass().add( "dark-blue" );
        minus.getStyleClass().add( "dark-blue" );
        times.getStyleClass().add( "dark-blue" );
        divide.getStyleClass().add( "dark-blue" );
        power.getStyleClass().add( "dark-blue" );
        negation.getStyleClass().add( "dark-blue" );
        square.getStyleClass().add( "dark-blue" );
        root.getStyleClass().add( "dark-blue" );
        equals.getStyleClass().add( "dark-blue" );
        clear.getStyleClass().add( "dark-blue" );
        clear_entry.getStyleClass().add( "dark-blue" );
        decimal.getStyleClass().add( "dark-blue" );




        Slider slider = new Slider();
        slider.setMaxWidth(100);

        number0.setPadding( new Insets(2,40,2,2) );
        //number1.setHgap( 20 );

        number0.setText("0");
        number1.setText("1");
        number2.setText("2");
        number3.setText("3");
        number4.setText("4");
        number5.setText("5");
        number6.setText("6");
        number7.setText("7");
        number8.setText("8");
        number9.setText("9");
        plus.setText("+");
        minus.setText("- ");
        times.setText("* ");
        divide.setText("/ ");
        power.setText("^");
        negation.setText("+-");
        square.setText("^2");
        root.setText("sqrt");
        equals.setText("=");
        clear.setText("C");
        clear_entry.setText("CE");
        decimal.setText(". ");


        gridPane.add( textfield , 0 , 0 , 5 , 1 );

        gridPane.add(clear, 0 , 1 , 1 , 1);
        gridPane.add(clear_entry, 1, 1, 2, 1);
        gridPane.add(negation, 2, 1, 2, 1);
        gridPane.add(divide, 3, 1, 1, 1);
        gridPane.add(number1, 0, 2, 1, 1);
        gridPane.add(number2, 1, 2, 1, 1);
        gridPane.add(number3, 2, 2, 1, 1);
        gridPane.add(times, 3, 2, 1, 1);
        gridPane.add(power, 4, 2, 1, 1);
        gridPane.add(number4, 0, 3, 1, 1);
        gridPane.add(number5, 1, 3, 1, 1);
        gridPane.add(number6, 2, 3, 1, 1);
        gridPane.add(minus, 3, 3, 1, 1);
        gridPane.add(square, 4, 3, 1, 1);
        gridPane.add(number7, 0, 4, 1, 1);
        gridPane.add(number8, 1, 4, 1, 1);
        gridPane.add(number9, 2, 4, 1, 1);
        gridPane.add(plus, 3, 4, 1, 1);
        gridPane.add(root, 4, 4, 1, 1);
        gridPane.add(number0, 0, 5, 2, 2);
        gridPane.add(decimal, 2, 5, 1, 1);
        gridPane.add(equals, 3, 5, 1, 1);
        gridPane.add(slider, 0, 7, 5, 1);


        number0.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                if(afterSymbol) textfield.setText("");
                textfield.setText( textfield.getText() + number0.getText() );
                total = Float.parseFloat(textfield.getText());
                afterSymbol = false;

            }
        });
        number1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                if(afterSymbol) textfield.setText("");
                textfield.setText( textfield.getText() + number1.getText() );
                total = Float.parseFloat(textfield.getText());
                afterSymbol = false;

            }
        });
        number2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                if(afterSymbol) textfield.setText("");
                textfield.setText( textfield.getText() + number2.getText() );
                total = Float.parseFloat(textfield.getText());
                afterSymbol = false;

            }
        });
        number3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                if(afterSymbol) textfield.setText("");
                textfield.setText( textfield.getText() + number3.getText() );
                total = Float.parseFloat(textfield.getText());
                afterSymbol = false;

            }
        });
        number4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                if(afterSymbol) textfield.setText("");
                textfield.setText( textfield.getText() + number4.getText() );
                total = Float.parseFloat(textfield.getText());
                afterSymbol = false;

            }
        });
        number5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                if(afterSymbol) textfield.setText("");
                textfield.setText( textfield.getText() + number5.getText() );
                total = Float.parseFloat(textfield.getText());
                afterSymbol = false;

            }
        });
        number6.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                if(afterSymbol) textfield.setText("");
                textfield.setText( textfield.getText() + number6.getText() );
                total = Float.parseFloat(textfield.getText());
                afterSymbol = false;

            }
        });
        number7.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                if(afterSymbol) textfield.setText("");
                textfield.setText( textfield.getText() + number7.getText() );
                total = Float.parseFloat(textfield.getText());
                afterSymbol = false;

            }
        });
        number8.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                if(afterSymbol) textfield.setText("");
                textfield.setText( textfield.getText() + number8.getText() );
                total = Float.parseFloat(textfield.getText());
                afterSymbol = false;

            }
        });
        number9.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                if(afterSymbol) textfield.setText("");
                textfield.setText( textfield.getText() + number9.getText() );
                total = Float.parseFloat(textfield.getText());
                afterSymbol = false;
            }
        });

        plus.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                textfield.setText( textfield.getText() + "+" );
                fnum = total;
                total = 0;
                binary = "+";
                afterSymbol = true;
            }
        });
        minus.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                textfield.setText( textfield.getText() + "-" );
                fnum = total;
                total = 0;
                binary = "-";
                afterSymbol = true;
            }
        });
        times.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                textfield.setText( textfield.getText() + "*" );
                fnum = total;
                total = 0;
                binary = "*";
                afterSymbol = true;
            }
        });
        divide.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                textfield.setText( textfield.getText() + "/" );
                fnum = total;
                total = 0;
                binary = "/";
                afterSymbol = true;
            }
        });
        power.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                textfield.setText( textfield.getText() + "^" );
                fnum = total;
                total = 0;
                binary = "^";
                afterSymbol = true;
            }
        });

        equals.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                lnum = total;
                if(Objects.equals(binary, "+")){
                sum = fnum + lnum;
                }
                if(Objects.equals(binary, "-")){
                    sum = fnum - lnum;
                }
                if(Objects.equals(binary, "*")){
                    sum = fnum * lnum;
                }
                if(Objects.equals(binary, "/")){
                    sum = fnum / lnum;
                }
                if(Objects.equals(binary, "^")){
                    sum = 1;
                    for(int i = 0; i < lnum; i++)
                        sum *= fnum;
                }
                total = sum;
                textfield.setText(Float.toString(sum));
                afterSymbol = true;
            }
        });

        square.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                fnum = total;
                sum = fnum * fnum;
                total = sum;
                textfield.setText( Float.toString(sum) );
                afterSymbol = true;
            }
        });
        negation.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                fnum = total;
                sum = -fnum;
                total = sum;
                textfield.setText( Float.toString(sum) );
                afterSymbol = true;
            }
        });
        root.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                fnum = total;
                double fnumd = Double.parseDouble(Float.toString(fnum));
                sum = Float.parseFloat(Double.toString(Math.pow(fnumd, .5)));
                total = sum;
                textfield.setText( Float.toString(sum) );
                afterSymbol = true;
            }
        });

        clear.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                fnum = 0;
                lnum = 0;
                total = 0;
                binary = "+";
                textfield.setText( "" );
                afterSymbol = true;
            }
        });
        clear_entry.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                lnum = 0;
                textfield.setText( "" );
                afterSymbol = true;
            }
        });

        decimal.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ){
                if(afterSymbol){
                    textfield.setText( "0." );
                }
                else {
                    textfield.setText(textfield.getText() + ".");
                }
                total = Float.parseFloat(textfield.getText());
                afterSymbol = false;
            }
        });

        ChangeListener<Object> generalListener = new ChangeListener<Object>() {
            @Override
            public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
                textfield.setText( observable.getValue().toString() );
                total = Float.parseFloat(observable.getValue().toString());
            }
        };

        slider.setMax(9);
        slider.setMin(0);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        slider.valueProperty().addListener(generalListener);

        gridPane.addEventHandler( KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
            public void handle( KeyEvent ke ) {
                switch(ke.getCode()){
                    case DIGIT0, DIGIT1, DIGIT2, DIGIT3, DIGIT4, DIGIT5, DIGIT6, DIGIT7, DIGIT8, DIGIT9:
                        if(afterSymbol) {
                            textfield.setText(ke.getText());
                            total = Float.parseFloat(textfield.getText());
                        }
                        else {
                            textfield.setText(textfield.getText() + ke.getText());
                            total = Float.parseFloat(textfield.getText());
                        }
                        afterSymbol = false;
                        break;
                    case EQUALS:
                        lnum = total;
                        if(Objects.equals(binary, "+")){
                            sum = fnum + lnum;
                        }
                        if(Objects.equals(binary, "-")){
                            sum = fnum - lnum;
                        }
                        if(Objects.equals(binary, "*")){
                            sum = fnum * lnum;
                        }
                        if(Objects.equals(binary, "/")){
                            sum = fnum / lnum;
                        }
                        if(Objects.equals(binary, "^")) {
                            sum = 1;
                            for (int i = 0; i < lnum; i++)
                                sum *= fnum;
                        }
                        total = sum;
                        textfield.setText(Float.toString(sum));
                        afterSymbol = true;
                        break;
                    case A:
                        fnum = total;
                        textfield.setText(textfield.getText() + "+");
                        binary = "+";
                        afterSymbol = true;
                        break;
                    case M:
                        fnum = total;
                        textfield.setText(textfield.getText() + "-");
                        binary = "-";
                        afterSymbol = true;
                        break;
                    case T:
                        fnum = total;
                        textfield.setText(textfield.getText() + "*");
                        binary = "*";
                        afterSymbol = true;
                        break;
                    case D:
                        fnum = total;
                        textfield.setText(textfield.getText() + "/");
                        binary = "/";
                        afterSymbol = true;
                        break;
                    case P:
                        fnum = total;
                        textfield.setText(textfield.getText() + "^");
                        binary = "^";
                        afterSymbol = true;
                        break;
                    case PERIOD:
                        if(afterSymbol){
                            textfield.setText( "0." );
                        }
                        else {
                            textfield.setText(textfield.getText() + ".");
                        }
                        total = Float.parseFloat(textfield.getText());
                        afterSymbol = false;
                }
            }
        });

        slider.getStyleClass().add( "gray" );


    }

    public static void main(String[] args){
        launch(args);
    }

}