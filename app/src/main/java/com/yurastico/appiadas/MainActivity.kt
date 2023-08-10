package com.yurastico.appiadas

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.yurastico.appiadas.databinding.ActivityMainBinding
import java.util.Random


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        //setContentView(R.layout.activity_main)
        setContentView(binding.root)
        binding.btTellJoker.setOnClickListener {
            //Toast.makeText(this,"mama", Toast.LENGTH_LONG).show()
            buttonTapped()

        }


    }
    private fun buttonTapped() {
        val jokers = resources.getStringArray(R.array.jokers)
        val number = Random().nextInt(jokers.size)
        val joker = jokers[number]
        binding.tvJoker.text = joker
        playSong()
    }

    private fun playSong() {
        val mediaPlayer = MediaPlayer.create(this, R.raw.badumtss)
        mediaPlayer.start()
    }
}