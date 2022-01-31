package com.carriraelan.animecharactermaker

import android.content.Context
import org.json.JSONObject
import org.json.JSONTokener
import java.io.IOException

enum class LayerType {
    TAILS, HAIR_BEHIND, HANDS_POSITION, BOTTOM_CLOTHES,
    TOP_CLOTHES, SET_CLOTHES, MIDDLE_HAIR, EARS, MOUTH,
    NOSE, EYES, EYEBROWS, EFFECTS, HEAD_ACCESSORIES,
    SIDE_BANGS, FRONT_BANGS, AHOGE, HAIR_ACCESSORIES, BACKGROUND
}
open class MenuItems(){
    //name of JSON file
    private val fileName : String = "images_data.json"

     open fun getHairBehind(context: Context) : ArrayList<String>{
        val array : ArrayList<String> = arrayListOf()
        val jsonObject = JSONTokener(getJSONString(context)).nextValue() as JSONObject
        val jsonArray = jsonObject.getJSONArray("hair_behind")
        for(i in 0 until jsonArray.length()){
            array.add(jsonArray.getString(i))
        }
        return array
    }

    //TODO зробити витягування всіх шарів

    /**
     * Get JSON file like String
     */
    private fun getJSONString(context: Context) : String?{
        val jsonString : String
        try {
            jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
        }catch(e : IOException){
            e.printStackTrace()
            return null
        }
        return jsonString
    }

}