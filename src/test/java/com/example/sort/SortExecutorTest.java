package com.example.sort;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class SortExecutorTest {

    @Test
    public void unitTest_execute_input_success() {
        String input = "5 \n 1 2 3 4 5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        SortExecutor.execute();
    }

}
