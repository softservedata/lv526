package FInal.xo.view;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import FInal.xo.controlers.CurentMoveControler;
import FInal.xo.controlers.MoveControler;
import FInal.xo.controlers.WinnerControler;
import FInal.xo.model.exeptions.AlreadyOccupatedException;
import FInal.xo.model.exeptions.InvalidePointExeption;
import FInal.xo.model.ourModel.Field;
import FInal.xo.model.ourModel.Figure;
import FInal.xo.model.ourModel.Game;

public class ConsoleView {
    private CurentMoveControler currentMoveControler = new CurentMoveControler();
    private WinnerControler winnerControler = new WinnerControler();
    private MoveControler moveControler = new MoveControler();

    public void show(Game game) {
        System.out.format("Game name: %s\n" , game.getName());
        final Field field = game.getField();
        for (int i = 0; i < field.getSize(); i++) {
            if (i != 0)
                printSeparator();
            printLine(field, i);
        }

    }

    public boolean move(final Game game) {

        Figure winner = winnerControler.getWinner(game.getField());
        if (winner != null) {
            System.out.format(" WINNER IS %s\n ", winner);
            return false;
        }
        final Figure currentFigure = currentMoveControler.currentMove(game.getField());
        if (currentFigure == null) {
            System.out.println("No WINNER  and no moves left");
            return false;
        }
        System.out.format(" Please enter move point for %s\n ", currentFigure);
        final Point point = askPoint();
        try {
            moveControler.applyFigure(game.getField(), point, currentFigure);
        } catch (InvalidePointExeption | AlreadyOccupatedException e) {
            // e.printStackTrace();
            System.out.println("Point is invalid");
        }
        return true;
    }


    private Point askPoint() {
        return new Point(askCordinate("X") - 1, askCordinate("Y") - 1);
    }

    private int askCordinate(final String cordinateName) {
        System.out.format(" Please Input %s ", cordinateName);
        Scanner scanner = new Scanner(System.in);
        try {
            int num = scanner.nextInt();
            return num;
        } catch (InputMismatchException e) {
            System.out.println("Та шо ти пишеш?");
            return askCordinate(cordinateName);
        }
    }

    private void printLine(Field field, final int x) {

        for (int y = 0; y < field.getSize(); y++) {
            if (y != 0)
                System.out.print("|");
            System.out.print(" ");
            final Figure figure;

            try {
                figure = field.getFigure(new Point(y, x));
            } catch (InvalidePointExeption invalidePointExeption) {
                invalidePointExeption.printStackTrace();
                throw new RuntimeException(invalidePointExeption);
            }
            System.out.print(figure != null ? figure : " ");
            System.out.print(" ");
        }
        System.out.println();
    }

    private void printSeparator() {
        System.out.println("-----------");
    }
}
