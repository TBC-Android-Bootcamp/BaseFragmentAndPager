package com.example.viewpagerhomework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    var itemView: View?=null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if(itemView==null){
            itemView=inflater.inflate(getresource(), container, false)
            start(inflater,container,savedInstanceState)
        }

        return  itemView

    }
    abstract  fun start(inflater: LayoutInflater,
                        container: ViewGroup?,
                        savedInstanceState: Bundle?)

    abstract  fun getresource():Int
}