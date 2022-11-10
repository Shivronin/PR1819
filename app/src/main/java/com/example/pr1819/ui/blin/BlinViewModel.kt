package com.example.pr1819.ui.blin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BlinViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "\n" +
                "        Блины́ — блюдо русской кухни, выпекаемое из жидкого теста на сковороде.\n"
    }
    val text: LiveData<String> = _text
}