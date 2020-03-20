package com.shonen.ukr.animationsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtHelloWorld;
    private TextView txtHiWorld;
    private TextView someTxtView;
    private Button btnAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           txtHelloWorld = findViewById(R.id.txtHelloWorld);
           txtHiWorld = findViewById(R.id.txtHiWorld);
           someTxtView = findViewById(R.id.someTxtView);
           btnAnimation = findViewById(R.id.buttonAnimation);

        txtHelloWorld.setY(-2000);
        txtHiWorld.setX(1500);
        someTxtView.setY(2000);

           txtHelloWorld.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

//                   Log.i("Mylog", "Button was clicked");
//                   txtHelloWorld.animate().rotation(90f).setDuration(1000);
                   if(txtHelloWorld.getAlpha()==1) {
                       txtHelloWorld.animate().alpha(0.f).setDuration(3000);
                       txtHiWorld.animate().alpha(1f).setDuration(3000);
                   }else{
                       txtHelloWorld.animate().alpha(1f).setDuration(3000);
                       txtHiWorld.animate().alpha(0f).setDuration(3000);
                   }
               }
           });

           someTxtView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
//                   someTxtView.animate().translationX(3000f).setDuration(3000);
//                   someTxtView.animate().translationY(-3000f).setDuration(3000);
//                   someTxtView.animate().translationXBy(200f).setDuration(3000);
//                   someTxtView.animate().rotation(360).setDuration(5000);
//                   someTxtView.animate().rotationX(560).setDuration(5000);
                   someTxtView.animate().rotationX(400).translationY(2000).setDuration(5000);
               }
           });

           btnAnimation.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   txtHelloWorld.animate().translationYBy(2000).rotationY(3600).setDuration(3000);
                   txtHiWorld.animate().translationXBy(-1500).setDuration(3000);
                   someTxtView.animate().translationYBy(-2000).alpha(0.7f).setDuration(3000);
               }
           });
    }
}
