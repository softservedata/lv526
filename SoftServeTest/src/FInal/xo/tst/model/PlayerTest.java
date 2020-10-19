package FInal.xo.tst.model;

import FInal.xo.model.ourModel.Figure;
import FInal.xo.model.ourModel.Player;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @org.junit.Test
   public void getName() throws Exception {
        final String inputValue = "Nazar";  // Початкове значення
        final String expectedValue = inputValue;    // очікуване значення
        final Player player = new Player(inputValue, null); // спочатку очыкуване потім значення фігури (+ чи 0 )
        final String actualValue = player.getName();
        assertEquals(expectedValue, actualValue); // перевірка чи співпадають очікуване та початкове
    }

    @Test
   public void getFigure() throws Exception {
        final Figure inputValue = Figure.X;
        final Figure expectedValue = inputValue;
        final Player player = new Player(null, inputValue);
        final Figure actualValue = player.getFigure();
        assertEquals(expectedValue, actualValue);
    }
}
