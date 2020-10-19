package FInal.xo.model.ourModel;

import FInal.xo.model.exeptions.InvalidePointExeption;

import java.awt.*;

public class Field {
    private static final int MIN_COORDINATE = 0;
    private final Figure[][] field;
    private final int filedSize;
    public int getSize() {
        return filedSize;
    }

    public Field(int filedSize) {
        this.filedSize = filedSize;
        field = new Figure[filedSize][filedSize]; // двомірний масив фігур 3х3
    }

    public Figure getFigure(final Point point) throws InvalidePointExeption {
        if (!checkPoint(point)) // якщо наш чекпоінт не валідний від нашого поінта тоді.
        {
            throw new InvalidePointExeption();
        }
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidePointExeption {
        if (!checkPoint(point)) // якщо наш чекпоінт не валідний від нашого поінта тоді.
        {
            throw new InvalidePointExeption();
        }
        field[point.x][point.y] = figure;
    }

    private boolean checkPoint(final Point point) {
        return checkCordinate(point.x, field.length) && checkCordinate(point.y, field[point.x].length);
    }

    private boolean checkCordinate(final int cordinate, final int maxCordinate) {
        return cordinate >= MIN_COORDINATE && cordinate < maxCordinate;
    }

}
