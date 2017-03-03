package com.a360ground.messescore.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.a360ground.messescore.R
import com.a360ground.messescore.activities.MainActivity
import com.a360ground.messescore.adapters.NewsRecyclerViewAdapter
import com.a360ground.messescore.databases.CacheScoreManager
import com.a360ground.messescore.interfaces.ILoadingDone
import com.a360ground.messescore.utils.NewtworkUtils
import com.cooltechworks.views.shimmer.ShimmerRecyclerView
import io.realm.Realm

class TransferFragment : Fragment(){

    var recyclerViewTransfer: ShimmerRecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Realm.init(activity)

        var ac = activity as MainActivity

        var view = inflater!!.inflate(R.layout.fragment_transfer, container, false)

        recyclerViewTransfer = view.findViewById(R.id.recycler_view_transfer) as ShimmerRecyclerView

        recyclerViewTransfer!!.isNestedScrollingEnabled = false

        recyclerViewTransfer!!.showShimmerAdapter()

        loadDataToRecycler()

        return view


    }

    fun loadDataToRecycler() {
        recyclerViewTransfer!!.adapter = NewsRecyclerViewAdapter(CacheScoreManager.getNewsByCategory(19), activity)

        recyclerViewTransfer!!.hideShimmerAdapter()

        recyclerViewTransfer!!.layoutManager = LinearLayoutManager(activity)
    }
}// Required empty public constructor
