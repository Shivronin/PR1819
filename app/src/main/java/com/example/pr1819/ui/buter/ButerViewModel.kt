package com.example.pr1819.ui.buter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ButerViewModel: ViewModel()  {
    private val _text = MutableLiveData<String>().apply {
        value =  "\n" +
                "            Бутербро́д (от нем. Butterbrot — «хлеб с маслом») — ломтик хлеба или булки с намазанной или уложенной сверху начинкой из какого-либо продукта, готового к употреблению (например масла, сыра, колбасы) или их сочетания. Популярный вид закуски благодаря простоте приготовления, удобству поедания и переноски. Бутерброды не подлежат длительному хранению, так как быстро высыхают, теряя во вкусе и внешнем виде.\n"
        }
    val text: LiveData<String> = _text
}