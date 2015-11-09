package com.haiku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLoveButtonClicked(View view) {
        TextView haiku = (TextView) findViewById(R.id.haikuTextView);
        haiku.setVisibility(View.VISIBLE);
    }
}

