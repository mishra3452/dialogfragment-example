package com.example.dialogfragment_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var sharedViewModel: SharedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedViewModel = ViewModelProvider(this).get(SharedViewModel::class.java)
        sharedViewModel.name.observe(this, Observer {
            tvName.text = it
        })


        btnSimpleDialog.setOnClickListener {
            SimpleDialog.newInstance(getString(R.string.label_logout), getString(R.string.msg_logout)).show(supportFragmentManager, SimpleDialog.TAG)
        }
        btnDataDialog.setOnClickListener {
            DialogWithData().show(supportFragmentManager, DialogWithData.TAG)
        }
    }

}