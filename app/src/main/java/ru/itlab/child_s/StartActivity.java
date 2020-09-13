package ru.itlab.child_s;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class StartActivity extends Activity {

    EditText text, password;
    TextView error;
    Button login;
    ImageView logo;
    ArrayList<Pair<String, String>> logpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        logpass = new ArrayList<>();
        logpass.add(new Pair("koala", "0000"));
        logpass.add(new Pair("dajjsand", "12345678"));
        logpass.add(new Pair("korjick", "87654321"));

        login = findViewById(R.id.button);
        text = findViewById(R.id.editText);
        password = findViewById(R.id.editTextPassword);
        logo = findViewById(R.id.imageView);
        logo.setImageResource(R.drawable.logo);
        error = findViewById(R.id.textView);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (logpass.indexOf(new Pair(
                        text.getText().toString().toLowerCase(),
                        password.getText().toString().toLowerCase())) != -1) {
                    Intent i = new Intent(StartActivity.this, LeaderBoardActivity.class);
                    startActivity(i);
                } else {
                    error.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
