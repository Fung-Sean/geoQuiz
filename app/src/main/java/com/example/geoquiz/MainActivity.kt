package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_Button)

        trueButton.setOnClickListener {
            showSnackbar(R.string.correct_toast)
        }
        falseButton.setOnClickListener {
            showSnackbar(R.string.incorrect_toast)
        }
    }
    private fun showSnackbar(messageResId: Int) {
        val rootView = findViewById<View>(android.R.id.content)
        val snackbar = Snackbar.make(rootView, messageResId, Snackbar.LENGTH_SHORT)
        snackbar.show()
    }
}

