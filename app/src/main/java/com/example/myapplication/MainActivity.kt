package com.example.myapplication

import android.graphics.Color
import android.graphics.Color.green
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged

class MainActivity : AppCompatActivity() {


    var resultvalue:Int=0
    fun addValue(num:Int){
        resultvalue+=num
        checkEquality()

    }
    fun removeValue(num:Int){
        resultvalue-=num
        checkEquality()

    }

    fun checkEquality(){
        val numVal: TextView =findViewById(R.id.numVal)
        val result: TextView =findViewById(R.id.result)

        val color: View =findViewById(R.id.color)
        if(numVal.text.toString()==resultvalue.toString()){
            color.setBackgroundColor(Color.GREEN )
            result.setText(resultvalue.toString(2))
        }else{color.setBackgroundColor(Color.RED )
            result.setText(resultvalue.toString(2))}
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        (this as? AppCompatActivity)?.supportActionBar?.title = "BINARY CHECK"

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switch0: Switch = findViewById(R.id.switch0)
        val switch1: Switch = findViewById(R.id.switch1)
        val switch2: Switch = findViewById(R.id.switch2)
        val switch3: Switch = findViewById(R.id.switch3)
        val switch4: Switch = findViewById(R.id.switch4)
        val switch5: Switch = findViewById(R.id.switch5)
        val switch6: Switch = findViewById(R.id.switch6)
        val switch7: Switch = findViewById(R.id.switch7)

        val numVal: TextView =findViewById(R.id.numVal)



        switch0.setOnCheckedChangeListener { _, isChecked -> if (isChecked) {addValue(1)} else { removeValue(1)} }
        switch1.setOnCheckedChangeListener { _, isChecked -> if (isChecked) {addValue(2)} else { removeValue(2)} }
        switch2.setOnCheckedChangeListener { _, isChecked -> if (isChecked) {addValue(4)} else { removeValue(4)} }
        switch3.setOnCheckedChangeListener { _, isChecked -> if (isChecked) {addValue(8)} else { removeValue(8)} }
        switch4.setOnCheckedChangeListener { _, isChecked -> if (isChecked) {addValue(16)} else { removeValue(16)} }
        switch5.setOnCheckedChangeListener { _, isChecked -> if (isChecked) {addValue(32)} else { removeValue(32)} }
        switch6.setOnCheckedChangeListener { _, isChecked -> if (isChecked) {addValue(64)} else { removeValue(64)} }
        switch7.setOnCheckedChangeListener { _, isChecked -> if (isChecked) {addValue(128)} else { removeValue(128)} }





    }
}