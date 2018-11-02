package cz.ackee.testing.demo1

import android.os.Bundle

class Bundlerer {

    private val bundle = Bundle()

    fun putString(key: String, value: String) {
        bundle.putString(key, value)
    }

    fun getString(key: String): String? {
        return bundle.getString(key)
    }
}