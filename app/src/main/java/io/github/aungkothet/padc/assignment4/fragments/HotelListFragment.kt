package io.github.aungkothet.padc.assignment4.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.aungkothet.padc.assignment4.R
import io.github.aungkothet.padc.assignment4.adapters.HotelListRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_hotel_list.*
import kotlinx.android.synthetic.main.fragment_hotel_list.view.*

class HotelListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_hotel_list, container, false)
        val adapter = HotelListRecyclerAdapter()
        val layoutManager = LinearLayoutManager(view.context)
        view.hotel_list_recyclerview.layoutManager = layoutManager
        view.hotel_list_recyclerview.adapter = adapter
        return view
    }


}
