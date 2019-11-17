
package com.example.finalexam07590519;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalexam07590519.db.LedgerItem;
import com.example.finalexam07590519.db.LedgerRepository;

public class RegisterActivity extends AppCompatActivity {
    private int mLedgerType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent = getIntent();
        mLedgerType = intent.getIntExtra("type", 0);



        Button saveButton = findViewById(R.id.register_button); //กดปุ่มบันทึก
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText fullnameEditText = findViewById(R.id.full_name_edit_text);
                String description = fullnameEditText.getText().toString();

                EditText usernameEditText = findViewById(R.id.username_edit_text);
                int amount = Integer.parseInt(usernameEditText.getText().toString());

                LedgerItem item = new LedgerItem(0, description, "","");

                insertLedger(item); // กรณีเก็บข้อมูลในฐานข้อมูล SQLite บนมือถือ
                // insertLedgerOnServer(item); // กรณีเก็บข้อมูลในฐานข้อมูล MySQL (MariaDB) บน server
            }
        });
    }


    private void insertLedger(LedgerItem item) {
        LedgerRepository repo = new LedgerRepository(RegisterActivity.this);
        repo.insertLedger(item, new LedgerRepository.InsertCallback() {
            @Override
            public void onInsertSuccess() {
                finish();
            }
        });
    }




    }

