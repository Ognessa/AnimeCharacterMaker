package com.carriraelan.animecharactermaker.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.carriraelan.animecharactermaker.R

class FaceMenuFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_face_menu, container, false)
    }

    companion object {
        fun newInstance() =
            FaceMenuFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}