package com.example.user.materialdesignactivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by Ankit on 2/17/2016.
 */
public class SnackbarActivity extends AppCompatActivity {

    private CoordinatorLayout coordinatorLayout;
    private Button btnSimpleSnackbar, btnActionCallback, btnCustomView;

    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snackbar_activity);

        coordinatorLayout = (CoordinatorLayout) findViewById(R.id
                .coordinatorLayout);

        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),GoToTabActivity.class));
            }
        });


        btnSimpleSnackbar = (Button) findViewById(R.id.btnSimpleSnackbar);
        btnActionCallback = (Button) findViewById(R.id.btnActionCallback);
        btnCustomView = (Button) findViewById(R.id.btnCustomSnackbar);

        btnSimpleSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar
                        .make(coordinatorLayout, "Welcome to AndroidHive", Snackbar.LENGTH_LONG);

                snackbar.show();
            }
        });

        btnActionCallback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar
                        .make(coordinatorLayout, "Message is deleted", Snackbar.LENGTH_LONG)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snackbar1 = Snackbar.make(coordinatorLayout, "Message is restored!", Snackbar.LENGTH_SHORT);
                                snackbar1.show();
                            }
                        });

                snackbar.show();
            }
        });

        btnCustomView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar
                        .make(coordinatorLayout, "No internet connection!", Snackbar.LENGTH_LONG)
                        .setAction("RETRY", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                            }
                        });

                // Changing message text color
                snackbar.setActionTextColor(Color.RED);

                // Changing action button text color
                View sbView = snackbar.getView();
                TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
                textView.setTextColor(Color.YELLOW);

                snackbar.show();
            }
        });
    }
}
