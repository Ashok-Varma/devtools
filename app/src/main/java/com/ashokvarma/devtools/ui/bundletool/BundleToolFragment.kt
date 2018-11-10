package com.ashokvarma.devtools.ui.bundletool

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.ashokvarma.androidbundletoolhelper.BundleToolHelper
import com.ashokvarma.devtools.R

class BundleToolFragment : androidx.fragment.app.Fragment() {

    companion object {
        fun newInstance() = BundleToolFragment()
    }

    private lateinit var viewModel: BundleToolViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.bundle_tool_fragment, container, false)
        view
            .findViewById<View>(R.id.buildButton)
            .setOnClickListener {
                val path = context?.getExternalFilesDir("")?.absolutePath.toString()
                val bundlePath = path
                val bundleName = ""
                val apkPath = path
                val apkName = "myapp.apks"
                BundleToolHelper(bundlePath, bundleName, apkPath, apkName).generateAPKBundle()
            }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BundleToolViewModel::class.java)
    }

}
