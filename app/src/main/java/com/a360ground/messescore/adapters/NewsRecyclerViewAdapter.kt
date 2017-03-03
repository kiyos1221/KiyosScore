package com.a360ground.messescore.adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import com.a360ground.messescore.R
import com.a360ground.messescore.activities.DetailActivity
import com.a360ground.messescore.models.News
import com.squareup.picasso.Picasso

/**
 * Created by Kiyos Solomon on 2/27/2017.
 */

class NewsRecyclerViewAdapter(internal var newsList: List<News>, internal var context: Context) : RecyclerView.Adapter<NewsRecyclerViewAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_news, parent, false)

        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news = newsList[position]
        holder.newsTitle.text = news.title
        holder.newsDesc.text = Html.fromHtml(news.content)
        holder.newsCat.text = news.categoryName
        Picasso.with(context).load(news.featuredImageUrl?.replace("localhost", "192.168.137.1")).fit().into(holder.newsFeatured)
        holder.newsMore.setOnClickListener { view ->
            var intent = Intent(context, DetailActivity::class.java);

            intent.putExtra("title",news.title)
            intent.putExtra("featured",news.featuredImageUrl)
            intent.putExtra("content",news.content)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    inner class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var newsTitle: TextView

        var newsDesc:  TextView

        var newsMore: TextView

        var newsShare: TextView

        var newsFeatured: ImageView

        var newsCat: TextView

        init {

            newsMore = itemView.findViewById(R.id.more) as TextView
            newsShare = itemView.findViewById(R.id.share) as TextView
            newsTitle = itemView.findViewById(R.id.news_title) as TextView
            newsDesc = itemView.findViewById(R.id.news_desc) as TextView
            newsFeatured = itemView.findViewById(R.id.news_featured) as ImageView
            newsCat = itemView.findViewById(R.id.news_cat) as TextView

        }
    }
}
