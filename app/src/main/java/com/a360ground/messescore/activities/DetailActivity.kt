package com.a360ground.messescore.activities

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import com.a360ground.messescore.R
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val intent = intent

        val title = intent.getStringExtra("title")

        val content = intent.getStringExtra("content").replace("localhost", "192.168.137.1")

        val featuredImageUrl = intent.getStringExtra("featured").replace("localhost", "192.168.137.1")

        val featuredImage = findViewById(R.id.news_featured_detail) as ImageView

        Picasso.with(this@DetailActivity).load(featuredImageUrl).fit().into(featuredImage)

        val detail = findViewById(R.id.webView_detail) as WebView

        detail.setWebChromeClient(WebChromeClient())

        detail.setWebViewClient(WebViewClient())

        detail.settings.javaScriptEnabled = true

        detail.loadData(content, "text/html; charset=UTF-8", null)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        supportActionBar!!.title = title
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }

        return true
    }
}
