package edu.csueb.android.temperature

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import java.lang.String


class MainActivity : Activity() {
    private var text: EditText? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById<View>(R.id.editText) as EditText
    }

    // this method is called at button click because we assigned the name to
    // the "OnClick property" of the button
    fun onClick(view: View) {
        if (view.id == R.id.button) {
            val celsiusButton =
                findViewById<View>(R.id.radioButton) as RadioButton
            val fahrenheitButton =
                findViewById<View>(R.id.radioButton1) as RadioButton
            if (text!!.text.length == 0) {
                Toast.makeText(
                    this, "Please enter a valid number",
                    Toast.LENGTH_LONG
                ).show()
                return
            }
            val inputValue = text!!.text.toString().toFloat()
            if (celsiusButton.isChecked) {
                text!!.setText(
                    String
                        .valueOf(ConverterUtil.convertFahrenheitToCelsius(inputValue))
                )
                celsiusButton.isChecked = false
                fahrenheitButton.isChecked = true
            } else {
                text!!.setText(
                    String
                        .valueOf(ConverterUtil.convertCelsiusToFahrenheit(inputValue))
                )
                fahrenheitButton.isChecked = false
                celsiusButton.isChecked = true
            }
        }
    }
}