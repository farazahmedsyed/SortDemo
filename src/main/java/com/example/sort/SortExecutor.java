package com.example.sort;

import java.util.Arrays;

public class SortExecutor {

    public static void execute() {
        try {
            Integer arr[] = UserInput.readNumsFromCommandLine();

            SortOddThenEven.execute(arr);

            System.out.println(Arrays.toString(arr));
        } catch (Exception e) {
            System.out.println("System Error: " + e.getMessage());
            System.out.println("Program Exit");
        }

    }

}
