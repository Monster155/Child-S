package ru.itlab.child_s;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class LeaderBoardActivity extends Activity {

    ViewGroup ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        ll = (ViewGroup) findViewById(R.id.ll);
        addLayout("1.", "Иванов Иван", "25 lvl");
        addLayout("2.", "Иванов Иван", "24 lvl");
        addLayout("3.", "Иванов Иван", "23 lvl");
        addLayout("4.", "Иванов Иван", "21 lvl");
        addLayout("5.", "Иванов Иван", "18 lvl");
        addLayout("6.", "Иванов Иван", "15 lvl");
        addLayout("7.", "Иванов Иван", "13 lvl");
        addLayout("8.", "Иванов Иван", "10 lvl");
        addLayout("9.", "Иванов Иван", "7 lvl");
        addLayout("10.", "Иванов Иван", "3 lvl");
    }

    private void addLayout(String numberStr, String nameStr, String scoreStr) {
        View layout = LayoutInflater.from(this).inflate(R.layout.leaderboard_element, ll, false);

        TextView number = layout.findViewById(R.id.number);
        number.setText(numberStr);
        TextView name = layout.findViewById(R.id.name);
        name.setText(nameStr);
        TextView score = layout.findViewById(R.id.score);
        score.setText(scoreStr);

        ll.addView(layout);
    }
}
