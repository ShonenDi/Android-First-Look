package com.shonen.ukr.testformyapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        final ArrayList<Dish> dishMenu = new ArrayList<>();
        dishMenu.add(new Dish("Рис",125.5,50.4));
        dishMenu.add(new Dish("соль",15,5.4));

        final DishAdapter dishAdapter = new DishAdapter(Menu.this,dishMenu);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(dishAdapter);
    }




}
