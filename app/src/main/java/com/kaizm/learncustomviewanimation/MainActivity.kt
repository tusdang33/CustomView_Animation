package com.kaizm.learncustomviewanimation

import android.graphics.Color
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.kaizm.learncustomviewanimation.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cView.setOnClickListener {
            (it as MyCustomView).changeColor(Color.CYAN)
        }

        binding.btnBlink.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(
                this, R.anim.blink_anim
            )
            binding.cView.startAnimation(animation)
        }

        binding.btnFade.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(
                this, R.anim.fade_anim
            )
            binding.cView.startAnimation(animation)
        }

        binding.btnMove.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(
                this, R.anim.move_anim
            )
            binding.cView.startAnimation(animation)
        }

        binding.btnRotate.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(
                this, R.anim.rotate_anim
            )
            binding.cView.startAnimation(animation)
        }

        binding.btnSlide.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(
                this, R.anim.slide_anim
            )
            binding.cView.startAnimation(animation)
        }

        binding.btnZoom.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(
                this, R.anim.zoom_anim
            )
            binding.cView.startAnimation(animation)
        }
    }
}