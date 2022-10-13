package com.jeremymartin.ui.menu;

import com.jeremymartin.ui.Displayable;
import com.jeremymartin.ui.Displayer;

import java.util.ArrayList;
import java.util.List;

public class Menu implements Displayable {

    private List<MenuOption> options = new ArrayList<>();

    public void addOption(MenuOption option) {
        option.setIndex(options.size() + 1);
        options.add(option);
    }

    public void display(Displayer displayer) {
        displayer.breakLine();
        displayer.write("Welcome on the Api Movies/Series");
        for (MenuOption option : options) {
            option.display(displayer);
        }
        displayer.breakLine();
        displayer.write("Please select an option to continue:");
    }

    public MenuOption getOptionByIndex(int index) {
        MenuOption option = null;
        for (MenuOption currentOption : options) {
            if (currentOption.getIndex() == index) {
                option = currentOption;
                break;
            }
        }
        return option;
    }
}
