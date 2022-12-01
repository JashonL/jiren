package com.ljs.jiren

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.ljs.jiren.databinding.ActivityMainBinding
import android.view.View
import android.view.WindowManager
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        actionBar?.hide()
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        //这里是修改状态栏颜色
//        window.statusBarColor = ContextCompat.getColor(this,R.color.teal_700)



        val decorView = window.decorView
        val option = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.systemUiVisibility = option;



    }
}