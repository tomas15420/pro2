package cz.uhk.pro2.models;

public class PizzaMenuItem {
    private String name;
    private String description;
    private int price;

    public PizzaMenuItem(String name, String desc, int price){
        this.name = name;
        description = desc;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
