package com.taom.app.rmr.ui.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.taom.app.rmr.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etLogin,etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etLogin = (EditText)findViewById(R.id.etlogin);
        etPassword = (EditText)findViewById(R.id.etPassword);

    }

    @Override
    public void onClick(View v) {

    }
}
