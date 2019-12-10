package com.example.md1l1homework.homeWork4.ui.progress_bar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.md1l1homework.R;

public class ProgressBars extends Fragment {

    private GalleryViewModel progressBarsViewModel;
    private Button horizontalBarBtn, roundBarBtn;
    private ProgressBar horizontalBar, roundBar;
    private TextView textView;

//ToDo Спасибо за помощь. У меня оказывается в фрагментах был пробел. Теперь разобрался))))
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        progressBarsViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.hw4_fragment_progress_bars, container, false);
        initViews(root);

        progressBarsViewModel.getText().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer s) {
                textView.setText(s);
            }
        });

        getVisibleProgressBar(horizontalBarBtn, horizontalBar);
        getVisibleProgressBar(roundBarBtn, roundBar);
        return root;
    }

    private void initViews(View root) {
        textView = root.findViewById(R.id.text_progress_bars);
        horizontalBarBtn = root.findViewById(R.id.progress_bar_horizontal_btn);
        roundBarBtn = root.findViewById(R.id.progress_bar_round_btn);
        horizontalBar = root.findViewById(R.id.horizontal_progress_bar);
        roundBar = root.findViewById(R.id.round_progress_bar);
    }

    private void getVisibleProgressBar(Button button, final ProgressBar progressBar) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(progressBar.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
            }
        });
    }
}