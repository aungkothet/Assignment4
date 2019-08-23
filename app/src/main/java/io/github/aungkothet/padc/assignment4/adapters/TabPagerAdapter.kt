package io.github.aungkothet.padc.assignment4.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import io.github.aungkothet.padc.assignment4.fragments.HotelListFragment

class TabPagerAdapter(fm: FragmentManager?): FragmentStatePagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment {
        return HotelListFragment()
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0-> "NearBy"
            1-> "Popular"
            else-> "All"
        }
    }
}