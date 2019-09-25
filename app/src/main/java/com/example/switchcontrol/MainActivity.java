package com.example.switchcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Switch sw1, sw2;
    Button bu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw1 = findViewById(R.id.s1);
        sw2 = findViewById(R.id.s2);
        bu1 = findViewById(R.id.b1);
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1, str2;
                if (sw1.isChecked()) {
                    str1 = sw1.getTextOn().toString();
                } else {
                    str1 = sw1.getTextOff().toString();
                }
                if (sw2.isChecked()) {
                    str2 = sw2.getTextOn().toString();
                } else {
                    str2 = sw2.getTextOff().toString();
                }
                Toast.makeText(getApplicationContext(), "switch1" + str1 + "\n" + "switch2" + str2, Toast.LENGTH_SHORT).show();
            }

        });
    }
}
