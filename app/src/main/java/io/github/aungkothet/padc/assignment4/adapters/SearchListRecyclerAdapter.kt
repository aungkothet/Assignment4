package io.github.aungkothet.padc.assignment4.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import io.github.aungkothet.padc.assignment4.R
import io.github.aungkothet.padc.assignment4.views.holders.HotelItemViewHolder

class SearchListRecyclerAdapter: RecyclerView.Adapter<HotelItemViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_search_hotel,parent,false)
        return HotelItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 9
    }

    override fun onBindViewHolder(p0: HotelItemViewHolder, p1: Int) {
    }
}
