package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * change value of score variable to 3 when put on 3 point button
     */
    public void addThreePoint(View view) {
        score = score + 3;
        displayForTeamA(score);
    }

    /**
     * change value of score variable to 2 when put on 2 point button
     */
    public void addTwoPoint(View view) {
        score = score + 2;
        displayForTeamA(score);
    }

    /**
     * change value of score variable to 1 when put on Free throw button
     */
    public void addOnePoint(View view) {
        score = score + 1;
        displayForTeamA(score);
    }
}
