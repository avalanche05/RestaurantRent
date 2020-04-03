package com.example.restaurantrent.user;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.restaurantrent.R;
import com.example.restaurantrent.user.DataBase.DatabaseHandler;
import com.example.restaurantrent.user.user.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginActivity extends AppCompatActivity {
    private Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });

    }
    private void loginUser(){
        EditText usernameEditText = this.findViewById(R.id.username);
        EditText passwordEditText = this.findViewById(R.id.password);
        LoginController.loginUser(usernameEditText.getText().toString(),passwordEditText.getText().toString());
    }
}
