package com.ashokvarma.devtools

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ashokvarma.devtools.ui.bundletool.BundleToolFragment

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, BundleToolFragment.newInstance())
                .commitNow()
        }
    }

}
