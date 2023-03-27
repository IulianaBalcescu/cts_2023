package AbstractFcatory;

public class Main {
    public static void main(String[] args){
        GUIFactory<WindowsButton, WindowsMenu> windowsFactory= new WindowsGUIFactory();
        WindowsButton button=windowsFactory.creareButton();
        WindowsMenu menu=windowsFactory.creareMenu();

    }
}
