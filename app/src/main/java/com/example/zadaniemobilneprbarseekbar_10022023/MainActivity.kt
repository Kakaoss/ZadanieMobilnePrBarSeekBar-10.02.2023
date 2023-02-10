package com.example.zadaniemobilneprbarseekbar_10022023

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {

    private val StandardowaSzerokosc = 250;
    private val StandardowaWysokosc = 250;
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val obraz1 = findViewById<ImageView>(R.id.obraz1)
        val obraz2 = findViewById<ImageView>(R.id.obraz2)
        val obraz3 = findViewById<ImageView>(R.id.obraz3)
        val Button_reset = findViewById<Button>(R.id.btnReset)
        val seekbarpion1 = findViewById<SeekBar>(R.id.seekbarPion1)
        val seekbarpion2 = findViewById<SeekBar>(R.id.seekBarPion2)
        val seekbarpion3 = findViewById<SeekBar>(R.id.seekBarPion3)
        val seekbarPoziom1 = findViewById<SeekBar>(R.id.seekBarPoziom1)
        val seekbarPoziom2 = findViewById<SeekBar>(R.id.seekBarPoziom2)
        val seekbarPoziom3 = findViewById<SeekBar>(R.id.seekBarPoziom3)


        obraz1.layoutParams.height = StandardowaWysokosc
        obraz1.layoutParams.width = StandardowaSzerokosc
        obraz2.layoutParams.height = StandardowaWysokosc
        obraz2.layoutParams.width = StandardowaSzerokosc
        obraz3.layoutParams.height = StandardowaWysokosc
        obraz3.layoutParams.width = StandardowaSzerokosc


        seekbarpion1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
            obraz1.layoutParams.height = StandardowaWysokosc + progress
            }

            override fun onStartTrackingTouch(seek: SeekBar?) {

            }

            override fun onStopTrackingTouch(seek: SeekBar?) {

            }
        })
    }
}