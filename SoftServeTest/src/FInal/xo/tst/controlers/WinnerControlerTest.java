package FInal.xo.tst.controlers;

import FInal.xo.controlers.WinnerControler;
import FInal.xo.model.ourModel.Field;
import FInal.xo.model.ourModel.Figure;
import org.junit.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class WinnerControlerTest {
    // test for all lines
    @org.junit.Test
  public  void getWinnerWhenWinnerWinn() throws Exception {


        final WinnerControler winnerControler = new WinnerControler();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.X);
            field.setFigure(new Point(i, 2), Figure.X);
            assertEquals(Figure.X, winnerControler.getWinner(field));
        }

    }

    @org.junit.Test
   public void getWinnerWhenWinnernNoWinn() throws Exception {

        final WinnerControler winnerControler = new WinnerControler();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.X);
            field.setFigure(new Point(i, 2), Figure.O);
            assertNull(winnerControler.getWinner(field)); // assertNull(winner.getWinner(field))
        }
    }

    @org.junit.Test
   public void getWinnerWhenWinnerColomn() throws Exception {

        final WinnerControler winnerControler = new WinnerControler();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(0, i), Figure.X);
            field.setFigure(new Point(1, i), Figure.X);
            field.setFigure(new Point(2, i), Figure.X);
            assertEquals(Figure.X, winnerControler.getWinner(field)); // assertNull(winner.getWinner(field))
        }
    }

    @org.junit.Test
   public void getWinnerWhenNoWinnernColomn() throws Exception {

        final WinnerControler winnerControler = new WinnerControler();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(0, i), Figure.X);
            field.setFigure(new Point(1, i), Figure.X);
            field.setFigure(new Point(2, i), Figure.O);
            assertNull(winnerControler.getWinner(field)); // assertNull(winner.getWinner(field))
        }
    }

    @org.junit.Test
   public void getWinnerWhenWinnerDiagonal1() throws Exception {

        final WinnerControler winnerControler = new WinnerControler();

        final Field field = new Field(3);
        field.setFigure(new Point(0, 0), Figure.X);
        field.setFigure(new Point(1, 1), Figure.X);
        field.setFigure(new Point(2, 2), Figure.X);
        assertEquals(Figure.X, winnerControler.getWinner(field)); // assertNull(winner.getWinner(field))
    }

    @org.junit.Test
   public void getWinnerWhenNoWinnerDiagonal1() throws Exception {

        final WinnerControler winnerControler = new WinnerControler();

        final Field field = new Field(3);
        field.setFigure(new Point(0, 0), Figure.X);
        field.setFigure(new Point(1, 1), Figure.X);
        field.setFigure(new Point(2, 2), Figure.O);
        assertNull( winnerControler.getWinner(field)); // assertNull(winner.getWinner(field))
    }

    @org.junit.Test
   public void getWinnerWhenWinnerDiagonal2() throws Exception {

        final WinnerControler winnerControler = new WinnerControler();

        final Field field = new Field(3);
        field.setFigure(new Point(0, 2), Figure.X);
        field.setFigure(new Point(1, 1), Figure.X);
        field.setFigure(new Point(2, 0), Figure.X);
        assertEquals(Figure.X, winnerControler.getWinner(field)); // assertNull(winner.getWinner(field))
    }

    @Test
   public void getWinnerWhenNoWinnerDiagonal2() throws Exception {

        final WinnerControler winnerControler = new WinnerControler();

        final Field field = new Field(3);
        field.setFigure(new Point(0, 2), Figure.X);
        field.setFigure(new Point(1, 1), Figure.X);
        field.setFigure(new Point(2, 0), Figure.O);
        assertNull( winnerControler.getWinner(field)); // assertNull(winner.getWinner(field))
    }
}
