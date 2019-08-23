package io.github.aungkothet.padc.assignment4.fragments

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import io.github.aungkothet.padc.assignment4.R
import io.github.aungkothet.padc.assignment4.adapters.TabPagerAdapter
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val tabPagerAdapter = TabPagerAdapter(activity?.supportFragmentManager)
        view.viewPager.adapter = tabPagerAdapter
        view.tabLayout.setupWithViewPager(view.viewPager)

        return view

    }

}
