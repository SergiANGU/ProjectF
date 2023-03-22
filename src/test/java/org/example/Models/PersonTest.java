package org.example.Models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    @DisplayName("Test of newPassword")
    public void givenACorrectPassword_WhenProcesed_ThenCreateTheUser(){

        Person person = new Person("admin", "Sergi1234");
        String correctPassword = "Sergi1234";
        assertEquals("Sergi1234", person.getPassword());
    }

}