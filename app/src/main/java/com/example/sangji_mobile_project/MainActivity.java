package com.example.sangji_mobile_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView dashBoard, map, info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // define Card
        dashBoard = (CardView) findViewById(R.id.dashboard);
        map = (CardView) findViewById(R.id.map);
        info = (CardView) findViewById(R.id.info);
        // Add Click listener to the card
        dashBoard.setOnClickListener(this);
        map.setOnClickListener(this);
        info.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i ;

        switch (view.getId()) {
            case R.id.dashboard : i = new Intent(this,Dashboard.class);startActivity(i); break ;
            case R.id.map : i = new Intent(this,Map.class);startActivity(i); break ;
            case R.id.info : i = new Intent(this,Information.class);startActivity(i); break ;
            default:break ;
        }
    }
}
