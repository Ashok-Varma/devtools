package com.ashokvarma.androidbundletoolhelper

import com.android.tools.build.bundletool.BundleToolMain


/**
 * Class description
 *
 * @author ashok
 * @version 1.0
 * @since 10/11/18
 */
class BundleToolHelper(
    private val bundlePath: String,
    private val bundleName: String,
    private val apkPath: String,
    private val apkName: String
) {

    fun generateAPKBundle() {
        val arguments = arrayOf(
            "build-apks",
            "--bundle=$bundlePath/$bundleName",
            "--output=$apkPath/$apkName",
            "--universal"
        )
        BundleToolMain.main(arguments)
    }
}