package FInal.xo.tst.model;

import FInal.xo.model.exeptions.InvalidePointExeption;
import FInal.xo.model.ourModel.Field;
import FInal.xo.model.ourModel.Figure;
import org.junit.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class FieldTest {
    @Test
   public void getSize() throws Exception {
        final Field field = new Field(3);

        assertEquals(3, field.getSize());
    }

    @Test
   public void setFigure() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigure = Figure.O;
        field.setFigure(inputPoint, inputFigure); //встановили
        final Figure actualFigure = field.getFigure(inputPoint); // зчитуємо
        assertEquals(inputFigure, actualFigure);
    }

    @Test
   public void testGetFigureWhenFigureIsNotSet() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0, 0);

        final Figure actualFigure = field.getFigure(inputPoint); // зчитуємо
        assertEquals(null, actualFigure); // або assertNull ( actualFigure)
    }

    @Test()
   public void testGetFigureWhenXIsLessThenZero() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(-1, 0);
        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail(); // якщо джава зайде сюди , воно завалить тест , ( очікуємо що воно невер колд)
        } catch (InvalidePointExeption invalidePointExeption) {
        }
    }

    @Test
   public void testGetFigureWhenYIsLessThenZero() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0, -1);
        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail(); // якщо джава зайде сюди , воно завалить тест , ( очікуємо що воно невер колд)
        } catch (InvalidePointExeption invalidePointExeption) {
        }
    }

    @Test
   public void testGetFigureWhenXIsMoreThenSize() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(field.getSize() + 1, 0);
        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail(); // якщо джава зайде сюди , воно завалить тест , ( очікуємо що воно невер колд)
        } catch (InvalidePointExeption invalidePointExeption) {
        }
    }

    @Test
   public void testGetFigureWhenYIsMoreThenSize() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0, field.getSize() + 1);
        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail(); // якщо джава зайде сюди , воно завалить тест , ( очікуємо що воно невер колд)
        } catch (InvalidePointExeption invalidePointExeption) {
        }
    }
}
