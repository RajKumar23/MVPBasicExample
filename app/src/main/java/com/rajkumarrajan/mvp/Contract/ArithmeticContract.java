package com.rajkumarrajan.mvp.Contract;

public interface ArithmeticContract {

    /** Represents the View in MVP. */
    interface View {
        void showMessage(int Total);

        void showError(String error);
    }

    /** Represents the Presenter in MVP. */
    interface Presenter {
        void LoadAddNumber();

        void LoadSubNumber();

        void LoadMulNumber();

        void LoadDivNumber();

        void saveNumber(int FirstNumber, int SecondNumber);
    }
}
