package com.example.pr1819.ui.pirog

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PirogViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "\n" +
                "       Пиро́г — хлебобулочное изделие из теста с начинкой, которое выпекается или жарится. Начинка для пирогов может быть сладкой (ягоды, фрукты, творог, мак) или несладкой (рыба, мясной фарш, печень, картофель, грибы и т. д.). Масса пирога от 0,5 кг и выше. "
    }
    val text: LiveData<String> = _text
}