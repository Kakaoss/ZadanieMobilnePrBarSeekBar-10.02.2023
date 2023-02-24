package com.example.zadaniemobilneprbarseekbar_10022023

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val obraz1 = findViewById<ImageView>(R.id.obraz1)
        val obraz2 = findViewById<ImageView>(R.id.obraz2)
        val obraz3 = findViewById<ImageView>(R.id.obraz3)
        val Button_reset = findViewById<Button>(R.id.btnReset)
        val seekbarpion1 = findViewById<SeekBar>(R.id.seekBarpion1)
        val seekbarpion2 = findViewById<SeekBar>(R.id.seekBarpion2)
        val seekbarpion3 = findViewById<SeekBar>(R.id.seekBarpion3)
        val seekbarPoziom1 = findViewById<SeekBar>(R.id.seekBarpoziom1)
        val seekbarPoziom2 = findViewById<SeekBar>(R.id.seekBarpoziom2)
        val seekbarPoziom3 = findViewById<SeekBar>(R.id.seekBarpoziom3)
        val progressBarPion = findViewById<ProgressBar>(R.id.progressBarPion)
        val progressBarPoziom = findViewById<ProgressBar>(R.id.progressBarPoziom)



        Button_reset.setOnClickListener {
            seekbarpion1.progress = 100
            seekbarpion2.progress = 100
            seekbarpion3.progress = 100
            seekbarPoziom1.progress = 100
            seekbarPoziom2.progress = 100
            seekbarPoziom3.progress = 100
            progressBarPoziom.progress = 100
            progressBarPion.progress = 100
        }

        // FUNKCJE PION
        seekbarpion1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                obraz1.scaleY =  progress/100f
                changeProgressBarPion(progressBarPion,seekbarpion1,seekbarpion2,seekbarpion3);
            }

            override fun onStartTrackingTouch(seek: SeekBar?) {

            }

            override fun onStopTrackingTouch(seek: SeekBar?) {

            }
        })

        seekbarpion2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                obraz2.scaleY =  progress/100f
                changeProgressBarPion(progressBarPion,seekbarpion1,seekbarpion2,seekbarpion3);
            }

            override fun onStartTrackingTouch(seek: SeekBar?) {

            }

            override fun onStopTrackingTouch(seek: SeekBar?) {

            }
        })
        seekbarpion3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                obraz3.scaleY =  progress/100f
                changeProgressBarPion(progressBarPion,seekbarpion1,seekbarpion2,seekbarpion3);
            }

            override fun onStartTrackingTouch(seek: SeekBar?) {

            }

            override fun onStopTrackingTouch(seek: SeekBar?) {

            }
        })

        // FUNKCJE POZIOM

        seekbarPoziom1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                obraz1.scaleX =  progress/100f
                changeProgressBarPion(progressBarPion,seekbarpion1,seekbarpion2,seekbarpion3);
            }

            override fun onStartTrackingTouch(seek: SeekBar?) {

            }

            override fun onStopTrackingTouch(seek: SeekBar?) {

            }
        })
        seekbarPoziom2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                obraz2.scaleX =  progress/100f
                changeProgressBarPion(progressBarPion,seekbarpion1,seekbarpion2,seekbarpion3);
            }

            override fun onStartTrackingTouch(seek: SeekBar?) {

            }

            override fun onStopTrackingTouch(seek: SeekBar?) {

            }
        })
        seekbarPoziom3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                obraz3.scaleX =  progress/100f
                changeProgressBarPion(progressBarPion,seekbarpion1,seekbarpion2,seekbarpion3);
            }

            override fun onStartTrackingTouch(seek: SeekBar?) {

            }

            override fun onStopTrackingTouch(seek: SeekBar?) {

            }
        })


    }
    fun changeProgressBarPion(progressBarPion:ProgressBar,seekbarpion1:SeekBar,seekbarpion2:SeekBar,seekbarpion3:SeekBar){
        progressBarPion.progress = (seekbarpion1.progress + seekbarpion2.progress + seekbarpion3.progress)/3
    }
    fun changeProgressBarPoziom(progressBarPion:ProgressBar,seekbarPoziom1:SeekBar,seekbarPoziom2:SeekBar,seekbarPoziom3:SeekBar){
        progressBarPion.progress = (seekbarPoziom1.progress + seekbarPoziom2.progress + seekbarPoziom3.progress)/3
    }
}