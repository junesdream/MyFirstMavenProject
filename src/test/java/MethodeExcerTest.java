import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MethodeExcerTest {

    @Test
    void shouldReturnTrueWhenGivenStringLongerThan20() {
        //Given
        String longEnough = "This String will be longer than 20.";

        //When
        boolean actual = MethodeExcer.longerThan20(longEnough);

        //Then
        assertEquals(true, actual);
    }

// deine Addieren-Methode
//eine Methode die prüft, ob ein Wert größer als 100 ist
    @Test
    void shouldAddTwoNumbers() {
        //GIVEN
        int a = 20;
        int b = 60;

        //WHEN
        int actual = MethodeExcer.addieren(a, b);

        //Then
        assertEquals(a+b, actual);
    }

    @Test
    void isValueBiggerThan100_when101_thenReturnTrue(){
        //GIVE
        int value = 101;
        //WHEN
        boolean result = MethodeExcer.isValueBiggerThan100(value);
        //Then
        assertEquals(true, result);
    }

    @Test
    void isValueBiggerThan100_when99_thenReturnFalse(){
        //GIVE
        int value = 90;
        //WHEN
        boolean result = MethodeExcer.isValueBiggerThan100(value);
        //Then
        assertEquals(false, result);
    }

    @Test
    void isValueBiggerThan100_when100_thenReturnFalse(){
        //GIVE
        int value = 90;
        //WHEN
        boolean result = MethodeExcer.isValueBiggerThan100(value);
        //Then
        assertEquals(false, result);
    }
}

