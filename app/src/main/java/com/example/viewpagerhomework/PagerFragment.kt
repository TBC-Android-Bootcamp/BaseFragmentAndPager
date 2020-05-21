package com.example.viewpagerhomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_pager.view.*

/**
 * A simple [Fragment] subclass.
 */
class PagerFragment(val image: Int, val position: Int) : Fragment() {
    lateinit var itemView: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        itemView = inflater.inflate(R.layout.fragment_pager, container, false)
        setImg()
        return itemView
    }

    private fun setImg(){
        itemView.imagez.setImageResource(image)
        itemView.position.text = position.toString()
    }

}
