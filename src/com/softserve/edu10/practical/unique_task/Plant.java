package com.softserve.edu10.practical.unique_task;

public class Plant {
    private  int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }
    public Plant(int size, String color, String type) {

        this.size = size;
        try {
            this.color = reColor(color);
        } catch (ColorExcepction colorExcepction) {
            colorExcepction.printStackTrace();
        }
        try {
            this.type = reType(type);
        } catch (TypeException e) {
            e.printStackTrace();
        }
    }

    public Color reColor(String s ) throws ColorExcepction {
        switch (s.toUpperCase()){
            case "RED":
                return Color.RED;
            case "GREEN":
                return Color.GREEN;
            case "YELLOW":
                return Color.YELLOW;
            case "BLUE":
                return Color.BLUE;
            default:
                throw new ColorExcepction("Choose color between RED, GREEN,YELLOW, BLUE ");


        }
    }
    public Type reType(String s ) throws  TypeException {
//         ROSE,CACTUS,ALOE,YUCCA
        switch (s.toUpperCase()){
            case "ROSE":
                return Type.ROSE;
            case "CACTUS":
                return Type.CACTUS;
            case "ALOE":
                return Type.ALOE;
            case "YUCCA":
                return Type.YUCCA;
            default:
                throw new TypeException("Choose type between ROSE,CACTUS,ALOE,YUCCA");


        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
