package com.example.kotlinsyntax

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. immutable 컬렉션 형태로 List 컬렉션 생성
        var dayList = listOf("월요일","화요일","수요일")

        for(day in dayList) {
            Log.d("dayList","$day")
        }

        //test 함수 호출
        var result = test("홍길동", 20)
        Log.d("test","$result")

        //Person 클래스 생성
        var hong = Person()
        hong.printName()
        hong.printAge()

        //Person2 클래스 생성
        var son = Person2("손석구", 30)

    }//onCreate

    //함수 정의
    fun test(name:String, age:Int) : String {
        return "name --> $name 입니다 age --> $age 입니다"
    }
}// class

class Person2 constructor(name:String, age:Int) {
    init {  // 생성자 호출 시 자동으로 실행되는 함수
        Log.d("dayList","name-->$name, age-->$age 입니다 ")
    }

    fun printName() {
    }

    fun printAge() {
    }
}



class Person constructor() {
    var name = "홍길동"
    var age = 20

    fun printName(){
        Log.d("dayList","이름은 $name 입니다")
    }

    fun printAge(){
        Log.d("dayList","나이는 $age 입니다")
    }
}