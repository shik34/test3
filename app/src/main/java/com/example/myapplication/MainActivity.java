package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void b(View v){


        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        String eText = "information to send";
        i.putExtra("et", eText);
        startActivity(i);
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "aafdsgsfgfg", Toast.LENGTH_SHORT).show();
        // Приостановить обновления UI, потоки или трудоемкие процессы,
        // ненужные, когда активность не на переднем плане
    }
}