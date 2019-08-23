package io.github.aungkothet.padc.assignment4.fragments


import android.os.Bundle
import android.support.design.widget.BottomSheetDialog
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.stfalcon.pricerangebar.model.BarEntry
import io.github.aungkothet.padc.assignment4.R
import io.github.aungkothet.padc.assignment4.adapters.SearchListRecyclerAdapter
import kotlinx.android.synthetic.main.filter_bottom_sheet.view.*
import kotlinx.android.synthetic.main.fragment_search.view.*


class SearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search, container, false)
        val lm_top_search = LinearLayoutManager(view.context, LinearLayout.HORIZONTAL, false)
        val lm_recent_search = LinearLayoutManager(view.context, LinearLayout.HORIZONTAL, false)
        view.rv_top_searches.layoutManager = lm_top_search
        view.rv_recent_searches.layoutManager = lm_recent_search
        val adapter = SearchListRecyclerAdapter()
        view.rv_top_searches.adapter = adapter
        view.rv_recent_searches.adapter = adapter

        view.btn_filter.setOnClickListener { v -> showFilterDialog(v) }
        return view
    }

    private fun showFilterDialog(view: View) {
        val dialogView = layoutInflater.inflate(R.layout.filter_bottom_sheet, null)
        val bottomSheetDialog = BottomSheetDialog(view.context)
        val barEntries = ArrayList<BarEntry>()

        val priceRangeBar = dialogView.priceSeekBar as com.stfalcon.pricerangebar.RangeBarWithChart
        barEntries.add(BarEntry(32.0f, 7.0f))
        barEntries.add(BarEntry(34.0f, 10.0f))
        barEntries.add(BarEntry(36.0f, 11.0f))
        barEntries.add(BarEntry(38.0f, 14.0f))
        barEntries.add(BarEntry(40.0f, 15.0f))

        priceRangeBar.setEntries(barEntries)
        dialogView.tv_cancel.setOnClickListener { bottomSheetDialog.dismiss() }


        bottomSheetDialog.setContentView(dialogView)
        bottomSheetDialog.show()
    }
}



