package com.goodwilldev.modelviewapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
    private var counter_:MutableLiveData<Int> = MutableLiveData()

    init {
        counter_.postValue(0)
    }

    public fun getCount():LiveData<Int>{
        return counter_
    }
    public fun increment(){
        counter_.postValue(counter_.value!!+1)
    }
}