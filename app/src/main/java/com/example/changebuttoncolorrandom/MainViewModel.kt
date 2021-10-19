package com.example.changebuttoncolorrandom

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val color = MutableLiveData<MyColor>()

    fun changeColorRandomly(){
    color.postValue(MyColor.values().random()
    )
    }

}