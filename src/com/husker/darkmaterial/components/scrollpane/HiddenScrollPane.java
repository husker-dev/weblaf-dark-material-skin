package com.husker.darkmaterial.components.scrollpane;

import com.alee.api.data.Orientation;
import com.alee.laf.scroll.WebScrollPane;
import com.alee.managers.style.StyleId;

import java.awt.*;

public class HiddenScrollPane extends WebScrollPane {

    {
        setStyleId(StyleId.scrollpaneTransparentHovering);
        setVerticalScrollBar(new HiddenScrollPaneBar(this, Orientation.VERTICAL));
        setHorizontalScrollBar(new HiddenScrollPaneBar(this, Orientation.HORIZONTAL));
        ((HiddenScrollPaneBar)getVerticalScrollBar()).initStyle();
        ((HiddenScrollPaneBar)getHorizontalScrollBar()).initStyle();
    }

    public HiddenScrollPane()
    {
        super();
    }
    public HiddenScrollPane(final Component view)
    {
        super(view);
    }
    public HiddenScrollPane(final int vsbPolicy, final int hsbPolicy)
    {
        super(vsbPolicy, hsbPolicy);
    }
    public HiddenScrollPane(final Component view, final int vsbPolicy, final int hsbPolicy){
        super(view, vsbPolicy, hsbPolicy);
    }
    public HiddenScrollPane(final StyleId id)
    {
        super(id);
    }
    public HiddenScrollPane(final StyleId id, final Component view)
    {
        super(id, view);
    }
    public HiddenScrollPane(final StyleId id, final int vsbPolicy, final int hsbPolicy){
        super(id, vsbPolicy, hsbPolicy);
    }
    public HiddenScrollPane(final StyleId id, final Component view, final int vsbPolicy, final int hsbPolicy){
        super(id, view, vsbPolicy, hsbPolicy);
    }
}
