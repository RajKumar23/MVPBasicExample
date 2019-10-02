package com.rajkumarrajan.mvp.Presenter;

import com.rajkumarrajan.mvp.Contract.SayHelloContract;
import com.rajkumarrajan.mvp.Model.PersonModel;

public class SayHelloPresenter implements SayHelloContract.Presenter{

    private PersonModel mPersonModel;
    private SayHelloContract.View mView;

    public SayHelloPresenter( SayHelloContract.View view) {
        mPersonModel = new PersonModel();
        mView = view;
    }

    @Override
    public void loadMessage() {
        if (mPersonModel.getmFirstName() == null && mPersonModel.getmLastName() == null){
            mView.showError("No person name found.");
            return;
        }

        String message = "Hi " + mPersonModel.getName() + "!";
        mView.showMessage(message);
    }

    @Override
    public void saveName(String firstName, String lastName) {
        mPersonModel.setmFirstName(firstName);
        mPersonModel.setmLastName(lastName);
    }
}
