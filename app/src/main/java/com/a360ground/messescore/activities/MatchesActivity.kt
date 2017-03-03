package com.a360ground.messescore.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.a360ground.messescore.R

class MatchesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matches)
        title = "ጨዋታዎች"
    }
}