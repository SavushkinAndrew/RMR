package com.taom.app.rmr.ui.activitys;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.taom.app.rmr.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etLogin,etPassword;
    Button view,view2;
    Firebase myFirebaseRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(this);
        setContentView(R.layout.activity_main);
        etLogin = (EditText)findViewById(R.id.etlogin);
        etPassword = (EditText)findViewById(R.id.etPassword);
        myFirebaseRef = new Firebase("https://jokes-taom.firebaseio.com/");
        view = (Button)findViewById(R.id.view);
        view2 = (Button)findViewById(R.id.view2);
        if (view != null) {
            view.setOnClickListener(this);
        }
        if (view2 != null) {
            view2.setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {

switch (v.getId())
{

    case R.id.view:
    myFirebaseRef.child("message").setValue("Просто текст :)");
    break;
    case R.id.view2:
        myFirebaseRef.child("message").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                System.out.println(snapshot.getValue());  //prints "Do you have data? You'll love Firebase."
            }
            @Override public void onCancelled(FirebaseError error) { }
        });
        break;

}
    }
}
