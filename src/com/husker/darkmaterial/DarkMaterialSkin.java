package com.husker.darkmaterial;

import com.alee.managers.style.StyleManager;
import com.alee.managers.style.XmlSkin;

public class DarkMaterialSkin extends XmlSkin {
    public DarkMaterialSkin() {
        super(DarkMaterialSkin.class,"resources/skin.xml");
    }

    public static boolean isDarkStyle(){
        return StyleManager.getSkin().getId().equals("hukser.darkmaterial.skin");
    }
}
