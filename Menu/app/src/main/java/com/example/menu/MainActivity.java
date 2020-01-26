package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView firstString = findViewById(R.id.menu_item_1);
        String firstView = firstString.getText().toString();
        Log.i("First TextView", firstView);
        // Find second menu item TextView and print the text to the logs

        // Find third menu item TextView and print the text to the logs

    }
}