package com.ashokvarma.appbundleinstaller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ashokvarma.appbundleinstaller.ui.home.HomeFragment

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, HomeFragment.newInstance())
                .commitNow()
        }
    }

}
