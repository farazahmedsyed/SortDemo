package com.example.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class UserInputTest {

    @Test
    public void unitTest_readNumsFromCommandLine_numberInput_success() {
        String input = "5 \n 1 2 3 4 5";
        Integer expected[] = {1, 2, 3, 4, 5};
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assertions.assertArrayEquals(expected, UserInput.readNumsFromCommandLine());
    }

    @Test
    public void unitTest_readNumsFromCommandLine_invalidInput_throwsIllegalArgumentException() {
        String input = "5 \n 1 a 3 4 5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assertions.assertThrows(IllegalArgumentException.class, () -> UserInput.readNumsFromCommandLine());
    }
}
