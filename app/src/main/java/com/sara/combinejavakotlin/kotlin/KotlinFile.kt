package com.sara.combinejavakotlin.kotlin

import android.widget.TextView

class KotlinClass{
    fun fromKotlin(myTextView: TextView){
        val myText: String = "Come From Kotlin :)"
        myTextView.text = myText
    }
}