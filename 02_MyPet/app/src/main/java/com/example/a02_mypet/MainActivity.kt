package com.example.a02_mypet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var text1:TextView
    lateinit var text2:TextView
    lateinit var chkAgree: CheckBox
    lateinit var rdoGroup: RadioGroup
    lateinit var rdoDog:RadioButton
    lateinit var rdoCat:RadioButton
    lateinit var rdoRabbit:RadioButton
    lateinit var rdoFox:RadioButton
    lateinit var btnResult: Button
    lateinit var imgPet:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "반려동물 사진보기"

        text1 = findViewById(R.id.text1)
        text2 = findViewById(R.id.text2)
        chkAgree = findViewById(R.id.chkAgree)
        rdoGroup = findViewById(R.id.rdoGroup)
        rdoDog = findViewById(R.id.rdoDog)
        rdoCat = findViewById(R.id.rdoCat)
        rdoRabbit = findViewById(R.id.rdoRabbit)
        rdoFox = findViewById(R.id.rdoFox)
        btnResult = findViewById(R.id.btnReseult)
        imgPet = findViewById(R.id.imgPet)

        chkAgree.setOnCheckedChangeListener { compoundButton, b ->
            //이벤트 처리 작업
            if(chkAgree.isChecked == true) {
                text2.visibility = android.view.View.VISIBLE
                rdoGroup.visibility = android.view.View.VISIBLE
                btnResult.visibility = android.view.View.VISIBLE
                imgPet.visibility = android.view.View.VISIBLE

            }else {
                text2.visibility = android.view.View.INVISIBLE
                rdoGroup.visibility = android.view.View.INVISIBLE
                btnResult.visibility = android.view.View.INVISIBLE
                imgPet.visibility = android.view.View.INVISIBLE
            }
        }



        //선택완료 이벤트 처리
        btnResult.setOnClickListener {
            //rdoGroup 이벤트 처리
            when(rdoGroup.checkedRadioButtonId) {
                R.id.rdoDog -> imgPet.setImageResource(R.drawable.dog2)
                R.id.rdoCat -> imgPet.setImageResource(R.drawable.cat1)
                R.id.rdoRabbit -> imgPet.setImageResource(R.drawable.rabbit2)
                R.id.rdoFox -> imgPet.setImageResource(R.drawable.fox2)
                else -> Toast.makeText(applicationContext,"좋아하는 반려동물을 선택해주세요",Toast.LENGTH_SHORT).show()
            }
        }
    }
}