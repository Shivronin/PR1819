package com.example.pr1819.ui.pechenie

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PechenieViewModel : ViewModel(){
    private val _text = MutableLiveData<String>().apply {
        value = "\n" +
                "        Пече́нье (англ. cookie) — небольшие мучные кондитерские изделия различной формы и пониженной влажности. Выпекается из различных видов теста."
    }
    val text: LiveData<String> = _text
}