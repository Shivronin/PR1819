package com.example.pr1819.ui.ponchic

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PonchicViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "\n" +
                "        По́нчик или пы́шка — круглое или кольцеобразное, жаренное во фритюре хлебобулочное изделие, с начинкой или без неё. Пончики с начинкой, преимущественно из овощей или фруктов, называются «бенье»."
    }
    val text: LiveData<String> = _text
}