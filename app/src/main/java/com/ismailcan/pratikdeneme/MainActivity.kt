package com.ismailcan.pratikdeneme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var yasim : Int? = null

        println(yasim)


        textView.text="Sonuç = ${0}"
        button.setOnClickListener {
            sayi--
            textView.text="Sonuç = ${sayi}"

        }
        button2.setOnClickListener {
            sayi++
            textView.text="Sonuç = ${sayi}"

        }
        sinifCalisma()
        var b : Int? = null
        println(b?.minus(2))
    }

    fun toplama(a:Int, b:Int){

        textView2.text = "${a+b}"

    }
    var sayi = 0

    fun arti(view : View){
        sayi++
        textView.text="Sonuç = ${sayi}"
    }
/*
    fun sinifCalisma(){

        var superman = superkahraman()
        superman.isim="ismail can"
        textView2.text = "sonuç = ${superman.isim}"
    }
*/
    fun sinifCalisma(){
        var batman = superKahraman("batman",16,"mühendis")
        textView2.text = "meslek = ${batman.meslek}"
        batman.testFonsiyonu()

}




}