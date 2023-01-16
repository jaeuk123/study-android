package com.example.study_android.adapter

import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.study_android.activity.MainActivity
import com.example.study_android.fragment.FirstFragment

class MainViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle,page:Int) : FragmentStateAdapter(fragmentManager,lifecycle) {
    val page = page

    override fun getItemCount(): Int {
        return page
    }

    override fun createFragment(position: Int): Fragment {
        return FirstFragment()
    }

}