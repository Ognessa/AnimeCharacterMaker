package com.carriraelan.animecharactermaker.ui

import android.content.res.Resources
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.carriraelan.animecharactermaker.R

/**
 * A simple [Fragment] subclass.
 * Use the [ElementsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ElementsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_elements, container, false)
        root.layoutParams.height = Resources.getSystem().displayMetrics.heightPixels / 2

        /**
         * Resize menu
         */
        val hideBtn : ImageButton = root.findViewById(R.id.ibtn_hide_menu)
        var flag = true
        hideBtn.setOnClickListener{
            if(flag){
                root.layoutParams.height = hideBtn.height
                root.requestLayout()
                flag = false
            }else{
                root.layoutParams.height = Resources.getSystem().displayMetrics.heightPixels / 2
                root.requestLayout()
                flag = true
            }
        }
        /**
         * Dynamic create buttons in menu
         */

        val elementsFrame: FrameLayout = root.findViewById(R.id.elements_frame)
        val linearLayout : LinearLayout = LinearLayout(context)
        var list: ArrayList<TextView> = arrayListOf()

        /*val imgUrlList : ArrayList<String> = arrayListOf()

        linearLayout.orientation = LinearLayout.VERTICAL

        for(i in imgUrlList) {
            val text:TextView = TextView(activity)
            //text.id = 10 + i
            //text.text = i.imgUrl
            text.setTextColor(Color.BLACK)

            list.add(text)
        }

        for(i in list){
            linearLayout.addView(i)
        }
        elementsFrame.addView(linearLayout)*/

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

    /*fun colorsArray(): ArrayList<Int> {
        var colors = arrayListOf<Int>()
        colors.add(Color.RED)
        colors.add(Color.GREEN)
        colors.add(Color.GRAY)
        colors.add(Color.BLUE)
        colors.add(Color.YELLOW)
        return colors
    }*/
}