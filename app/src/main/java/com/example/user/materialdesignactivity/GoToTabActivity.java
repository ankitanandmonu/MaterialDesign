package com.example.user.materialdesignactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ankit on 2/17/2016.
 */
public class GoToTabActivity extends AppCompatActivity {
    Button simple, scrollable, iconsand, onlyicon, custom, navigation, floating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.various_tab);

        simple = (Button) findViewById(R.id.simple);
        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TabActivity.class));
            }
        });
        scrollable = (Button) findViewById(R.id.scrollable);
        scrollable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ScrollableTabActivity.class));
            }
        });
        iconsand = (Button) findViewById(R.id.iconsand);
        iconsand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TabIconTextactivity.class));
            }
        });
        onlyicon = (Button) findViewById(R.id.onlyicon);
        onlyicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TabIconActivity.class));
            }
        });
        custom = (Button) findViewById(R.id.custom);
        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),CustomTabActivity.class));
            }
        });
        floating = (Button) findViewById(R.id.floating);
        floating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FloatingText.class));
            }
        });
        navigation = (Button) findViewById(R.id.navigation);
        navigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),NavigationActivity.class));
            }
        });
    }
}
