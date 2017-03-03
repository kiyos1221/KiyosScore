package com.a360ground.messescore.fragments

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.content.LocalBroadcastManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.a360ground.messescore.R
import com.a360ground.messescore.activities.MainActivity
import com.a360ground.messescore.adapters.NewsRecyclerViewAdapter
import com.a360ground.messescore.databases.CacheScoreManager
import com.a360ground.messescore.interfaces.ILoadingDone
import com.a360ground.messescore.models.News
import com.a360ground.messescore.utils.NewtworkUtils
import com.cooltechworks.views.shimmer.ShimmerRecyclerView
import com.squareup.picasso.Picasso
import com.synnapps.carouselview.CarouselView
import io.realm.Realm
import io.realm.RealmChangeListener


/**
 * A simple [Fragment] subclass.
 */
class NewsFragment : Fragment(), ILoadingDone {
    override fun doneLoading(loaded: Boolean) {

    }


    var newsList: List<News>? = null

    var recyclerView: ShimmerRecyclerView? = null

    var topNews:CarouselView? = null

    var realm: Realm? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        Realm.init(activity)

        realm = Realm.getDefaultInstance()

        val view = inflater!!.inflate(R.layout.fragment_news, container, false)

        topNews = view!!.findViewById(R.id.top_news) as CarouselView

        recyclerView = view.findViewById(R.id.latest_news_recycler_view) as ShimmerRecyclerView

        recyclerView!!.isNestedScrollingEnabled = false

        recyclerView!!.showShimmerAdapter()

        var news = realm?.where(News::class.java)?.findAllAsync()

        news?.addChangeListener { realmResults->
            Toast.makeText(activity, "Changer Listened", Toast.LENGTH_SHORT).show()
        }

        loadData()

        return view
    }

    fun loadData(){
        topNews?.setViewListener { position ->

            var topNewsView = LayoutInflater.from(activity).inflate(R.layout.single_carousel, null, false)

            var topNewsImage = topNewsView.findViewById(R.id.carouselImage) as ImageView

            LocalBroadcastManager.getInstance(activity).registerReceiver(broadcastManager, IntentFilter("content_loaded"))

            var topNewsTitle = topNewsView.findViewById(R.id.newsHeadline) as TextView

            var news = CacheScoreManager.getNewsByCategory(19)[position]

            topNewsTitle.text = news.title

            Picasso.with(activity).load(news.featuredImageUrl?.replace("localhost", "192.168.137.1")).fit().into(topNewsImage)

            return@setViewListener topNewsView

        }

        recyclerView!!.adapter = NewsRecyclerViewAdapter(CacheScoreManager.getAllNews(),activity)

        recyclerView!!.hideShimmerAdapter()

        recyclerView!!.layoutManager = LinearLayoutManager(activity)

        topNews?.pageCount = CacheScoreManager.getNewsByCategory(19).size
    }

    private var broadcastManager = object : BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
            Toast.makeText(context, "Content Loaded Successfully :)",Toast.LENGTH_SHORT).show()
           loadData()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        realm?.close()
    }

}// Required empty public constructor
