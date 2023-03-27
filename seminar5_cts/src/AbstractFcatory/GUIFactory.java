package AbstractFcatory;

public interface GUIFactory<T extends Button, V extends Menu> {
    T creareButton();
    V creareMenu();
}
