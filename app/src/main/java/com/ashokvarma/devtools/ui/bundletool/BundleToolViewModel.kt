package com.ashokvarma.devtools.ui.bundletool

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BundleToolViewModel : ViewModel() {

    private val inputPath: MutableLiveData<String> = MutableLiveData()

    fun setInputPath(path: String) {
        inputPath.value = path
    }
}
