package com.example.android.twoscreenapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.twoscreenapp.R;


public class MainActivity extends ActionBarActivity {

    private EditText mNameEditText, mNumberEditText;
    private Button mMainScreenButton;
    private String mName, mNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameEditText = (EditText) findViewById(R.id.nameEditText);
        mNumberEditText = (EditText) findViewById(R.id.numberEditText);
        mMainScreenButton = (Button) findViewById(R.id.mainScreenButton);

        mMainScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mName = mNameEditText.getText().toString();
                mNumber = mNumberEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(getString(R.string.key_name), mName);
                intent.putExtra(getString(R.string.key_number).toString(), mNumber);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        mNameEditText.setText("");
        mNumberEditText.setText("");
    }
}
