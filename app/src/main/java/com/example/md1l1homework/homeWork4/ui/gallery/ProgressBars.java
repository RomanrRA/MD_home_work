package com.example.md1l1homework.homeWork4.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.md1l1homework.R;

public class ProgressBars extends Fragment {

    private GalleryViewModel progressBarsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        progressBarsViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.hw4_fragment_progress_bars, container, false);
        final TextView textView = root.findViewById(R.id.text_progress_bars);
        progressBarsViewModel.getText().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer s) {
                textView.setText(s);
            }
        });
        return root;
    }
}