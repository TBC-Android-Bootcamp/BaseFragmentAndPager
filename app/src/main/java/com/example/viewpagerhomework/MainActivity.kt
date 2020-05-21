package com.example.viewpagerhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private  fun init(){

        val imageList= mutableListOf<Int>()
        imageList.add(R.mipmap.image1)
        imageList.add(R.mipmap.image2)
        imageList.add(R.mipmap.image3)
        imageList.add(R.mipmap.image4)
        imageList.add(R.mipmap.image5)
        imageList.add(R.mipmap.image6)

        //val adapter=PagerAdapter(supportFragmentManager,1)
        //adapter.imageList=imageList
        //viewPager.adapter=adapter

        val adapter=PagerAdapter2(supportFragmentManager,1)
        adapter.imgList=imageList
        viewPager.adapter= adapter

        add.setOnClickListener(){
            val randomPosition:Int=(0 until imageList.size).random()
            imageList.add(imageList[randomPosition])
            adapter.notifyDataSetChanged()
        }
    }
}
