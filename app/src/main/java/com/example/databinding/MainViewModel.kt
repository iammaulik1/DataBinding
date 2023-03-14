package com.example.databinding

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var text = "Welcome to my application"

    fun updateText(){
        text = "Text is updated"
    }
}
