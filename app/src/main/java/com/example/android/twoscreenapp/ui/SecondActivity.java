package com.example.android.twoscreenapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.twoscreenapp.R;

public class SecondActivity extends ActionBarActivity {

    private TextView mSecondScreenTextView;
    private Button mSecondScreenButton;
    private String mName, mNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mSecondScreenTextView = (TextView) findViewById(R.id.secondScreenTextView);
        mSecondScreenButton = (Button) findViewById(R.id.secondScreenButton);

        Intent intent = getIntent();
        mName = intent.getStringExtra(getString(R.string.key_name));
        mNumber = intent.getStringExtra(getString(R.string.key_number));

        mSecondScreenTextView.setText("Hello "+ mName + ". Your favorite number is " +
                 mNumber + ".");
                
        mSecondScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }


}
