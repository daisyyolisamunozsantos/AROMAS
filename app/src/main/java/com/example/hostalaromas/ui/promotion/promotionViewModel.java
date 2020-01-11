package com.example.hostalaromas.ui.promotion;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class promotionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public promotionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is prommotion fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}