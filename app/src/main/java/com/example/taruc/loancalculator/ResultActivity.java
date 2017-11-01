package com.example.taruc.loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent(); //asking who call me
        double payment;
        String status;
        payment = intent.getDoubleExtra(Main.MONTHLY_PAYMENT,0);
        status = intent.getStringExtra(Main.LOAN_STATUS);
    }


    public void closeActivity(View view)
    {
        finish();
    }
}
