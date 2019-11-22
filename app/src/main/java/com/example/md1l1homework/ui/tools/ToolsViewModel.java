package com.example.md1l1homework.ui.tools;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.md1l1homework.R;

public class ToolsViewModel extends ViewModel {

    private MutableLiveData<Integer> mText;

    public ToolsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(R.string.text_for_fab_text_view);
    }

    public LiveData<Integer> getText() {
        return mText;
    }
}