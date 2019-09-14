# Dark Material skin for WebLaF

Dark Material skin based on built-in WebLaF DarkSkin.

## Differences

* White text was changed to light grey
* Gradient was removed
* Shadow was removed  from labels and components
* Dark has became darker

## Example
![example](https://i.ibb.co/6WCs6p2/image.png)

## How to install
1) Download and add [WebLaF](https://github.com/mgarin/weblaf) library to your project
2) Download and add [DarkMaterialSkin.jar](https://github.com/Husker-hub/Dark-Material-WebLaF/releases/download/1.0/dark-material-skin.1.0.jar) library to your project
3) Set style:
    * When installing WebLaF:
        ```java
        WebLookAndFeel.install(DarkMaterialSkin.class);
        ```
    * Whenever you want:
        ```java
        StyleManager.setSkin(DarkMaterialSkin.class);
        ```

## Styled components:
* WebButton
* WebCheckBox
* WebCollapsiblePane
* WebComboBox
* WebDockableFrame
* WebButton
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
