package com.pritesh.kotlindemosample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        actionBar?.setDisplayHomeAsUpEnabled(true)
        txtHello.text = "Pritesh Patel";
        //txtHello.setText("Patel");
        a();


    }

    fun MainActivity.a()
    {
        txtHello.text = "From A";
    }
}
