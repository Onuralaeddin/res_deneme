package com.example.myapplication.ui.reflow;

import android.widget.Button;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReflowViewModel extends ViewModel {

    private final MutableLiveData<String> mText;



    public ReflowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("hello");
    }



    public LiveData<String> getText() {
        return mText;
    }
}