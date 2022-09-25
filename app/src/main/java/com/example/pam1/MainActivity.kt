package com.example.pam1

import android.os.Bundle
import android.annotation.SuppressLint
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity as AppCompatActivity1

class MainActivity : AppCompatActivity1() {

    var user_field: EditText? = null
    private var main_btn:  Button? = null
    private var result_info: TextView? = null


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user_field = findViewById(R.id.user_field)
        main_btn = findViewById(R.id.main_btn)
        result_info = findViewById(R.id.result_info)

        main_btn?.setOnClickListener {
            if(user_field?.text?.toString()?.trim()?.equals("")!!)
                Toast.makeText(this,"Introduceti textul", Toast.LENGTH_LONG).show()
            else {
                var cuvinte  = 0
                for( cuvint in user_field?.text.toString().split("")){
                    if(cuvint.contains('a')|| cuvint.contains('A'))cuvinte++
                }
                result_info?.text = "Nr de liter a: $cuvinte"
            }
        }

    }
}