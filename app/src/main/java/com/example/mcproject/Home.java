package com.example.mcproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class Home extends AppCompatActivity {
    Button listen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listen = (Button) findViewById(R.id.listen);
        listen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSonglist();
            }
        });
    }

    public void openSonglist() {
        Intent intent = new Intent(this, Songlist.class);
        startActivity(intent);
    }
}