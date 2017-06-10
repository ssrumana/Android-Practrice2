package com.example.user.textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.txtView);

    }

    public void onlClick (View v) {
        if (v.getId() == R.id.txtView) {
            String myvar = txt.getText().toString();
            Toast.makeText(this, myvar, Toast.LENGTH_LONG).show();
        }
    }
}
