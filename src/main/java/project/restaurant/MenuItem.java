package project.restaurant;

import java.awt.*;
import java.util.Objects;

public class MenuItem {
    String itemId;
    String name;
    String category;
    double price;

    MenuItem(String itemId, String name, String category, double price){
        this.itemId = itemId;
        this.name = name;
        this.category = category;
        this.price = price;
    }


    @Override
    public boolean equals(Object other){
        if(this == other)
            return true;
        if(other == null || getClass() != other.getClass())
            return false;
        MenuItem item = (MenuItem) other;
        return itemId.equals(item.itemId);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(itemId);
    }
}

