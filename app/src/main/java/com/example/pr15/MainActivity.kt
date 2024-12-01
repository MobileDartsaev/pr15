package com.example.pr15

import android.app.Activity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Получим ссылку на солнце
        val sunImageView = findViewById<ImageView>(R.id.sun)
        // Анимация для восхода солнца
        val sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sun_rise)
        // Подключаем анимацию к нужному View
        sunImageView.startAnimation(sunRiseAnimation)
        val clockImageView: ImageView = findViewById(R.id.clock)
// анимация для вращения часов
        val clockTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_turn)
        clockImageView.startAnimation(clockTurnAnimation)
        // Kotlin
// получим ссылку на часовую стрелку
        val hourImageView: ImageView = findViewById(R.id.hour_hand)
// анимация для стрелки
        val hourTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.hour_turn)
// присоединяем анимацию
        hourImageView.startAnimation(hourTurnAnimation)

    }
}