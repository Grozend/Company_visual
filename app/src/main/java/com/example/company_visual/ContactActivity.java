package com.example.company_visual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ContactActivity extends AppCompatActivity {

    ImageButton InfoPage, HomePage, CallPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        InfoPage = findViewById(R.id.InfoPage);
        HomePage = findViewById(R.id.HomePage);
        CallPage = findViewById(R.id.CallPage);

        InfoPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContactActivity.this, Info_o_kompany.class));
                finish();;
            }
        });
        HomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContactActivity.this, MainPageActivity.class));
                finish();;
            }
        });
        CallPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContactActivity.this, ChatActivity.class));
                finish();
            }
        });
    }
}