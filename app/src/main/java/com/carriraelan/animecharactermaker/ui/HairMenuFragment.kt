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

        val ivTails : ImageView = view.findViewById(R.id.iv_tails)
        val ivHairBehind : ImageView = view.findViewById(R.id.iv_hair_behind)
        val ivMiddleHair : ImageView = view.findViewById(R.id.iv_middle_hair)
        val ivSideBangs : ImageView = view.findViewById(R.id.iv_side_bangs)
        val ivFrontBangs : ImageView = view.findViewById(R.id.iv_front_bangs)
        val ivAhoge : ImageView = view.findViewById(R.id.iv_ahoge)
        val ivHairAccessories : ImageView = view.findViewById(R.id.iv_hair_accessories)

        ivTails.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.TAILS), R.id.fl_elements)
        }
        ivHairBehind.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.HAIR_BEHIND), R.id.fl_elements)
        }
        ivMiddleHair.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.MIDDLE_HAIR), R.id.fl_elements)
        }
        ivSideBangs.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.SIDE_BANGS), R.id.fl_elements)
        }
        ivFrontBangs.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.FRONT_BANGS), R.id.fl_elements)
        }
        ivAhoge.setOnClickListener {
            (activity as RedactorActivity)
                .replaceFragment(ElementsFragment.newInstance(LayerType.AHOGE), R.id.fl_elements)
        }
        ivHairAccessories.setOnClickListener {
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