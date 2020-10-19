package FInal.xo.controlers;

import FInal.xo.model.exeptions.InvalidePointExeption;
import FInal.xo.model.ourModel.Field;
import FInal.xo.model.ourModel.Figure;

import java.awt.*;

public class CurentMoveControler {
    public Figure currentMove(final Field field) {
        int countFigure = 0;
        //because if moved X , its shared without rest
        for (int x = 0 ; x < field.getSize() ; x++){
            for (int y = 0 ; y < field.getSize() ; y ++){
                try {
                    if (field.getFigure(new Point(x , y )) != null)
                        countFigure++;
                } catch (InvalidePointExeption invalidePointExeption){
                    invalidePointExeption.printStackTrace();
                }

            }
        }

        if (countFigure ==field.getSize()*field.getSize())
            return null;
        if (countFigure %2 ==0)
            return Figure.X;

        return Figure.O;

    }
}
