package com.huydong.datastructures_and_algorithms;

import com.huydong.datastructures_and_algorithms.sort.BubbleSort;
import com.huydong.datastructures_and_algorithms.sort.InsertionSort;
import com.huydong.datastructures_and_algorithms.sort.SelectionSort;
import com.huydong.datastructures_and_algorithms.sort.SortAlgorithms;
import com.huydong.datastructures_and_algorithms.testing.SortTesting;

import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        SortTesting sortTesting =new SortTesting();
        SortAlgorithms sortAlgorithms = new InsertionSort();
        List<Integer> failedCase = sortTesting.test(sortAlgorithms, 20000);
        if (Objects.isNull(failedCase)){
            System.out.print("all passed");
        } else{
            System.out.print("Failed case:");
            System.out.print(failedCase);
        }
    }

}
