package org.marusosa.patterns.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaProduct {
    protected String name;
    protected String mass;
    protected String sauce;
    protected List<String> ingredients;

    public PizzaProduct() {
        this.ingredients = new ArrayList<>();
    }

    public void prepare() {
        System.out.println("Preparing: " + name);
        System.out.println("Picking the mass: " + mass);
        System.out.println("Adding the sauce: " + sauce);
        System.out.println("Adding the ingredients: ");
        this.ingredients.forEach(System.out::println);
    }
    public abstract void cooking();
    public abstract void cutting();
    public void packing() {
        System.out.println("Putting the pizza in a box");
    }

    @Override
    public String toString() {
        return "PizzaProduct{" +
                "name='" + name + '\'' +
                ", mass='" + mass + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
