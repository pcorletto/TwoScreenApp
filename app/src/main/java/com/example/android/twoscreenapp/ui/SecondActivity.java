package com.example.android.twoscreenapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.twoscreenapp.R;
import com.example.android.twoscreenapp.model.Squared;

public class SecondActivity extends ActionBarActivity {

    private TextView mSecondScreenTextView;
    private Button mSecondScreenButton;
    private String mName, mNumberString;
    private float mNumber, mNumberSquared;
    private Squared squareNumber = new Squared();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mSecondScreenTextView = (TextView) findViewById(R.id.secondScreenTextView);
        mSecondScreenButton = (Button) findViewById(R.id.secondScreenButton);

        Intent intent = getIntent();
        mName = intent.getStringExtra(getString(R.string.key_name));
        mNumberString = intent.getStringExtra(getString(R.string.key_number));

        mNumber = Float.parseFloat(mNumberString);

        // Square the number

        mNumberSquared = squareNumber.getSquare(mNumber);

        mSecondScreenTextView.setText("Hello "+ mName + ". Your favorite number is " +
                 mNumber + ".\nThe square of your number is " + mNumberSquared);

        mSecondScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }


}
