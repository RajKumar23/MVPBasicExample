package com.rajkumarrajan.mvp.Presenter;

import com.rajkumarrajan.mvp.Contract.ArithmeticContract;
import com.rajkumarrajan.mvp.Model.ArithmeticModel;

public class ArithmeticPresenter implements ArithmeticContract.Presenter {

    private ArithmeticContract.View view;
    private ArithmeticModel arithmeticModel;

    public ArithmeticPresenter(ArithmeticContract.View view) {
        this.view = view;
        arithmeticModel = new ArithmeticModel();
    }

    @Override
    public void LoadAddNumber() {
        if (arithmeticModel.getFirstNumber() <= 0 && arithmeticModel.getSecondNumber() <= 0){
            view.showError("Both number must be valid!!");
        }

        view.showMessage(arithmeticModel.AddTwoNumber());
    }

    @Override
    public void LoadSubNumber() {
        if (arithmeticModel.getFirstNumber() <= 0 && arithmeticModel.getSecondNumber() <= 0){
            view.showError("Both number must be valid!!");
        }

        view.showMessage(arithmeticModel.SubTwoNumber());
    }

    @Override
    public void LoadMulNumber() {
        if (arithmeticModel.getFirstNumber() <= 0 && arithmeticModel.getSecondNumber() <= 0){
            view.showError("Both number must be valid!!");
        }

        view.showMessage(arithmeticModel.MulTwoNumber());
    }

    @Override
    public void LoadDivNumber() {
        if (arithmeticModel.getFirstNumber() <= 0 && arithmeticModel.getSecondNumber() <= 0){
            view.showError("Both number must be valid!!");
        }

        view.showMessage(arithmeticModel.DivTwoNumber());
    }

    @Override
    public void saveNumber(int FirstNumber, int SecondNumber) {
        arithmeticModel.setFirstNumber(FirstNumber);
        arithmeticModel.setSecondNumber(SecondNumber);
    }
}
