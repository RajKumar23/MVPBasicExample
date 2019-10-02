package com.rajkumarrajan.mvp.Contract;

/** Helps us track the relationship between the View and the Presenter in a central place */
public interface SayHelloContract {

    /** Represents the View in MVP. */
    interface View {
        void showMessage(String message);

        void showError(String error);
    }

    /** Represents the Presenter in MVP. */
    interface Presenter {
        void loadMessage();

        void saveName(String firstName, String lastName);
    }
}
