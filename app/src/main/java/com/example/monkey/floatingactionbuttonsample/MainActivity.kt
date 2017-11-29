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
import android.util.Log


class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 長押しでアイコンを変更
        fabActivityMain.setOnLongClickListener(View.OnLongClickListener {
            if (fabActivityMain.drawable.constantState.equals(resources.getDrawable(R.drawable.ic_vertical_align_bottom_black_24dp).constantState)) {
                Log.d(TAG, "match")
                fabActivityMain.setImageResource(R.drawable.ic_vertical_align_top_black_24dp)
            } else {
                Log.d(TAG, "not match")
                fabActivityMain.setImageResource(R.drawable.ic_vertical_align_bottom_black_24dp)
            }
            true    // 戻り値をtrueにするとOnClickイベントは発生しない
        })

        // アイコンの状態で動作を変更
        fabActivityMain.setOnClickListener {
            if (fabActivityMain.drawable.constantState.equals(resources.getDrawable(R.drawable.ic_vertical_align_bottom_black_24dp).constantState)) {
                Log.d(TAG, "Insert to bottom")
            } else {
                Log.d(TAG, "Insert to Top")
            }
        }
    }
}
