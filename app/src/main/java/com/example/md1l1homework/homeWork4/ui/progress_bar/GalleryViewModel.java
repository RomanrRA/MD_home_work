package com.example.md1l1homework.homeWork4.ui.progress_bar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.md1l1homework.R;


public class GalleryViewModel extends ViewModel {

    private MutableLiveData<Integer> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(R.string.progress_bars_page);
    }

    public LiveData<Integer> getText() {
        return mText;
    }
}