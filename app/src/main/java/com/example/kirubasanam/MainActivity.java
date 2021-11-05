package com.example.kirubasanam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       button = findViewById(R.id.btnBible);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openBible();
           }
       });

    }

    public void openBible(){
        Intent intent = new Intent(this,bible.class);
        startActivity(intent);
    }
}