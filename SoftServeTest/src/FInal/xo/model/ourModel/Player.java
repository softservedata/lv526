package FInal.xo.model.ourModel;

public class Player {
    private final String name;

    private final Figure figure;

    public Player(final String name,final Figure figure) {
        this.name = name;
        this.figure = figure;// create tests which can chack if !figure == null
    }

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }
}
