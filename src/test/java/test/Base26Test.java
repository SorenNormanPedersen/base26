package test;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by sorenpedersen on 21/09/2016.
 */
public class Base26Test {

    @Test(expected = IllegalArgumentException.class)
    public void expectExceptionForNumbersLessThanOne() throws Exception {
        // Given
        Base26 sut = new Base26();
        int column = 0;
        // When
        String actual = sut.toString(column);
        // Then
        fail("IllegalArgumentException expected");
    }

    @Test
    public void shouldHandleSingleDigit_3() throws Exception {
        // Given
        Base26 sut = new Base26();
        int column = 3;
        // When
        String actual = sut.toString(column);
        // Then
        assertThat("expected C for 3", actual, is("C"));
    }

    @Test
    public void shouldHandleDoubleDigits_28() throws Exception {
        // Given
        Base26 sut = new Base26();
        int column = 28;
        // When
        String actual = sut.toString(column);
        // Then
        assertThat("expected AB for 28", actual, is("AB"));
    }

    // aa ab ac ad ae af ag ah ai aj

    @Test
    public void shouldHandleDoubleDigits_36() throws Exception {
        // Given
        Base26 sut = new Base26();
        int column = 36;
        // When
        String actual = sut.toString(column);
        // Then
        assertThat("expected AJ for 36", actual, is("AJ"));
    }

}