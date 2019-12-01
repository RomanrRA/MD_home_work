package com.example.md1l1homework.homeWork1.ui.share;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.md1l1homework.R;

public class ShareViewModel extends ViewModel {

    private MutableLiveData<Integer> mText;

    public ShareViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(R.string.text_for_fab_text_view);
    }

    public LiveData<Integer> getText() {
        return mText;
    }
}