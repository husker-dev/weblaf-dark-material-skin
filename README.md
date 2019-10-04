# Dark Material skin for WebLaF

Dark Material skin based on built-in WebLaF DarkSkin.

# Example
![example](https://i.ibb.co/6ZWJdnN/image.png)

# How to install
1) Download and add [WebLaF](https://github.com/mgarin/weblaf) library to your project
2) Download and add [DarkMaterialSkin.jar](https://github.com/Husker-hub/Dark-Material-WebLaF/releases/download/1.1/dark-material-skin-1.1.jar) library to your project
3) Set style:
    * When installing WebLaF:
        ```java
        WebLookAndFeel.install(DarkMaterialSkin.class);
        ```
    * Whenever you want:
        ```java
        StyleManager.setSkin(DarkMaterialSkin.class);
        ```
        

# Features

## HiddenScrollPane

```HiddenScrollPane``` uses transparent ```HiddenScrollPaneBar``` that minimized before you hover the mouse.

HiddenScrollPaneBar have ```default``` and ```hidden``` style. To change one of this style you need to call ```setDefaultStyle``` or ```setHoveredStyle```.

When style isn't ```DarkMaterial```, HiddenScrollPaneBar changes its style to ```StyleId.scrollbar```. To change it you need to call ```setStyleForOtherSkin```.

#### Default / Hovered state
![scroll1](https://i.ibb.co/ZY749qV/image.png)
![scroll2](https://i.ibb.co/tYshYzT/image.png)

## DarkCollapsiblePane 

DarkCollapsiblePane is a temporary solution to the problem with style.

DarkCollapsiblePane have ```default``` and ```hidden``` style. To change one of this style you need to call ```setDefaultStyle``` or ```setHiddenStyle```.

When style isn't ```DarkMaterial```, DarkCollapsiblePane changes its style to ```StyleId.collapsiblepane```. To change it you need to call ```setStyleForOtherSkin```.

#### Using WebCollapsiblePane
![WebCollapsiblePane](https://i.ibb.co/X309w8m/image.png)

#### Using DarkCollapsiblePane
![DarkCollapsiblePane](https://i.ibb.co/31hNKMW/image.png)

# Notes
Due to WebLaf problem, some components had to be done through a workaround. For correct work required to use ```DarkCollapsiblePane``` instead of default ```WebCollapsiblePane```.

# Styled components:
* WebButton
* WebCheckBox
* WebCollapsiblePane (Check notes)
* WebComboBox
* WebDockableFrame
* WebDockablePane
* WebLabel
* WebMenu
* WebMenuBar
* WebMenuItem
* WebPanel
* WebScrollBar
* WebScrollPane
* WebSeparator
* WebTextField
* WebToggleButon
* WebToolBar


