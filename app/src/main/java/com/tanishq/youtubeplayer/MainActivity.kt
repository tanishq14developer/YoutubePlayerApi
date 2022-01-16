package com.tanishq.youtubeplayer

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.view.View
import com.google.android.youtube.player.YouTubeInitializationResult


class MainActivity : AppCompatActivity() {
//    lateinit var youtube : YouTubePlayerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        youtube = findViewById(R.id.ytPlayer)
//        youtube.initialize(getString(R.string.api_key),
//            object : YouTubePlayer.OnInitializedListener {
//                override fun onInitializationSuccess(
//                    provider: YouTubePlayer.Provider?,
//                    youTubePlayer: YouTubePlayer, b: Boolean
//                ) {
//                    youTubePlayer.loadVideo("HzeK7g8cD0Y")
//                    youTubePlayer.play()
//                }
//
//                override fun onInitializationFailure(
//                    provider: YouTubePlayer.Provider?,
//                    youTubeInitializationResult: YouTubeInitializationResult?
//                ) {
//                    Toast.makeText(applicationContext, "Video player Failed", Toast.LENGTH_SHORT)
//                        .show()
//                }
//            })


//        initializing and adding YouTubePlayerFragment
        val fm = getFragmentManager ()
        val tag = com.google.android.youtube.player.YouTubePlayerSupportFragmentX::class.java.getSimpleName();
        var playerFragment =fm.findFragmentById(R.id.ytPlayer) as com.google.android.youtube.player.YouTubePlayerSupportFragmentX
        if (playerFragment == null) {
            val ft = fm . beginTransaction ();
            playerFragment = com.google.android.youtube.player.YouTubePlayerSupportFragmentX.newInstance();
            ft.add(android.R.id.content, playerFragment, tag);
        }
        playerFragment.initialize(getString(R.string.api_key), object : com.google.android.youtube.player.YouTubePlayer.OnInitializedListener {

//            override fun onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//                youTubePlayer.cueVideo(VIDEO_ID);
//            }
//            @Override
//            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//                Toast.makeText(YouTubePlayerFragmentActivity.this, "Error while initializing YouTubePlayer.", Toast.LENGTH_SHORT).show();
//            }

            override fun onInitializationSuccess(
                p0: com.google.android.youtube.player.YouTubePlayer.Provider?,
                p1: com.google.android.youtube.player.YouTubePlayer?,
                p2: Boolean
            ) {
                p1?.cueVideo("_N6j8HXPt2U");
            }

            override fun onInitializationFailure(
                p0: com.google.android.youtube.player.YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                if (p1 != null) {
                Log.d("error", "onInitializationFailure: " + p1.name)
            }
            }
        })
    }

//
//    youtubePlayer.initialize(getString(R.string.api_key), object : com.google.android.youtube.player.YouTubePlayer.OnInitializedListener{
//        override fun onInitializationSuccess(
//            p0: com.google.android.youtube.player.YouTubePlayer.Provider?,
//            p1: com.google.android.youtube.player.YouTubePlayer?,
//            p2: Boolean
//        ) {
//            if (!p2) {
//                p1?.cueVideo("_N6j8HXPt2U")
//            }
//        }
//
//        override fun onInitializationFailure(
//            p0: com.google.android.youtube.player.YouTubePlayer.Provider?,
//            p1: YouTubeInitializationResult?
//        ) {
//            if (p1 != null) {
//                Log.d("error", "onInitializationFailure: " + p1.name)
//            }
//        }
//    })
//

    }





