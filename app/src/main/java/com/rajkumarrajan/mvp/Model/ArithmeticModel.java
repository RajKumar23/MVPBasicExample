package com.rajkumarrajan.mvp.Model;

public class ArithmeticModel {

    private int FirstNumber;
    private int SecondNumber;

    public ArithmeticModel() {
    }

    public ArithmeticModel(int firstNumber, int secondNumber) {
        FirstNumber = firstNumber;
        SecondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return FirstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        FirstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return SecondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        SecondNumber = secondNumber;
    }

    public int AddTwoNumber(){
        return (FirstNumber + SecondNumber);
    }

    public int SubTwoNumber(){
        return (FirstNumber - SecondNumber);
    }

    public int MulTwoNumber(){
        return (FirstNumber * SecondNumber);
    }

    public int DivTwoNumber(){
        return (FirstNumber / SecondNumber);
    }
}
