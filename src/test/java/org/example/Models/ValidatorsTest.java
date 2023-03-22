package org.example.Models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorsTest {
    @Test
    @DisplayName("Test of isACorrectPassword")
    public void givedAPasswordWithUppercaseLowcaseNumberAndMinLengthSix_WhenProcesed_ThenReturnTrue(){
        String password = "Sergi1234";
        assertTrue(Validators.isACorrectPassword(password));
    }

    @Test
    @DisplayName("Test of isACorrectPassword")
    public void givedAPasswordWithNoUppercaseAndWithLowcaseNumberAndMinLengthSix_WhenProcesed_ThenReturnFalse(){
        String password = "sergi1234";
        assertFalse(Validators.isACorrectPassword(password));
    }

    @Test
    @DisplayName("Test of isACorrectPassword")
    public void givedAPasswordWithUppercaseAndNoLowcaseNumberAndMinLengthSix_WhenProcesed_ThenReturnFalse(){
        String password = "SERGI1234";
        assertFalse(Validators.isACorrectPassword(password));
    }

    @Test
    @DisplayName("Test of isACorrectPassword")
    public void givedAPasswordWithUppercaseAndLowcaseNoNumberAndMinLengthSix_WhenProcesed_ThenReturnFalse(){
        String password = "Sergii";
        assertFalse(Validators.isACorrectPassword(password));
    }

    @Test
    @DisplayName("Test of isACorrectPassword")
    public void givedAPasswordWithUppercaseAndLowcaseNumberAndNoMinLengthSix_WhenProcesed_ThenReturnFalse(){
        String password = "Se12";
        assertFalse(Validators.isACorrectPassword(password));
    }
}