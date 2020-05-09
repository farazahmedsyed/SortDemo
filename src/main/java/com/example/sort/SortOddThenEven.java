package com.example.sort;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SortOddThenEven {

    public static void execute(Integer arr[]) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int size = arr.length;
        int left = 0;
        int right = size - 1;
        int totalOddElements = 0;

        while (left < right) {
            while (arr[left] % 2 != 0) {
                left++;
                totalOddElements++;
            }

            while (arr[right] % 2 == 0 && left < right)
                right--;
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        Arrays.sort(arr, 0, totalOddElements);
        Arrays.sort(arr, totalOddElements, size);
    }

}