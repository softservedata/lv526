package FInal.xo.controlers;

import FInal.xo.model.exeptions.AlreadyOccupatedException;
import FInal.xo.model.exeptions.InvalidePointExeption;
import FInal.xo.model.ourModel.Field;
import FInal.xo.model.ourModel.Figure;

import java.awt.*;

public class MoveControler {
    public void applyFigure(Field field, Point point, Figure figure) throws InvalidePointExeption,
                                                                            AlreadyOccupatedException {
        if (field.getFigure(point) != null) {
            throw new AlreadyOccupatedException();
        }
        field.setFigure(point, figure);

    }
}
