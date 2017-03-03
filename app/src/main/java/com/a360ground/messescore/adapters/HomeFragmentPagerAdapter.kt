package com.a360ground.messescore.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.a360ground.messescore.fragments.EntertainmentFragment

import com.a360ground.messescore.fragments.NewsFragment
import com.a360ground.messescore.fragments.TransferFragment


class HomeFragmentPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

        if (position == 0) {
            return NewsFragment()
        }
        if (position == 1) {
            return TransferFragment()
        }
        if (position == 2) {
            return EntertainmentFragment()
        }
        throw RuntimeException("Unable to return the fragment")
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        if (position == 0)
            return "ዜና"
        if (position == 1)
            return "ዝውውር"
        if (position == 2)
            return "መዝናኛ"
        return super.getPageTitle(position)
    }
}
