package com.example.sugarbiosaveetha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.SharedPreferences;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {


    private EditText eName;
    private EditText ePassword;
    private Button eLogin;
    private TextView eAttemptsInfo;
    private TextView eRegister;
    private CheckBox eRememberMe;

    boolean isValid = false;
    private int counter = 5;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor sharedPreferencesEditor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        /*eName = findViewById(R.id.etName);
        ePassword = findViewById(R.id.etPassword);
        eLogin = findViewById(R.id.btnLogin);
        eAttemptsInfo = findViewById(R.id.tvAttemptsInfo);
        eRegister = findViewById(R.id.tvRegister);
        eRememberMe = findViewById(R.id.cbRememberMe);

        sharedPreferences = getApplicationContext().getSharedPreferences("CredentialsDB", MODE_PRIVATE);
        sharedPreferencesEditor = sharedPreferences.edit();

        if(sharedPreferences != null){

            String savedUsername = sharedPreferences.getString("Username", "");
            String savedPassword = sharedPreferences.getString("Password", "");

            RegistrationActivity.credentials = new Credentials(savedUsername, savedPassword);

            if(sharedPreferences.getBoolean("RememberMeCheckbox", false)){
                eName.setText(savedUsername);
                ePassword.setText(savedPassword);
                eRememberMe.setChecked(true);
            }
        }

        eRememberMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sharedPreferencesEditor.putBoolean("RememberMeCheckbox", eRememberMe.isChecked());

                sharedPreferencesEditor.apply();
            }
        });*/

    }

}