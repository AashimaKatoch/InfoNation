package com.example.infonation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.cardview.widget.CardView;

public class Dashboard extends MainActivity implements View.OnClickListener{

    private CardView news,covid,weather,manifestation,about;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_main);

        news = findViewById(R.id.Add_card);
        news.setOnClickListener(this);

        covid =  findViewById(R.id.Covid);
        covid.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch(view.getId()) {
            case R.id.Add_card:i = new Intent(this,MainActivity.class);
            startActivity(i);
            finish();
            break;






        }

    }
}
