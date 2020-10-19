package FInal.xo.controlers;

import FInal.xo.model.exeptions.InvalidePointExeption;
import FInal.xo.model.ourModel.Field;
import FInal.xo.model.ourModel.Figure;

import java.awt.*;

public class WinnerControler {
    public Figure getWinner(Field field) {
        try {
            for (int i = 0; i < 3; i++)
                if (check(field, new Point(i, 0), point -> new Point(point.x, point.y + 1)))
                    return field.getFigure(new Point(i, 0));

            for (int i = 0; i < 3; i++)
                if (check(field, new Point(0, i), point -> new Point(point.x + 1, point.y)))
                    return field.getFigure(new Point(0, i));

            if (check(field, new Point(0, 0), point -> new Point(point.x + 1, point.y + 1)))
                return field.getFigure(new Point(0, 0));

            if (check(field, new Point(0, 2), point -> new Point(point.x + 1, point.y - 1)))
                return field.getFigure(new Point(1, 1));

        } catch (InvalidePointExeption invalidePointExeption) {
            invalidePointExeption.printStackTrace();
        }
        return null;
    }

    // check перевіряє координату , як міняєм
    private boolean check(final Field field, final Point currentPoint, final IPOintGenerator pOintGenerator) {
        final Figure currentFigure;
        final Figure nextFigure;
        final Point nextPOint = pOintGenerator.next(currentPoint);
        try {
            currentFigure = field.getFigure(currentPoint);
            if (currentFigure == null)
                return false;

            nextFigure = field.getFigure(nextPOint);

        } catch (final InvalidePointExeption e) {
            return true;
        }
        if (currentFigure != nextFigure) return false;
        return check(field, nextPOint, pOintGenerator);

    }

    private interface IPOintGenerator {
        Point next(Point point);
    }

}
