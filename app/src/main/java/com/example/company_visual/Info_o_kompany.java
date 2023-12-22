package com.example.company_visual;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class Info_o_kompany extends AppCompatActivity {

    ImageButton HomePage, ContactPage, CallPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_okompany);

        HomePage = findViewById(R.id.HomePage);
        ContactPage = findViewById(R.id.ContactPage);
        CallPage = findViewById(R.id.CallPage);

        HomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Info_o_kompany.this, MainPageActivity.class));
                finish();;
            }
        });
        ContactPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Info_o_kompany.this, ContactActivity.class));
                finish();;
            }
        });
        CallPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Info_o_kompany.this, ChatActivity.class));
                finish();;
            }
        });
    }
}