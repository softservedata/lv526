package FInal.xo;

import FInal.xo.model.ourModel.Field;
import FInal.xo.model.ourModel.Figure;
import FInal.xo.model.ourModel.Game;
import FInal.xo.model.ourModel.Player;
import FInal.xo.view.ConsoleView;

public class XOCommandLineInterface {
    public static void main(String[] args) {
        final String name1 = "Nazar";
        final String name2 = "Natalia ";

        final Player[] players = new Player[2];
        players[0] = new Player(name1, Figure.X);
        players[1] = new Player(name2, Figure.O);

        final Game gameXO = new Game(players, new Field(3), "X|0");
        final ConsoleView consoleWiiew = new ConsoleView();
        consoleWiiew.show(gameXO);
        while (consoleWiiew.move(gameXO))
            consoleWiiew.show(gameXO);

    }
}
