package com.example.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var pager: ViewPager
    private lateinit var tab: TabLayout
    private lateinit var bar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            pager = findViewById(R.id.viewPager)
            tab = findViewById(R.id.tab_layout)
            bar = findViewById(R.id.toolbar)

            setSupportActionBar(bar)

            val adapter = ViewPagerAdapter(supportFragmentManager)

            // add fragment to the list
            adapter.addFragment(TurkishFragment(), "TUR")
            adapter.addFragment(EnglishFragment(), "ENG")
            adapter.addFragment(ArmenianFragment(), "ARM")
            adapter.addFragment(ChineseFragment(), "CHI")
            adapter.addFragment(GeorgianFragment(), "GEO")
            adapter.addFragment(HebrewFragment(), "HEB")
            adapter.addFragment(HindiFragment(), "HIN")
            adapter.addFragment(NorskFragment(), "NNO")
            adapter.addFragment(ThaiFragment(), "THA")
            adapter.addFragment(VietnameseFragment(), "VIE")

            // Adding the Adapter to the ViewPager
            pager.adapter = adapter

            // bind the viewPager with the TabLayout.
            tab.setupWithViewPager(pager)

    }
}