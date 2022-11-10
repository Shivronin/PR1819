package com.example.pr1819.ui.xleb

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class XlebViewModel: ViewModel()  {
    private val _text = MutableLiveData<String>().apply {
        value = "\n" +
                "       Хлеб — хлебобулочное изделие, получаемое путём выпекания теста (состоящего как минимум из муки и воды), разрыхлённого дрожжами или закваской. Согласно российскому ГОСТу, к хлебу относят хлебобулочные изделия с массой более 500 г с влажностью не менее 19 % (по терминологии ГОСТ 32677-2014[3]). "
    }
    val text: LiveData<String> = _text
}