package AbstractFcatory;

public class WindowsGUIFactory implements GUIFactory<WindowsButton, WindowsMenu> {

    @Override
    public WindowsButton creareButton() {
        return new WindowsButton();
    }

    @Override
    public WindowsMenu creareMenu() {
        return new WindowsMenu();
    }
}
