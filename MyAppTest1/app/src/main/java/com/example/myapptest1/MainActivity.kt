package com.example.myapptest1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* 코틀린 문법 */

        /* 로그를 이용하여 출력결과 확인 */
        Log.d("kotlin", "코틀린 문법을 배웁니다.")
    }
}