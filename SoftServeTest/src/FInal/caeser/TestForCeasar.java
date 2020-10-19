package FInal.caeser;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestForCeasar {
    @Test
    public void encryptTest (){
        final String inputValue = " ACD"; // Початкове значення ????
        final String expectedValue = "DEFG";// очікуване значення
        CaesarCode caesarCode = new CaesarCode();
        final String actualValue = caesarCode.encrypt("ABCD" , 3);
        assertEquals(expectedValue , actualValue);// перевірка чи співпадають очікуване та початкове

    }
}
