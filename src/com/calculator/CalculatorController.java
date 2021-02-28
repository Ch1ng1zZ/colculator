package com.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController implements Initializable {

    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button plus;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button minus;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button vur;
    @FXML
    private Button tam;
    @FXML
    private Button zero;
    @FXML
    private Button modulus;
    @FXML
    private Button bol;
    @FXML
    private Button equal;
    @FXML
    private Button clear;
    @FXML
    private TextField txt;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
int say=0;
    @FXML
    private void oneAction(ActionEvent event) {
    if(say==0){
        txt.setText("");
    }
        say++;
        txt.setText(txt.getText()+"1");
        }

    @FXML
    private void twoAction(ActionEvent event) {
      if(say==0){
        txt.setText("");
    }
        say++;
        txt.setText(txt.getText()+"2");
    
    }

    @FXML
    private void threeAction(ActionEvent event) {
     if(say==0){
        txt.setText("");
    }
        say++;
        txt.setText(txt.getText()+"3");
    
    }

    @FXML
    private void plusAction(ActionEvent event) {
   txt.setText(txt.getText()+" + ");
    
    }

    @FXML
    private void fourAction(ActionEvent event) {
    if(say==0){
        txt.setText("");
    }
        say++;
        txt.setText(txt.getText()+"4");
    
    
    }

    @FXML
    private void fiveAction(ActionEvent event) {
       if(say==0){
        txt.setText("");
    }
        say++;
        txt.setText(txt.getText()+"5");
   
    
    
    }

    @FXML
    private void sixAction(ActionEvent event) {
     if(say==0){
        txt.setText("");
    }
        say++;
        txt.setText(txt.getText()+"6");
    
    }

    @FXML
    private void minusAction(ActionEvent event) {
   txt.setText(txt.getText()+" - ");
    
    
    }

    @FXML
    private void sevenAction(ActionEvent event) {
     if(say==0){
        txt.setText("");
    }
        say++;
        txt.setText(txt.getText()+"7");
    
    
    }

    @FXML
    private void eightAction(ActionEvent event) {
     if(say==0){
        txt.setText("");
    }
        say++;
        txt.setText(txt.getText()+"8");
    
    }

    @FXML
    private void nineAction(ActionEvent event) {
     if(say==0){
        txt.setText("");
    }
        say++;
        txt.setText(txt.getText()+"9");
    
    }

    @FXML
    private void vurAction(ActionEvent event) {
 txt.setText(txt.getText()+" * ");
    
    
    }

    @FXML
    private void tamAction(ActionEvent event) {
     txt.setText(txt.getText()+",");
    
    
    }

    @FXML
    private void zeroAction(ActionEvent event) {
   if(say==0){
        txt.setText("");
    }
        say++;
        txt.setText(txt.getText()+"0");
    }

    @FXML
    private void modulusAction(ActionEvent event) {
    txt.setText(txt.getText()+" % ");
    
    
    
    }

    @FXML
    private void bolAction(ActionEvent event) {
    txt.setText(txt.getText()+" / ");
    
    
    }

    @FXML
    private void equalAction(ActionEvent event) {
double answer=0;
      String txt1=txt.getText();
      String cvb[]=txt1.split(" ");
      Double firstNumber=Double.parseDouble(cvb[0]);
      Double secondNumber=Double.parseDouble(cvb[2]);
      String operator=cvb[1];
             switch (operator){
            case "*":
                answer=firstNumber*secondNumber;
            break;
         case "/":
                answer=firstNumber/secondNumber;
            break;
           case "+":
                answer=firstNumber+secondNumber;
            break;
           case "-":
                answer=firstNumber-secondNumber;
            break;
           case "%":
                answer=firstNumber%secondNumber;
            break;
            default:       
             txt.setText("write right operator");
        }
    txt.setText(""+answer);
    say=0;
    }

    @FXML
    private void clearAction(ActionEvent event) {
    txt.setText("");
    }
      
    
}
