package com.carriraelan.animecharactermaker

enum class LayerType {
    TAILS, HAIR_BEHIND, HANDS_POSITION, BOTTOM_CLOTHES,
    TOP_CLOTHES, SET_CLOTHES, MIDDLE_HAIR, EARS, MOUTH,
    NOSE, EYES, EYEBROWS, EFFECTS, HEAD_ACCESSORIES,
    SIDE_BANGS, FRONT_BANGS, HAIR_ACCESSORIES, BACKGROUND
}

enum class HigherMenuType{
    HEAD, HAIR, BACKGROUND, BODY, CLOTHES
}

class HigherMenu (
    menuName: HigherMenuType,
    icon: String,
    lowerMenu: ArrayList<LowerMenu>,
    itemMenu : ArrayList<MenuItems>
)

open class LowerMenu(
    menuLayer: LayerType,
    icon : String,
    itemsList : ArrayList<MenuItems>
)

open class MenuItems(
    layerType : LayerType,
    imagesList : ArrayList<String>
)