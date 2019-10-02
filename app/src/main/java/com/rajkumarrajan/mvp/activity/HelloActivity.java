package com.rajkumarrajan.mvp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.rajkumarrajan.mvp.Contract.SayHelloContract;
import com.rajkumarrajan.mvp.Presenter.SayHelloPresenter;
import com.rajkumarrajan.mvp.R;

public class HelloActivity extends AppCompatActivity implements SayHelloContract.View, View.OnClickListener {

    EditText EditTextFirstName, EditTextSecondName;
    TextView TextWelcomeMessage;
    private SayHelloContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        TextWelcomeMessage = (TextView) findViewById(R.id.TextWelcomeMessage);
        EditTextFirstName = (EditText) findViewById(R.id.EditTextFirstName);
        EditTextSecondName = (EditText) findViewById(R.id.EditTextSecondName);

        findViewById(R.id.ButtonUpdate).setOnClickListener(this);
        findViewById(R.id.ButtonShowMessage).setOnClickListener(this);

        // Creates presenter
        presenter = new SayHelloPresenter(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ButtonUpdate:
                presenter.saveName(EditTextFirstName.getText().toString(), EditTextSecondName.getText().toString());
                break;
            case R.id.ButtonShowMessage:
                presenter.loadMessage();
                break;
        }
    }

    @Override
    public void showMessage(String message) {
        TextWelcomeMessage.setText(message);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(getApplicationContext(), error, Toast.LENGTH_SHORT).show();
    }
}
