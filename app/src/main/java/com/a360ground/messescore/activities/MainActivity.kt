package com.a360ground.messescore.activities

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.design.widget.TabLayout
import android.support.v4.content.LocalBroadcastManager
import android.support.v4.view.GravityCompat
import android.support.v4.view.ViewPager
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.a360ground.messescore.R
import com.a360ground.messescore.adapters.HomeFragmentPagerAdapter
import com.a360ground.messescore.databases.CacheScoreManager
import com.a360ground.messescore.interfaces.ApiTopNews
import com.a360ground.messescore.models.News
import com.a360ground.messescore.network.NetworkRequest
import io.realm.Realm
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        title = "ኪዮስ ስኮር"

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        var networkRequest = NetworkRequest()

        Realm.init(this)

        val retrofit = networkRequest.getRetrofit()

        val apiTopNews = retrofit.create(ApiTopNews::class.java)

        val callAllNews = apiTopNews.getAllNews()

           callAllNews.enqueue(object : Callback<List<News>> {
                override fun onResponse(call: Call<List<News>>, response: Response<List<News>>) {

                    CacheScoreManager.insertNews(response.body())

                    var intent = Intent("content_loaded")

                    intent.putExtra("Loaded",true)

                    LocalBroadcastManager.getInstance(this@MainActivity).sendBroadcast(intent)

                }

                override fun onFailure(call: Call<List<News>>, t: Throwable) {
                    Toast.makeText(baseContext, t.printStackTrace().toString(), Toast.LENGTH_LONG).show()
                }
            })

        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout

        val toggle = ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.setDrawerListener(toggle)
        toggle.syncState()

        val navigationView = findViewById(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)

        val tabLayout = findViewById(R.id.tab_layout) as TabLayout

        val mainActivityViewpager = findViewById(R.id.main_activity_viewpager) as ViewPager

        var fragmentPagerAdater = HomeFragmentPagerAdapter(supportFragmentManager)

        mainActivityViewpager.adapter = fragmentPagerAdater

        Toast.makeText(this@MainActivity,(mainActivityViewpager.currentItem).toString(), Toast.LENGTH_SHORT ).show()

        tabLayout.setupWithViewPager(mainActivityViewpager)

    }

    override fun onBackPressed() {
        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val id = item.itemId

        if (id == R.id.nav_matches) {
            startActivity(Intent(this, MatchesActivity::class.java))
        } else if (id == R.id.nav_tables) {

        } else if (id == R.id.nav_stats) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_about) {

        }


        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

}
