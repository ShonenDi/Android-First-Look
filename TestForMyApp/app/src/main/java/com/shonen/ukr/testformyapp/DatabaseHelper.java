package com.shonen.ukr.testformyapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "foods.db";
    private static final int SCHEMA = 1;
    static final String TABLE = "foods";

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_FOOD_NAME = "name";
    public static final String COLUMN_FOOD_WEIGHT = "weight";
    public static final String COLUMN_FOOD_CALORIES = "calories";
    public static final String COLUMN_TOTAL_CALORIES = "weight";


    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, SCHEMA);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE foods (" + COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_FOOD_NAME + "TEXT, " + COLUMN_FOOD_WEIGHT + "REAL, " + COLUMN_FOOD_CALORIES + "REAL, "
                + COLUMN_TOTAL_CALORIES + "REAL)");
        db.execSQL("INSERT INTO " + TABLE + " (" + COLUMN_FOOD_NAME + ", " + COLUMN_FOOD_WEIGHT + ", "
                + COLUMN_FOOD_CALORIES + ", " + COLUMN_TOTAL_CALORIES + ") VALUES ('Рис', 200.5, 645.5 ,((200.5*645.5)/100));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
