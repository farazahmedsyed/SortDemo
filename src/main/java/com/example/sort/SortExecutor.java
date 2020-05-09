package com.example.sort;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Slf4j
public class SortExecutor {

    public static void execute() {
        try {
            Integer[] arr = UserInput.readNumsFromCommandLine();

            SortOddThenEven.execute(arr);

            log.info(Arrays.toString(arr));
        } catch (Exception e) {
            log.error("System Error: " + e.getMessage());
            log.info("Program Exit");
        }

    }

}
