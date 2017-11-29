package com.example.monkey.floatingactionbuttonsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v4.content.ContextCompat
import android.support.v4.content.res.ResourcesCompat
import android.support.v7.appcompat.R.attr.color
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.security.AccessController.getContext
import android.widget.Toast
import android.R.id.button1



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fabActivityMain.setOnLongClickListener(View.OnLongClickListener {
            fabActivityMain.setImageResource(R.drawable.ic_launcher_background)
            true    // 戻り値をtrueにするとOnClickイベントは発生しない
        })
    }
}
