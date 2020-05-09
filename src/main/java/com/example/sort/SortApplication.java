package com.example.sort;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SortApplication {
    public static void main(String[] args) {
        SpringApplication.run(SortApplication.class, args);

        Integer arr[] = {1, 3, 2, 7, 5, 4};

        SortOddThenEven.execute(arr);

        System.out.println(Arrays.toString(arr));
    }
}