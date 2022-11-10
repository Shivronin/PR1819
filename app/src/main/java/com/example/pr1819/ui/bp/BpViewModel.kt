package com.example.ivanov_pr1819_mobil.ui.bp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BpViewModel : ViewModel(){
    private val _text = MutableLiveData<String>().apply {
        value = "        Очень важный компонент компьютера. Он подключается к электросети и служит для снабжения постоянным током всех других компонентов компьютера, преобразуя сетевое напряжения до требуемых значений. А устройства компьютера работают на напряжениях: +3.3В, +5В, +12В. Отрицательные напряжения практически не используются. Основной характеристикой блока питания является его мощность и измеряется, соответственно, в Ваттах. В компьютер ставится блок питания с такой мощностью, чтобы её хватило для питания всех компонентов компьютера. Больше всего будет потреблять видеоадаптер (потребляемая им мощность будет обязательно указана в документации), поэтому ориентироваться нужно на него и брать просто с небольшим запасом. Также блок питания должен иметь все необходимые разъёмы для подключения ко всем имеющимся компонентам компьютера: материнской плате, процессору, HDD и SSD дискам, видеоадаптеру, дисководу."
    }
    val text: LiveData<String> = _text
}