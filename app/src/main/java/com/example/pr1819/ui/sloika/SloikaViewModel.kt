package com.example.pr1819.ui.sloika

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SloikaViewModel: ViewModel()  {
    private val _text = MutableLiveData<String>().apply {
        value = "\n" +
                "       Слойка — слоёный пирожок, кулинарное изделие (выпечка) из слоёного теста. Кондитерское профессиональное наименование любого слоёного теста. "
    }
    val text: LiveData<String> = _text
}