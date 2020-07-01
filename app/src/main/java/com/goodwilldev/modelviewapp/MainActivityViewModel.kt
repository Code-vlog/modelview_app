package com.goodwilldev.modelviewapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel :ViewModel() {
    private var counter:MutableLiveData<Int> = MutableLiveData()

    init {
        counter.postValue(0)
    }

    public fun getCount(): LiveData<Int> {
        return counter
    }

    public fun SetCount(){
        counter.postValue(counter.value!!+1)
    }
}