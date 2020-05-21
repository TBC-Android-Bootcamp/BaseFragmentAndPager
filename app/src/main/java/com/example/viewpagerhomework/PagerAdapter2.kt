package com.example.viewpagerhomework

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.fragment_pager.view.*
import kotlinx.android.synthetic.main.pager_two.view.*

class PagerAdapter2(fm: FragmentManager, behavior: Int) : PagerAdapter(fm, behavior) {

    var imgList= mutableListOf<Int>()

    override fun getCount():Int=imgList.size

    override fun isViewFromObject(view: View, itemiew: Any): Boolean {
        return view==itemiew

    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val itemview=LayoutInflater.from(container.context).inflate(R.layout.pager_two,container,false)
        container.addView(itemview)
        itemview.position.text=position.toString()
        itemview.image.setImageResource(imgList[position])
        return itemview
    }

    override fun destroyItem(container: ViewGroup, position: Int, itemiew: Any) {
        container.removeView(itemiew as View)
    }



}