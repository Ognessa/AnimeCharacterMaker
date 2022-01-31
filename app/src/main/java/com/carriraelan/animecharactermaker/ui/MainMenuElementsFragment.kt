package com.carriraelan.animecharactermaker.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.carriraelan.animecharactermaker.R
import com.carriraelan.animecharactermaker.RedactorActivity

open class MainMenuElementsFragment : Fragment() {
    companion object {
        fun newInstance(): MainMenuElementsFragment {
            val args = Bundle()
            val fragment = MainMenuElementsFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_main_menu_elements, container, false)

        //init
        val ivFaceMenu : ImageView = view.findViewById(R.id.iv_face_menu)
        val ivHairMenu : ImageView = view.findViewById(R.id.iv_hair_menu)

        /**
         * Open "secondary" menu fragment
         */
        ivFaceMenu.setOnClickListener {
            (activity as RedactorActivity).replaceFragment(FaceMenuFragment.newInstance(), R.id.fl_elements)
        }

        ivHairMenu.setOnClickListener {
            (activity as RedactorActivity).replaceFragment(HairMenuFragment.newInstance(), R.id.fl_elements)
        }

        return view
    }

}