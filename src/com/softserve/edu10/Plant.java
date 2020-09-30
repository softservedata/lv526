package com.softserve.edu10;

enum Type {
    FLOWER, TREE, HERBS, BUSH, MUSHROOM
}

enum Color {
    YELLOW, RED, PINK, WHITE, ORANGE, BLUE, GREEN
}
public class Plant {

    int size;
    private Color color;
    private Type type;

    public Plant() {}

    public Plant(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color.toString().toLowerCase() +
                ", type=" + type.toString().toLowerCase() +
                '}';
    }
}
