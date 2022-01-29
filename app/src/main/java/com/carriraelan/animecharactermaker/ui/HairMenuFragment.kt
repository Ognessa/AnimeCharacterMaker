package com.carriraelan.animecharactermaker.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.carriraelan.animecharactermaker.R

class HairMenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hair_menu, container, false)
    }

    companion object {
        fun newInstance() = HairMenuFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}