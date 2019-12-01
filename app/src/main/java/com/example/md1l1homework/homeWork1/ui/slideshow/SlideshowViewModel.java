package com.example.md1l1homework.homeWork1.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.md1l1homework.R;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<Integer> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(R.string.text_for_fab_text_view);
    }

    public LiveData<Integer> getText() {
        return mText;
    }
}