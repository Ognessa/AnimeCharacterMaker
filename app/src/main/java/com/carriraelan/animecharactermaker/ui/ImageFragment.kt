package com.carriraelan.animecharactermaker.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.carriraelan.animecharactermaker.R

/**
 * Fragment with image
 */
//TODO maybe update screen???
open class ImageFragment : Fragment() {
    companion object{
        fun newInstance(): ImageFragment {
            val args = Bundle()

            val fragment = ImageFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image, container, false)
    }

}
