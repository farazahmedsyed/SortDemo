package com.example.sort;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Slf4j
public class UserInput {

    public static final String ERROR_INVALID_NUMBER = "You didn't provide enough numbers";

    public static Integer[] readNumsFromCommandLine() {

        Scanner s = new Scanner(System.in);

        log.info("Enter total number of numbers");
        int count = s.nextInt();
        s.nextLine(); // throw away the newline.

        Integer[] numbers = new Integer[count];
        log.info("Enter numbers separated by space");
        try(Scanner numScanner = new Scanner(s.nextLine())) {
            for (int i = 0; i < count; i++) {
                if (numScanner.hasNextInt()) {
                    numbers[i] = numScanner.nextInt();
                } else {
                    log.error(ERROR_INVALID_NUMBER);
                    throw new IllegalArgumentException(ERROR_INVALID_NUMBER);
                }
            }
        }

        return numbers;
    }
}
