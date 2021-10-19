package com.example.changebuttoncolorrandom

import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter


@BindingAdapter(value = ["myColor"])
fun setMyColor(view: View,myColor: MyColor?){
    when(myColor){
        MyColor.RED -> view.setBackgroundColor(ContextCompat.getColor(view.context,R.color.red))
        MyColor.YELLOW -> view.setBackgroundColor(ContextCompat.getColor(view.context,R.color.yellow))
        MyColor.BLUE ->view.setBackgroundColor(ContextCompat.getColor(view.context,R.color.blue))
    }

}