package com.example.superkahramanprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  private  var isim=""
   private var yas:Int?=null
   private var meslek=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun superKahramanYap(view: View){
      isim=isimText.text.toString()
      yas=yasText.text.toString().toIntOrNull()
      meslek=meslekText.text.toString()
        if(yas==null)
        {
            textView.text="dogru yas gır"

        }
        else{
            val superKahraman=SuperKahraman(isim,yas!!,meslek)
            textView.text="İsim: ${superKahraman.isim} , Yas :${superKahraman.yas.toString()} ,Meslek :${superKahraman.meslek}"
        }


    }
}