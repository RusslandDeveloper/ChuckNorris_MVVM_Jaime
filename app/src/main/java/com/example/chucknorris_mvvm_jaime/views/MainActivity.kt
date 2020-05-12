package com.example.chucknorris_mvvm_jaime.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.Toast
import com.example.chucknorris_mvvm_jaime.R

class MainActivity : AppCompatActivity() {

    lateinit var buttonRandomJoke : Button
    lateinit var buttonInput : Button
    lateinit var buttonInfiniteList : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initButtons()
        initFragments(savedInstanceState)




    }


    private fun initButtons(){
        buttonRandomJoke =findViewById(R.id.btn_randomJoke)
        buttonInput = findViewById(R.id.btn_txtinput)
        buttonInfiniteList = findViewById(R.id.btn_endlessList)
    }

    private fun initFragments(savedInstanceState: Bundle?){
        if(findViewById<FrameLayout>(R.id.frag_container) != null){
            if(savedInstanceState != null){
                return
            }
        }
    }

     fun clickRandomJoke(view: View){

         supportFragmentManager.beginTransaction().
             replace(R.id.frag_container,RandomJokeFragment.newInstance("lol","lol2")
                 ,"randomjoke")
             .commit()}
     fun clickTxtInput(view: View){

         supportFragmentManager.beginTransaction().
             replace(R.id.frag_container,UserInputJokeFragment.newInstance("lol","lol2")
                 ,"randomjoke")
             .commit()
    }
     fun clickInfiniteList(view: View){
         supportFragmentManager.beginTransaction().
             replace(R.id.frag_container,RandomJokeEndlessListFragment.newInstance("lol","lol2")
                 ,"randomjoke")
             .commit()
    }

}
