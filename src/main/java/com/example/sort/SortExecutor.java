package com.example.sort;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SortExecutor {

    public static void execute() {
        try {
            Integer[] arr = UserInput.readNumsFromCommandLine();

            SortOddThenEven.execute(arr);

            System.out.println(Arrays.toString(arr));
        } catch (Exception e) {
            System.out.println("System Error: " + e.getMessage());
            System.out.println("Program Exit");
        }

    }

}
