package com.example.md1l1homework.homeWork2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.md1l1homework.R;
import com.example.md1l1homework.homeWork2.helpers.Common;
import com.google.android.material.snackbar.Snackbar;

public class MainSnackBar extends AppCompatActivity {
    private Button snackButton;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hw2_snack_bar_layout);
        initElements();

        snackBunnonOnClickListner();
    }

    private void snackBunnonOnClickListner() {
        snackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Common.getCustomSnackbar(v, "Welcome to recursion");
                snackbar.setAction("Push me one more time", snackBarOnClickListner());
                snackbar.show();
            }
        });
    }

    private View.OnClickListener snackBarOnClickListner() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Common.getCustomSnackbar(v, "Welcome to recursion №" + ++i);
                snackbar.setAction("Push me one more time", snackBarOnClickListner());
                snackbar.show();
            }
        };
    }

    private void initElements() {
        snackButton = findViewById(R.id.snack_bar_button);
    }


}

