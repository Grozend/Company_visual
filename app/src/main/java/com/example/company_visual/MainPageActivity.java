package com.example.company_visual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainPageActivity extends AppCompatActivity {

    ImageButton InfoPage, ContactPage, CallPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        InfoPage = findViewById(R.id.InfoPage);
        ContactPage = findViewById(R.id.ContactPage);
        CallPage = findViewById(R.id.CallPage);

        InfoPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPageActivity.this, Info_o_kompany.class));
                finish();;
            }
        });
        ContactPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPageActivity.this, ContactActivity.class));
                finish();;
            }
        });
        CallPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPageActivity.this, ChatActivity.class));
                finish();
            }
        });
    }
}