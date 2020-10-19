package FInal.xo.tst.controlers;

import FInal.xo.controlers.CurentMoveControler;
import FInal.xo.model.ourModel.Field;
import FInal.xo.model.ourModel.Figure;
import org.junit.Test;

import java.awt.*;


import static org.junit.jupiter.api.Assertions.assertNull;

public class CurrentMoveControlerTest {
    @Test
   public void currentMoveWhenNextMoveIs0() throws Exception {
        final CurentMoveControler currentMoveControler = new CurentMoveControler();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.X);
            field.setFigure(new Point(i, 2), Figure.X);
            assertEquals(Figure.O, currentMoveControler.currentMove(field));
        }
    }

    private void assertEquals(Figure o, Figure currentMove) {
    }

    @Test
  public  void currentMoveWhenNextMoveIsX() throws Exception {
        final CurentMoveControler currentMoveControler = new CurentMoveControler();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.O);
            assertEquals(Figure.X, currentMoveControler.currentMove(field));
        }
    }

    @Test
   public void currentMoveWhenNoNextMoveLIkeNichuya() throws Exception {
        final CurentMoveControler currentMoveControler = new CurentMoveControler();
        final Field field = new Field(3);
        field.setFigure(new Point(0, 0), Figure.X);
        field.setFigure(new Point(0, 1), Figure.O);
        field.setFigure(new Point(0, 2), Figure.X);
        field.setFigure(new Point(1, 0), Figure.O);
        field.setFigure(new Point(1, 1), Figure.X);
        field.setFigure(new Point(1, 2), Figure.O);
        field.setFigure(new Point(2, 0), Figure.X);
        field.setFigure(new Point(2, 1), Figure.O);
        field.setFigure(new Point(2, 2), Figure.X);

        assertNull( currentMoveControler.currentMove(field));
    }

}
