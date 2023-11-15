package Controller;

import View.Interface;
import View.MenuUi;

public class driver {
    public static void main(String[] args) {
        Interface interface1 = new MenuUi();

        interface1.menu();
    }
}
