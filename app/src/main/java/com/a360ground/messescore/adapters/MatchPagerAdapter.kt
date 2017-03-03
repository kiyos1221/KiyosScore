package com.a360ground.messescore.adapters

import android.support.v4.view.PagerAdapter
import android.view.View

/**
 * Created by Kiyos Solomon on 2/21/2017.
 */

class MatchPagerAdapter : PagerAdapter() {


    override fun getCount(): Int {
        return 4
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`;
    }

    override fun getPageTitle(position: Int): CharSequence {

        if (position == 0) {
            return "ጥር 12"
        }
        if (position == 1) {
            return "ጥር 24"
        }
        if (position == 2) {
            return "የካቲት 12"
        }
        if (position == 3) {
            return "መጋቢት 21"
        }
        return super.getPageTitle(position)
    }
}
