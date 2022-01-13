package com.carriraelan.animecharactermaker.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.carriraelan.animecharactermaker.R

class ImageFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_image, container, false)
        //val layers : LayerDrawable = root.background as LayerDrawable

        //var drawable : Drawable = requireContext().resources.getDrawable(R.drawable.layer_list, requireContext().theme)

        return root
    }

}
