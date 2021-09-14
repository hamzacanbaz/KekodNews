package com.canbazdev.kekodnews.view

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.canbazdev.kekodnews.R
import com.canbazdev.kekodnews.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private var _binding: ActivitySplashBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
//        _binding = ActivitySplashBinding.inflate(layoutInflater)


        val slideAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha)
        binding.kekodNews.startAnimation(slideAnimation)

        object : CountDownTimer(3800, 1000) {
            override fun onTick(p0: Long) {
            }

            override fun onFinish() {
                val intents = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intents)
                finish()
            }

        }.start()

    }
}
