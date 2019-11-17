package com.example.finalexam07590519;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalexam07590519.db.LedgerItem;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button meanButton = findViewById(R.id.register_button);
        meanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                intent.putExtra("type", 0);
                startActivity(intent);
            }
        });



        Button expenseButton = findViewById(R.id.login_button);
        expenseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, LedgerItem.class);
                intent.putExtra("type", 1);
                startActivity(intent);
            }
        });




            Toast t = Toast.makeText(LoginActivity.this, "All fields are required", Toast.LENGTH_SHORT);
            t.show();



    }


}
