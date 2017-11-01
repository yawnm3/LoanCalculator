package com.example.taruc.loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main extends AppCompatActivity {

    public static final String MONTHLY_PAYMENT = "payment";
    public static final String LOAN_STATUS = "status";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateLoan(View view)
    {
        //Create an Explicit intent
        Intent intent = new Intent(this, ResultActivity.class);

        //TODO: calculate monthly payment and determine whether application approve or reject.
        double monthlyPayment = 450.0;
        String status = "Approve";

        double totalInterest = 0.0, vehiclePrice = 0.0, downPayment = 0.0, interestRate = 0.0, loanPeriod = 0.0;
        vehiclePrice = (EditText)findViewById(R.id.editTextCP);
        Double.parseDouble(vehiclePrice);

        totalInterest = (vehiclePrice - downPayment) * (interestRate) * (loadPeriod/12);

        //Passing data using putExtra method
        //putExtra(TAG, value)
        intent.putExtra(MONTHLY_PAYMENT, monthlyPayment);
        intent.putExtra(LOAN_STATUS, status);
        startActivity(intent);
    }
}
