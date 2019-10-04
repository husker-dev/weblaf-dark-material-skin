package com.husker.darkmaterial.components.collapsible;

import com.alee.api.annotations.NotNull;
import com.alee.api.annotations.Nullable;
import com.alee.extended.collapsible.CollapsiblePaneAdapter;
import com.alee.extended.collapsible.WebCollapsiblePane;
import com.alee.managers.style.StyleId;
import com.alee.managers.style.StyleManager;
import com.husker.darkmaterial.DarkMaterialSkin;

import javax.swing.*;
import java.awt.*;

public class DarkCollapsiblePane extends WebCollapsiblePane {

    StyleId hidden;
    StyleId def;

    StyleId otherSkin;

    {
        hidden = StyleId.of("hidden");
        def = StyleId.collapsiblepane;
        otherSkin = StyleId.collapsiblepane;

        if(DarkMaterialSkin.isDarkStyle()) {
            if(isExpanded())
                setStyleId(def);
            else
                setStyleId(hidden);
        }else
            setStyleId(otherSkin);

        StyleManager.addSkinListener((from, to) -> {
            if(to.getId().equals("hukser.darkmaterial.skin")) {
                if(isExpanded())
                    setStyleId(def);
                else
                    setStyleId(hidden);
            }else
                setStyleId(otherSkin);
        });

        addCollapsiblePaneListener(new CollapsiblePaneAdapter() {
            public void expanded(WebCollapsiblePane pane) {
                if(DarkMaterialSkin.isDarkStyle())
                    setStyleId(def);
            }
            public void collapsed(WebCollapsiblePane pane) {
                if(DarkMaterialSkin.isDarkStyle())
                    setStyleId(hidden);
            }
        });
    }

    public void setDefaultStyle(StyleId style){
        def = style;
    }
    public StyleId getDefaultStyle(){
        return def;
    }

    public void setHiddenStyle(StyleId style){
        hidden = style;
    }
    public StyleId getHiddenStyle(){
        return hidden;
    }

    public void setStyleForOtherSkin(StyleId style){
        otherSkin = style;
    }
    public StyleId getStyleForOtherSkin(){
        return otherSkin;
    }

    // Constructors

    public DarkCollapsiblePane(final boolean expanded){
       super(expanded);
    }
    public DarkCollapsiblePane(@Nullable final String title) {
        super(title);
    }
    public DarkCollapsiblePane(@Nullable final String title, final boolean expanded){
        super(title, expanded);
    }
    public DarkCollapsiblePane(@Nullable final Icon icon, @Nullable final String title) {
        super(icon, title);
    }
    public DarkCollapsiblePane(@Nullable final Icon icon, @Nullable final String title, final boolean expanded){
        super(icon, title, expanded);
    }
    public DarkCollapsiblePane(@Nullable final Component content) {
        super(content);
    }
    public DarkCollapsiblePane(@Nullable final Component content, final boolean expanded) {
        super(content, expanded);
    }
    public DarkCollapsiblePane(@Nullable final String title, @Nullable final Component content) {
        super(title, content);
    }
    public DarkCollapsiblePane(@Nullable final String title, @Nullable final Component content, final boolean expanded){
        super(title, content, expanded);
    }
    public DarkCollapsiblePane(@Nullable final Icon icon, @Nullable final String title, @Nullable final Component content ){
        super(icon, title, content);
    }
    public DarkCollapsiblePane(@Nullable final Icon icon, @Nullable final String title, @Nullable final Component content, final boolean expanded){
        super(icon, title, content, expanded);
    }
    public DarkCollapsiblePane(@NotNull final StyleId id) {
        super(id);
    }
    public DarkCollapsiblePane(@NotNull final StyleId id, final boolean expanded) {
       super(id, expanded);
    }
    public DarkCollapsiblePane(@NotNull final StyleId id, @Nullable final String title){
        super(id, title);
    }
    public DarkCollapsiblePane(@NotNull final StyleId id, @Nullable final String title, final boolean expanded){
       super(id, title, expanded);
    }
    public DarkCollapsiblePane(@NotNull final StyleId id, @Nullable final Icon icon, @Nullable final String title) {
        super(id, icon, title);
    }
    public DarkCollapsiblePane(@NotNull final StyleId id, @Nullable final Icon icon, @Nullable final String title, final boolean expanded){
        super(id, icon, title, expanded);
    }
    public DarkCollapsiblePane(@NotNull final StyleId id, @Nullable final Component content){
        super(id, content);
    }
    public DarkCollapsiblePane(@NotNull final StyleId id, @Nullable final Component content, final boolean expanded){
        super(id, content, expanded);
    }
    public DarkCollapsiblePane(@NotNull final StyleId id, @Nullable final String title, @Nullable final Component content){
        super(id, title, content);
    }
    public DarkCollapsiblePane(@NotNull final StyleId id, @Nullable final String title, @Nullable final Component content, final boolean expanded){
        super(id, title, content, expanded);
    }
    public DarkCollapsiblePane(@NotNull final StyleId id, @Nullable final Icon icon, @Nullable final String title, @Nullable final Component content){
        super(id, icon, title, content);
    }
    public DarkCollapsiblePane(@NotNull final StyleId id, @Nullable final Icon icon, @Nullable final String title, @Nullable final Component content, final boolean expanded){
        super(id, icon, title, content, expanded);
    }

}
