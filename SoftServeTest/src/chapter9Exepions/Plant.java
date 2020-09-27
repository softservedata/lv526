package chapter9Exepions;


public class Plant {
    private Type type;
    Color color;
    int size;

    public Plant(Type type, Color color, int size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public Plant(String type, String color, int size) throws ColorExeption, TypeExeption {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }


    private Color colorStrToEnum(String color) throws ColorExeption {
        switch (color.toLowerCase()) {
            case "blue":
                return Color.Blue;
            case "red":
                return Color.Red;
            case "white":
                return Color.White;
            default:
                throw new ColorExeption("Input only color blue, red or white");
        }
    }

    private Type typeStrToEnum(String type) throws TypeExeption {
        switch (type.toLowerCase()) {
            case "flow":
                return Type.Flow;
            case "romashka":
                return Type.Romashka;
            case "rose":
                return Type.Rose;
            default:
                throw new TypeExeption("Input only type flow, romaska or rose");
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "type=" + type +
                ", color=" + color +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        try {
            Plant pl = new Plant("romashka", "blue", 5);
            System.out.println(pl);
        } catch (ColorExeption | TypeExeption e) {
            System.err.println(e.getMessage() + "\n");
        }
    }
}
