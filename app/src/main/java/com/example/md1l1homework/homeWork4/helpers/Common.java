package com.example.md1l1homework.homeWork4.helpers;

import android.graphics.Color;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class Common {
        public static Snackbar getCustomSnackbar(View view, String message) {
            Snackbar mSnackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG);
            View mSnackbarView = mSnackbar.getView();
            mSnackbarView.setBackgroundColor(Color.BLUE);
            return mSnackbar;
        }
}
