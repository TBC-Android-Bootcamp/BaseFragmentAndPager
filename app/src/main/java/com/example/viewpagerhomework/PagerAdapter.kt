package com.example.viewpagerhomework

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

open class PagerAdapter(fm: FragmentManager, behavior:Int): FragmentStatePagerAdapter(fm,behavior) {

    var imageList = mutableListOf<Int>()

    override fun getItem(position: Int): Fragment {
        return PagerFragment(imageList[position],position)
    }

    override fun getCount(): Int = imageList.size
}