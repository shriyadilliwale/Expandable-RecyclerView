package com.example.imageclick

import android.graphics.BitmapFactory
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException
import java.io.InputStream

class MainActivity : AppCompatActivity() {


    private lateinit var imageV: ImageView

    private var buttonimg1: Button? = null
    private var buttonimg2: Button? = null
    private var buttonimg3: Button? = null


    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        expandud.setOnClickListener {
            if (expand_layout.visibility == View.GONE) {
                TransitionManager.beginDelayedTransition(Card_View, AutoTransition())
                expand_layout.visibility = View.VISIBLE


            } else {
                TransitionManager.beginDelayedTransition(Card_View, AutoTransition())
                expand_layout.visibility = View.GONE

            }
        }

        expandud1.setOnClickListener {
            if (Card_View.visibility == View.GONE) {
                TransitionManager.beginDelayedTransition(Card_View, AutoTransition())
                Card_View.visibility = View.VISIBLE
                expandud1.text = "UP"

            } else {
                TransitionManager.beginDelayedTransition(Card_View, AutoTransition())
                Card_View.visibility = View.GONE
                expandud1.text = "Down"
            }
        }


        imageV = findViewById<ImageView>(R.id.image1)
        buttonimg1 = findViewById<Button>(R.id.buttonc1)
        buttonimg2 = findViewById<Button>(R.id.buttonc2)
        buttonimg3 = findViewById<Button>(R.id.buttonc3)


        buttonimg1?.setOnClickListener{
            imageV.setImageResource(R.drawable.image_1)
        }

        buttonimg2?.setOnClickListener{
            imageV.setImageResource(R.drawable.image_2)
        }


        buttonimg3?.setOnClickListener{
            imageV.setImageResource(R.drawable.image_3)
        }

    }



}


