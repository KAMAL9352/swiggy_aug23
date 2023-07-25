package org.example;

import java.util.List;

public class Restro {
    private String id;
    private String name;

    private Location location;
    List<Dish> menu;
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setMenu(List<Dish> menu) {
        this.menu = menu;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public List<Dish> getMenu() {
        return menu;
    }

}
