package com.strattondesign.courtcounter;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
        if (score > scoreTeamB){
            setTeamALead(scoreView);
        }
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
        if (score > scoreTeamA){
            setTeamBLead(scoreView);
        }
    }

    public void setTeamALead(TextView winningTextView){
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        winningTextView.setTextColor(Color.GREEN);
        scoreViewB.setTextColor(Color.BLACK);
    }

    public void setTeamBLead(TextView winningTextView){
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_score);
        winningTextView.setTextColor(Color.GREEN);
        scoreViewA.setTextColor(Color.BLACK);
    }

    public void reset(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_score);
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewA.setTextColor(Color.BLACK);
        scoreViewB.setTextColor(Color.BLACK);
    }

    public void threePointAClick(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    public void twoPointAClick(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    public void freeThrowAClick(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void threePointBClick(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    public void twoPointBClick(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    public void freeThrowBClick(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
}
