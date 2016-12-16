package com.udacityproject.mylibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        Intent intent = getIntent();
        String jokeContent = intent.getStringExtra("joke");

        TextView jokeText = (TextView) findViewById(R.id.joke);
        jokeText.setText(jokeContent);

    }
}
