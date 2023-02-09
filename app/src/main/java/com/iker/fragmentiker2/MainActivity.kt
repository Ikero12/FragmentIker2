package com.iker.fragmentiker2

import android.content.res.Configuration
import android.graphics.drawable.GradientDrawable.Orientation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iker.fragmentiker2.ui.main.MainFragment
import com.iker.fragmentiker2.ui.main.MainFragment.Companion.newInstance
import com.iker.fragmentiker2.ui.main.SecondFragment
import org.intellij.lang.annotations.JdkConstants.AdjustableOrientation

class MainActivity : AppCompatActivity() {

    val fragment1: MainFragment = MainFragment.newInstance()
    val fragment2: SecondFragment = SecondFragment.newInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        transiction()

    }


    fun transiction(){

        val orientation = this.resources.configuration.orientation

        if(orientation === Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.activity_main)
            val fragmentTransaction = supportFragmentManager.beginTransaction()

            fragmentTransaction.add(R.id.fContenedorMain, fragment1)
            fragmentTransaction.add(R.id.fContenedorSecond, fragment2)
            fragmentTransaction.commit()

        }else if(orientation === Configuration.ORIENTATION_PORTRAIT){
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            setContentView(R.layout.activity_main)

            fragmentTransaction.add(R.id.fContenedorMain, fragment1)
            fragmentTransaction.commit()

        }

    }

}