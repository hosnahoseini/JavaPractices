
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import javax.swing.*;

/**
 * The controller class
 *
 * @author Hosna Oyarhoseini
 * @version 1.0
 */
public class ControllerCalc {

    private Float previousData = 0F;
    private String operation = "";

    @FXML
    private TextArea displayTextArea;

    @FXML
    private Button sevenButton;

    @FXML
    private Button eightButton;

    @FXML
    private Button fourButton;

    @FXML
    private Button fiveButton;

    @FXML
    private Button oneButton;

    @FXML
    private Button twoButton;

    @FXML
    private Button dotButton;

    @FXML
    private Button zeroButton;

    @FXML
    private Button nineButton;

    @FXML
    private Button sixButton;

    @FXML
    private Button threeButton;

    @FXML
    private Button plusButton;

    @FXML
    private Button minusButton;

    @FXML
    private Button divisionButton;

    @FXML
    private Button multButton;

    @FXML
    private Button sinButton;

    @FXML
    private Button cosButton;

    @FXML
    private Button tanBottun;

    @FXML
    private Button powerButton;

    @FXML
    private Button cotButton;

    @FXML
    private Button squareButton;

    @FXML
    private Button clearEveryThingButton;

    @FXML
    private Button clearButton;

    @FXML
    private MenuItem closeItem;

    @FXML
    private MenuItem helpItem;

    /**
     * a method to show or delete numbers(handle numbers and del buttons)
     *
     * @param event event
     */
    @FXML
    void handleDisplayButton(ActionEvent event) {
        if (oneButton.equals(event.getSource()))
            displayTextArea.setText(displayTextArea.getText() + "1");
        else if(twoButton.equals(event.getSource()))
            displayTextArea.setText(displayTextArea.getText() + "2");
        else if(threeButton.equals(event.getSource()))
            displayTextArea.setText(displayTextArea.getText() + "3");
        else if(fourButton.equals(event.getSource()))
            displayTextArea.setText(displayTextArea.getText() + "4");
        else if(fiveButton.equals(event.getSource()))
            displayTextArea.setText(displayTextArea.getText() + "5");
        else if(sixButton.equals(event.getSource()))
            displayTextArea.setText(displayTextArea.getText() + "6");
        else if(sevenButton.equals(event.getSource()))
            displayTextArea.setText(displayTextArea.getText() + "7");
        else if(eightButton.equals(event.getSource()))
            displayTextArea.setText(displayTextArea.getText() + "8");
        else if(nineButton.equals(event.getSource()))
            displayTextArea.setText(displayTextArea.getText() + "9");
        else if(zeroButton.equals(event.getSource()))
            displayTextArea.setText(displayTextArea.getText() + "0");
        else if(dotButton.equals(event.getSource()))
            displayTextArea.setText(displayTextArea.getText() + ".");
        else if(clearEveryThingButton.equals(event.getSource()))
            displayTextArea.setText("");
        else if(clearButton.equals(event.getSource())){
            String previous = displayTextArea.getText();
            displayTextArea.setText(previous.substring(0, previous.length() - 1));
        }

    }

    /**
     * a method to handle two arguments operation
     *
     * @param event event
     */
    @FXML
    void handleTwoOperationButton(ActionEvent event) {
        previousData = Float.parseFloat(displayTextArea.getText());
        if(event.getSource().equals(plusButton))
            operation = "plus";
        else  if(event.getSource().equals(minusButton))
            operation = "minus";
        else  if(event.getSource().equals(multButton))
            operation = "multiply";
        else  if(event.getSource().equals(divisionButton))
            operation = "division";
        else  if(event.getSource().equals(powerButton))
            operation = "power";
        displayTextArea.setText("");

    }

    /**
     * a method to handle one argument operation
     *
     * @param event event
     */
    @FXML
    void handleOneOperationButton(ActionEvent event){
        if(event.getSource().equals(sinButton)) {
            displayTextArea.setText("sin ");
            operation = "sin";
        }
        else if(event.getSource().equals(cosButton)){
            displayTextArea.setText("cos ");
            operation = "cos";
        }
        else if(event.getSource().equals(cotButton)) {
            displayTextArea.setText("cot ");
            operation = "cot";
        }
        else if(event.getSource().equals(tanBottun)) {
            displayTextArea.setText("tan ");
            operation = "tan";
        }
        else if(event.getSource().equals(squareButton)) {
            displayTextArea.setText(displayTextArea.getText() + " ^ 2");
            operation = "square";
        }
    }

    /**
     * a methode to handle result when pressing =
     *
     * @param event event
     */
    @FXML
    void calculateResult(ActionEvent event){

        if(operation.equals("plus")){
            Float data = Float.parseFloat(displayTextArea.getText());
            displayTextArea.setText(String.valueOf(data + previousData));
        }
        else if(operation.equals("minus")){
            Float data = Float.parseFloat(displayTextArea.getText());
            displayTextArea.setText(String.valueOf(previousData - data));
        }
        else if(operation.equals("multiply")) {
            Float data = Float.parseFloat(displayTextArea.getText());
            displayTextArea.setText(String.valueOf(previousData * data));
        }
        else if(operation.equals("division")) {
            Float data = Float.parseFloat(displayTextArea.getText());
            displayTextArea.setText(String.valueOf(previousData / data));
        }
        else if(operation.equals("sin")) {
            Float data = Float.parseFloat(displayTextArea.getText().substring(4));
            displayTextArea.setText(String.valueOf(Math.sin(data)));
        }
        else if(operation.equals("cos")){
            Float data = Float.parseFloat(displayTextArea.getText().substring(4));
            displayTextArea.setText(String.valueOf(Math.cos(data)));
        }
        else if(operation.equals("cot")){
            Float data = Float.parseFloat(displayTextArea.getText().substring(4));
            displayTextArea.setText(String.valueOf(1 / Math.tan(data)));
        }
        else if(operation.equals("tan")){
            Float data = Float.parseFloat(displayTextArea.getText().substring(4));
            displayTextArea.setText(String.valueOf(Math.tan(data)));
        }
        else if(operation.equals("power")){
            Float data = Float.parseFloat(displayTextArea.getText());
            displayTextArea.setText(String.valueOf(Math.pow(previousData, data)));
        }
        else if(operation.equals("square")) {
            Float data = Float.parseFloat(displayTextArea.getText().split(" ")[0]);
            displayTextArea.setText(String.valueOf(Math.pow(data, 2)));
        }
    }

    /**
     * close window by menu item
     *
     * @param event event
     */
    @FXML
    void close(ActionEvent event){
        Stage stage = (Stage) oneButton.getScene().getWindow();
        stage.hide();
        stage.close();
    }

    /**
     * show help by menu item
     *
     * @param event event
     */
    @FXML
    void help(ActionEvent event){
        JOptionPane.showMessageDialog( null , "This is a simple calculator!" ) ;
    }
}
