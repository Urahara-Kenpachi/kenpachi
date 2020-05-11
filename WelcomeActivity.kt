package com.example.swoosh

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.welcome_activity.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_activity)

        getStartedBtn.setOnClickListener {
            val leagueIntent=Intent(this, WelcomeActivity::class.java)
            startActivity(leagueIntent)
        }
    }

}
