package com.example.android.footballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Team One Football Scores
     **/
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void touchDownA(View V) {
        scoreTeamA += 4;
        displayForTeamA(scoreTeamA);
    }

    public void fieldGoalA(View V) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void tryKickA(View V) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void tryRunA(View V) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void safetyA(View V) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Team Two Football Scores
     **/
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void touchDownB(View V) {
        scoreTeamB += 4;
        displayForTeamB(scoreTeamB);
    }

    public void fieldGoalB(View V) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void tryKickB(View V) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void tryRunB(View V) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void safetyB(View V) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);

    }

    public void resetScore(View v) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}

