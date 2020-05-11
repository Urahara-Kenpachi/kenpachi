package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league2.*

class LeagueActivity : BaseActivity() {
        var selectedleague= ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league2)
    }

    fun onMensClicked(view: View){
        women.isChecked=false
        co_ed.isChecked=false

        selectedleague="mens"
    }

    fun onWomenClicked(view: View){
        mens.isChecked=false
        co_ed.isChecked=false

        selectedleague="women"
    }

    fun onCoedClicked(view: View){
        mens.isChecked=false
        women.isChecked=false

        selectedleague="coed"
    }

    fun leagueNextClicked(view: View) {
        if( selectedleague != ""){
            val skillActivity= Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedleague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }

    }
}
