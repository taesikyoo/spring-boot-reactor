package com.example.springbootreactivets.introduction;

public class Dish {

    private String description;
    private boolean delivered;

    public Dish(String description) {
        this.description = description;
    }

    public static Dish deliver(Dish dish) {
        Dish deliveredDish = new Dish(dish.description);
        deliveredDish.delivered = true;
        return deliveredDish;
    }

    @Override
    public String toString() {
        return "Dish{" + //
                "description='" + description + '\'' + //
                ", delivered=" + delivered + //
                '}';
    }
}
