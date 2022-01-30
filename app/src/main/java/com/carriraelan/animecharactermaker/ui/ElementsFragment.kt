package com.carriraelan.animecharactermaker.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.carriraelan.animecharactermaker.LayerType
import com.carriraelan.animecharactermaker.MenuItems
import com.carriraelan.animecharactermaker.R

/**
 * A simple [Fragment] subclass.
 * Use the [ElementsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ElementsFragment : Fragment() {

    val LAYER_TYPE : String = "LAYER_TYPE"

    companion object {
        fun newInstance(lt: LayerType) =
            ElementsFragment().apply {
                arguments = Bundle().apply {
                    putString(LAYER_TYPE, lt.toString())
                }
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_elements, container, false)

        val tvLayer : TextView = root.findViewById(R.id.tv_layer_name)
        val bundle : Bundle = requireArguments()
        val layerType = bundle.getString(LAYER_TYPE)

        tvLayer.text = layerType

        //get data like text
        if(layerType.equals(LayerType.HAIR_BEHIND.toString())){
            val menuItems = MenuItems()
            val list : ArrayList<String> = context?.let { menuItems.getHairBehind(it) }!!

            val elementsFrame: FrameLayout = root.findViewById(R.id.elements_frame)
            val linearLayout = LinearLayout(activity)
            var tVList: ArrayList<TextView> = arrayListOf()

            linearLayout.orientation = LinearLayout.VERTICAL

            for(i in 0 until list.size) {
                val imgBtn = TextView(activity)
                imgBtn.id = 10 + i
                imgBtn.text = list[i]
                imgBtn.setOnClickListener{
                    //TODO function!!!!
                }
                tVList.add(imgBtn)
            }

            for(i in tVList){
                linearLayout.addView(i)
            }
            elementsFrame.addView(linearLayout)

        }

        /**
         * Dynamic create buttons in menu
         */

        /*val elementsFrame: FrameLayout = root.findViewById(R.id.elements_frame)
        val linearLayout : LinearLayout = LinearLayout(activity)
        var list: ArrayList<ImageButton> = arrayListOf()

        linearLayout.orientation = LinearLayout.HORIZONTAL
        val colors = colorsArray()

        for(i in 0..4) {
            val imgBtn: ImageButton = ImageButton(activity)
            imgBtn.id = 10 + i
            imgBtn.setImageResource(R.drawable.ic_baseline_image_24)
            imgBtn.setBackgroundColor(colors.get(i))
            imgBtn.setOnClickListener{
                //TODO change activity to fragment!!!!
                val intent = Intent(activity, ImageFragment::class.java)
                intent.putExtra("key", colors.get(i).toString())
                startActivity(intent)
            }
            list.add(imgBtn)
        }

        for(i in list){
            linearLayout.addView(i)
        }
        elementsFrame.addView(linearLayout)*/

        return root
    }
}
