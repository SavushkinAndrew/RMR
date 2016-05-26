package com.taom.app.rmr.ui.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.taom.app.rmr.R;

public class Login extends AppCompatActivity {
    EditText etLogin,etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etLogin = (EditText)findViewById(R.id.etlogin);
        etPassword = (EditText)findViewById(R.id.etPassword);

    }
}
