package com.example.md1l1homework.homeWork2;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.md1l1homework.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainBottomSheet extends AppCompatActivity {
    private FloatingActionButton fab;
    private View bottomSheet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hw2_activity_bottom);

        initElements();
        bottomSheetFabSlide();
    }

    private void bottomSheetFabSlide() {
        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);
        bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
//                if (BottomSheetBehavior.STATE_DRAGGING == newState) {
//                    fab.animate().scaleX(0).scaleY(0).setDuration(300).start();
//                } else if (BottomSheetBehavior.STATE_COLLAPSED == newState) {
//                    fab.animate().scaleX(1).scaleY(1).setDuration(300).start();
//                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                fab.animate().scaleX(1 - slideOffset).scaleY(1 - slideOffset).setDuration(0).start();
            }
        });
    }

    private void initElements() {
        fab = findViewById(R.id.sheet_FAB_btn);
        bottomSheet = findViewById(R.id.bottom_sheet_layout);
    }

}
