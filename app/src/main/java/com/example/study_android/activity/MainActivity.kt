package com.example.study_android.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.study_android.adapter.MainViewPagerAdapter
import com.example.study_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding? = null
    private val bind get() = binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.mainPager.adapter = MainViewPagerAdapter(supportFragmentManager,lifecycle,2)
        bind.mainPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}