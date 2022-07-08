package com.carriraelan.animecharactermaker.ui

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.util.Xml
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat.getDrawable
import androidx.fragment.app.Fragment
import com.carriraelan.animecharactermaker.GITHelper
import com.carriraelan.animecharactermaker.LayerType
import com.carriraelan.animecharactermaker.MenuItems
import com.carriraelan.animecharactermaker.R
import org.xml.sax.XMLReader
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserFactory
import org.xmlpull.v1.XmlSerializer
import java.io.IOException
import java.io.StringReader

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

    @SuppressLint("ResourceType")
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

            val list : ArrayList<Drawable> = context?.let {
                GITHelper().getDrawables(
                 GITHelper().getImgInThread(
                     MenuItems().getHairBehind(it), it), it) }!!

            Toast.makeText(context, "List size - "+list.size.toString(), Toast.LENGTH_SHORT).show()

            val elementsFrame: FrameLayout = root.findViewById(R.id.elements_frame)
            val linearLayout = LinearLayout(activity)
            val scrollView = ScrollView(activity)
            val tVList: ArrayList<ImageView> = arrayListOf()

            linearLayout.orientation = LinearLayout.VERTICAL

            for(i in 0 until list.size) {
                val imgBtn = ImageView(activity)
                imgBtn.id = 10 + i
                imgBtn.setImageDrawable(list[i])
                imgBtn.maxHeight = 200
                imgBtn.setOnClickListener{
                    //TODO function!!!!
                }
                tVList.add(imgBtn)
            }

            for(i in tVList){
                linearLayout.addView(i)
            }
            scrollView.addView(linearLayout)
            elementsFrame.addView(scrollView)

        }

        return root
    }

}
