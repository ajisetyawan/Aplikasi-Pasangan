package com.example.ahmadajinursetyawan.aplikasipasangan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMatch.setOnClickListener { carijodoh() }
    }

    fun carijodoh() {
        val randomDora = Random().nextInt(5)+1
        val randomemon = Random().nextInt(5)+1
        val drawableResDora = when (randomDora){
            1 ->R.drawable.deni_mobile
            2 ->R.drawable.didik_mobile
            3 ->R.drawable.eggy_mobile
            4 ->R.drawable.huda_mobile
            5 ->R.drawable.iav_mobile
            else -> R.drawable.riki_mobile
        }

        val drawableResemon = when (randomemon){
            1 ->R.drawable.ayu_mobile
            2 ->R.drawable.faliz_mobile
            3 ->R.drawable.fuji_mobile
            4 ->R.drawable.hanum_mobile
            5 ->R.drawable.mela_mobile
            else -> R.drawable.umi_mobile

        }

        huda1.setImageResource(drawableResDora)
        ayu1.setImageResource(drawableResemon)

    }
}
