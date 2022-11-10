package com.example.pr1819.ui.cruasan

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CruasanViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "\n" +
                "        Круасса́н (фр. croissant — «полумесяц») — небольшое мучное кондитерское изделие, булочка в форме полумесяца (рогалика) из слоёного теста. Очень популярный продукт французской кухни, подаётся на завтрак к кофе для взрослых или к какао («горячему шоколаду» по-французски) для детей; своеобразный символ этой страны.\n"
    }
    val text: LiveData<String> = _text
}