package com.rajkumarrajan.mvp.Model;

public class PersonModel {

    private String mFirstName;
    private String mLastName;

    public PersonModel() {
    }

    public PersonModel(String mFirstName, String mLastName) {
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public String getName() {
        return mFirstName + " " + mLastName;
    }
}
