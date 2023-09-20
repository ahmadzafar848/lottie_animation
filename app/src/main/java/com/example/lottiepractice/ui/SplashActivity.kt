package com.example.lottiepractice.ui

import android.animation.Animator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.airbnb.lottie.LottieAnimationView
import com.example.lottiepractice.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val anim=findViewById<LottieAnimationView>(R.id.splashAnim)
        anim.playAnimation()
        anim.addAnimatorListener(object :Animator.AnimatorListener{
            override fun onAnimationStart(p0: Animator) {
                Log.d("Ahmad", "onAnimationStart: ")
            }

            override fun onAnimationEnd(p0: Animator) {
                val intent=Intent(this@SplashActivity,MainActivity::class.java)
                startActivity(intent)
                finish()

            }

            override fun onAnimationCancel(p0: Animator) {
                Log.d("Ahmad", "onAnimationStart: ")
                TODO("Not yet implemented")
            }

            override fun onAnimationRepeat(p0: Animator) {
                Log.d("Ahmad", "onAnimationStart: ")
                TODO("Not yet implemented")
            }

        })

    }
}