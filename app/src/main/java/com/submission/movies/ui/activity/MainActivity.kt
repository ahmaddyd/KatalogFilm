package com.submission.movies.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.submission.movies.R
import com.submission.movies.viewAdapter.PagerAdapter
import com.submission.movies.ui.fragment.MoviesFragment
import com.submission.movies.ui.fragment.TvShowsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setViewPager()
    }

    private fun setViewPager() {
        val fragmentList = listOf(MoviesFragment(), TvShowsFragment())
        val tabTitle =
            listOf(resources.getString(R.string.movies), resources.getString(R.string.tv_show))
        viewPager2.adapter = PagerAdapter(fragmentList, this.supportFragmentManager, lifecycle)
        TabLayoutMediator(tabsLayout, viewPager2) { tab, position ->
            tab.text = tabTitle[position]
        }.attach()
    }
}