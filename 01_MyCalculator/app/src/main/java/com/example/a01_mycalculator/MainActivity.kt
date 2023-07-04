package com.example.a01_mycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //UI의 위젯 전역변수로 정의
    lateinit var edit1:EditText
    lateinit var edit2:EditText
    lateinit var btnAdd:Button
    lateinit var btnSub:Button
    lateinit var btnMul:Button
    lateinit var btnDiv:Button
    lateinit var textResult:TextView
    lateinit var number1:String // edit1 값을 담을 변수
    lateinit var number2:String // edit2 값을 담을 변수
    var result:Int? = null // result변수에 Int타입이 들어가는데 Null값을 허용한다는 의미 -> ?


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "초간단 계산기"

        edit1 = findViewById(R.id.edit1)
        edit2 = findViewById(R.id.edit2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMul = findViewById(R.id.btnMul)
        btnDiv = findViewById(R.id.btnDiv)
        textResult = findViewById(R.id.textResult)
        
        //더하기 
        btnAdd.setOnTouchListener { view, motionEvent ->

            if(validationCheck()) makeCalculation("add")
                false //setOnTouchListener는 return을 줘야함

        }

        //빼기
        btnSub.setOnTouchListener { view, motionEvent ->

            if(validationCheck()) makeCalculation("sub")
                false //setOnTouchListener는 return을 줘야함

        }

        //곱하기
        btnMul.setOnTouchListener { view, motionEvent ->

            if(validationCheck()) makeCalculation("mul")
                false //setOnTouchListener는 return을 줘야함

        }

        //나누기
        btnDiv.setOnTouchListener { view, motionEvent ->

            if(validationCheck()) makeCalculation("div")
                false //setOnTouchListener는 return을 줘야함

        }

    }// onCreate

    //makeCalculation
    fun makeCalculation(type:String) {
        when(type) {
            "add" -> result = Integer.parseInt(number1) + Integer.parseInt(number2)
            "sub" -> result = Integer.parseInt(number1) - Integer.parseInt(number2)
            "mul" -> result = Integer.parseInt(number1) * Integer.parseInt(number2)
            "div" -> result = Integer.parseInt(number1) / Integer.parseInt(number2)
        }
        textResult.text = "계산 결과 : " + result.toString()
    }

    //validationCheck
    //함수명 : validationCheck() 리턴타입 - Boolean
    fun validationCheck():Boolean {
        number1 = edit1.text.toString()
        number2 = edit2.text.toString()

        if (number1 == "") {
            Toast.makeText(applicationContext, "숫자1을 입력해주세요",Toast.LENGTH_SHORT).show()
            edit1.requestFocus()
            return false
        }else if (number2 == "") {
            Toast.makeText(applicationContext,"숫자2를 입력해주세요",Toast.LENGTH_SHORT).show()
            edit2.requestFocus()
            return false
        }

        return true
    }


}//MainActivity class