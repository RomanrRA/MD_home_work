package com.example.md1l1homework.homeWork5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FabBehavior extends FloatingActionButton.Behavior {

    public FabBehavior(Context context, AttributeSet attributes) {
        super();
    }

    @SuppressLint("RestrictedApi")
    @Override
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout,
                               @NonNull FloatingActionButton child,
                               @NonNull View target,
                               int dxConsumed,
                               int dyConsumed,
                               int dxUnconsumed,
                               int dyUnconsumed,
                               int type) {
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);

        if (child.getVisibility() == View.VISIBLE && dyConsumed > 0) {
            child.setVisibility(View.INVISIBLE);
        } else if (child.getVisibility() == View.INVISIBLE && dyConsumed < 0) {
            child.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public boolean onStartNestedScroll(
            @NonNull CoordinatorLayout coordinatorLayout,
            @NonNull FloatingActionButton child,
            @NonNull View directTargetChild,
            @NonNull View target,
            int axes,
            int type) {
        return axes == ViewCompat.SCROLL_AXIS_VERTICAL;
    }
}
