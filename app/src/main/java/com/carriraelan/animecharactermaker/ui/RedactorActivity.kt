package com.carriraelan.animecharactermaker.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.carriraelan.animecharactermaker.R

class RedactorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_redactor)

        /**
         * Allow add Fragments to current Activity
         */
        val imageFragment : ImageFragment = ImageFragment()
        val elementsFragment : ElementsFragment = ElementsFragment()
        val manager : FragmentManager = supportFragmentManager

        manager.beginTransaction().replace(R.id.fl_image, imageFragment, imageFragment.tag).commit()
        manager.beginTransaction().replace(R.id.fl_elements, elementsFragment, elementsFragment.tag).commit()
    }
}