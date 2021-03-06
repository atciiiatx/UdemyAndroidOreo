package com.hookbang.android.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view)
    {
        EditText userName = (EditText) findViewById(R.id.userNameEditText);
        EditText password = (EditText) findViewById(R.id.passwordEditText);
        Log.i("Info", "Button pressed!");
        Log.i("Username", userName.getText().toString());
        Log.i("Password", password.getText().toString());
    }
}
