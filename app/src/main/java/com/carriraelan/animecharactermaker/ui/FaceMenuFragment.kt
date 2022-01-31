package com.carriraelan.animecharactermaker.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.carriraelan.animecharactermaker.LayerType
import com.carriraelan.animecharactermaker.R
import com.carriraelan.animecharactermaker.RedactorActivity

class FaceMenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_face_menu, container, false)

        //init
        val ivEyes : ImageView = view.findViewById(R.id.iv_eyes)
        val ivEars : ImageView = view.findViewById(R.id.iv_ears)
        val ivEyebrows : ImageView = view.findViewById(R.id.iv_eyebrows)
        val ivHeadAccessories : ImageView = view.findViewById(R.id.iv_head_accessories)
        val ivFaceEffects : ImageView = view.findViewById(R.id.iv_face_effects)
        val ivMouth : ImageView = view.findViewById(R.id.iv_mouth)
        val ivNose : ImageView = view.findViewById(R.id.iv_nose)

        /**
         * open ElementsFragment with different layer type
         */
        ivEyes.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.EYES), R.id.fl_elements)
        }
        ivEars.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.EARS), R.id.fl_elements)
        }
        ivEyebrows.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.EYEBROWS), R.id.fl_elements)
        }
        ivHeadAccessories.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.HEAD_ACCESSORIES), R.id.fl_elements)
        }
        ivFaceEffects.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.EFFECTS), R.id.fl_elements)
        }
        ivMouth.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.MOUTH), R.id.fl_elements)
        }
        ivNose.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.NOSE), R.id.fl_elements)
        }

        return view
    }

    companion object {
        fun newInstance() =
            FaceMenuFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}