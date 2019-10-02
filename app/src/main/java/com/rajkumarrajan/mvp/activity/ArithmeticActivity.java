package com.rajkumarrajan.mvp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.rajkumarrajan.mvp.Contract.ArithmeticContract;
import com.rajkumarrajan.mvp.Presenter.ArithmeticPresenter;
import com.rajkumarrajan.mvp.R;

public class ArithmeticActivity extends AppCompatActivity implements View.OnClickListener,
        ArithmeticContract.View {

    EditText EditTextFirstNumber, EditTextSecondNumber;
    ArithmeticContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmetic);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        EditTextFirstNumber = (EditText) findViewById(R.id.EditTextFirstNumber);
        EditTextSecondNumber = (EditText) findViewById(R.id.EditTextSecondNumber);

        findViewById(R.id.ButtonAdd).setOnClickListener(this);
        findViewById(R.id.ButtonSub).setOnClickListener(this);
        findViewById(R.id.ButtonMul).setOnClickListener(this);
        findViewById(R.id.ButtonDiv).setOnClickListener(this);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        presenter = new ArithmeticPresenter(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ButtonAdd:
                presenter.saveNumber(Integer.parseInt(EditTextFirstNumber.getText().toString()),
                        Integer.parseInt(EditTextSecondNumber.getText().toString()));
                presenter.LoadAddNumber();
            break;
            case R.id.ButtonSub:
                presenter.saveNumber(Integer.parseInt(EditTextFirstNumber.getText().toString()),
                        Integer.parseInt(EditTextSecondNumber.getText().toString()));
                presenter.LoadSubNumber();
            break;
            case R.id.ButtonMul:
                presenter.saveNumber(Integer.parseInt(EditTextFirstNumber.getText().toString()),
                        Integer.parseInt(EditTextSecondNumber.getText().toString()));
                presenter.LoadMulNumber();
            break;
            case R.id.ButtonDiv:
                presenter.saveNumber(Integer.parseInt(EditTextFirstNumber.getText().toString()),
                        Integer.parseInt(EditTextSecondNumber.getText().toString()));
                presenter.LoadDivNumber();
            break;
        }
        /*EditTextFirstNumber.setText("");
        EditTextSecondNumber.setText("");*/
    }

    @Override
    public void showMessage(int Total) {
        Toast.makeText(getApplicationContext(), ""+Total, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError(String error) {
        Toast.makeText(getApplicationContext(), error, Toast.LENGTH_SHORT).show();
    }
}
