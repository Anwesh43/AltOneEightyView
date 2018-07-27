package com.anwesh.uiprojects.altoneeightylineview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.anwesh.uiprojects.aoelview.AOELView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view : AOELView = AOELView.create(this)
        fullScreen()
        view.addOnAnimationCompleteListener({createCompleteToast(it)}, {createResetToast(it)})
    }

    fun createToast(msg : String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    fun createCompleteToast(i : Int) {
        createToast("complete ${i}")
    }

    fun createResetToast(i : Int) {
        createToast("reset ${i}")
    }
}


fun MainActivity.fullScreen() {
    supportActionBar?.hide()
    window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
}