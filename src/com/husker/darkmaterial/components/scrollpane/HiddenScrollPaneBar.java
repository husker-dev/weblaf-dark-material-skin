package com.husker.darkmaterial.components.scrollpane;

import com.alee.laf.scroll.WebScrollPaneBar;
import com.alee.managers.style.StyleId;
import com.alee.managers.style.StyleManager;
import com.husker.darkmaterial.DarkMaterialSkin;


import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HiddenScrollPaneBar extends WebScrollPaneBar {
    StyleId def;
    StyleId hovered;

    StyleId otherSkin;

    public HiddenScrollPaneBar(JScrollPane scrollPane, int orientation) {
        super(scrollPane, orientation);

        def = StyleId.of("hidden");
        hovered = StyleId.of("hidden_hovered");
        otherSkin = StyleId.scrollbar;

        if(DarkMaterialSkin.isDarkStyle())
            setStyleId(def);
        else
            setStyleId(otherSkin);

        StyleManager.addSkinListener((from, to) -> {
            if(to.getId().equals("hukser.darkmaterial.skin"))
                setStyleId(def);
            else
                setStyleId(otherSkin);
        });

        addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                if(DarkMaterialSkin.isDarkStyle())
                    setStyleId(hovered);
            }
            public void mouseExited(MouseEvent e) {
                if(DarkMaterialSkin.isDarkStyle())
                    setStyleId(def);
            }
        });

    }

    public void setDefaultStyle(StyleId style){
        def = style;
    }
    public StyleId getDefaultStyle(){
        return def;
    }

    public void setHoveredStyle(StyleId style){
        hovered = style;
    }
    public StyleId getHoveredStyle(){
        return hovered;
    }

    public void setStyleForOtherSkin(StyleId style){
        otherSkin = style;
    }
    public StyleId getStyleForOtherSkin(){
        return otherSkin;
    }

    public void initStyle(){
        setStyleId(def);
    }
}
