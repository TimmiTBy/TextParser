package com.epam.textparser.composite;

import java.util.ArrayList;

public class Composite implements Component {

    private ArrayList <Component> components;

    public Composite() {
        components = new ArrayList<Component>();
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Component component: components) {
           sb = sb.append(component.toString() + " ");
        }
        return sb.toString();
    }
}
