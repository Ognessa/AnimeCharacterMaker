package com.carriraelan.animecharactermaker.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.carriraelan.animecharactermaker.LayerType
import com.carriraelan.animecharactermaker.R
import com.carriraelan.animecharactermaker.RedactorActivity

class HairMenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_hair_menu, container, false)

        val tvTails : ImageView = view.findViewById(R.id.iv_tails)
        val tvHairBehind : ImageView = view.findViewById(R.id.iv_hair_behind)
        val tvMiddleHair : ImageView = view.findViewById(R.id.iv_middle_hair)
        val tvFrontBangs : ImageView = view.findViewById(R.id.iv_front_bangs)
        val tvSideBangs : ImageView = view.findViewById(R.id.iv_side_bangs)
        val tvHairAccessories : ImageView = view.findViewById(R.id.iv_hair_accessories)

        tvTails.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.TAILS), R.id.fl_elements)
        }
        tvHairBehind.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.HAIR_BEHIND), R.id.fl_elements)
        }
        tvMiddleHair.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.MIDDLE_HAIR), R.id.fl_elements)
        }
        tvFrontBangs.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.FRONT_BANGS), R.id.fl_elements)
        }
        tvSideBangs.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.SIDE_BANGS), R.id.fl_elements)
        }
        tvHairAccessories.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.HAIR_ACCESSORIES), R.id.fl_elements)
        }

        return view
    }

    companion object {
        fun newInstance() = HairMenuFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}