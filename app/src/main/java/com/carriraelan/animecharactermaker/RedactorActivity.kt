package com.carriraelan.animecharactermaker

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.carriraelan.animecharactermaker.ui.ImageFragment
import com.carriraelan.animecharactermaker.ui.MainMenuElementsFragment

open class RedactorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_redactor)


        /**
         * Resize menu
         */
        val hideBtn : ImageButton = findViewById(R.id.ibtn_hide_menu)
        val llMenuElem : LinearLayout = findViewById(R.id.ll_menu_elem)
        llMenuElem.layoutParams.height = Resources.getSystem().displayMetrics.heightPixels / 2

        var flag = true
        hideBtn.setOnClickListener{
            if(flag){
                llMenuElem.layoutParams.height = hideBtn.height
                llMenuElem.requestLayout()
                flag = false
            }else{
                llMenuElem.layoutParams.height = Resources.getSystem().displayMetrics.heightPixels / 2
                llMenuElem.requestLayout()
                flag = true
            }
        }

        /**
         * Allow add Fragments to current Activity
         */
        getFragment(ImageFragment.newInstance(), R.id.fl_image)
        getFragment(MainMenuElementsFragment.newInstance(), R.id.fl_elements)
    }

    open fun getFragment(fr : Fragment, id : Int){
        val fragmentManager : FragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
            .replace(id, fr)
            .commit()
    }

    open fun replaceFragment(fr : Fragment, id : Int){
        val fragmentManager : FragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
            .replace(id, fr)
            .addToBackStack(null)
            .commit()
    }

}