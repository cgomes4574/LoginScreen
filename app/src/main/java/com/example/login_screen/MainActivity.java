package com.example.login_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView email =(TextView) findViewById(R.id.email);
        TextView password = (TextView)  findViewById(R.id.password);

        Button loginButton = (Button) findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if email and password entered are valid
                if(email.getText().toString().equals("user@example.com") && password.getText().toString().equals("user")) {
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    // if not valid
                }else

                    Toast.makeText(MainActivity.this, "EMAIL OR PASSWORD IS INCORRECT", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
