package com.example.md1l1homework.homeWork4.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.md1l1homework.R;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<Integer> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(R.string.home_page);
    }

    public LiveData<Integer> getText() {
        return mText;
    }
}