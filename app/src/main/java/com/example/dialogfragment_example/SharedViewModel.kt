package com.example.dialogfragment_example

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    val name = MutableLiveData<String>()

    fun sendName(text: String) {
        name.value = text
    }
}