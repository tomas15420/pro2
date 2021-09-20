package cz.uhk.pro2;

import cz.uhk.pro2.models.PizzaMenu;
import cz.uhk.pro2.models.PizzaMenuItem;

public class Main {

    public static void main(String[] args) {
        PizzaMenu menu = new PizzaMenu();

        menu.addItem(new PizzaMenuItem("Šunková", "Prostě šunková pizza", 140));
        menu.addItem(new PizzaMenuItem("Sýrová", "Prostě sýrová pizza", 135));

        for(PizzaMenuItem item : menu.getItems()){
            System.out.println(item);
        }

        System.out.println("Last update: "+menu.getLastUpdate());

    }
}
