package com.huydong.datastructures_and_algorithms.testing;

import com.huydong.datastructures_and_algorithms.Main;
import com.huydong.datastructures_and_algorithms.sort.SortAlgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortTesting {
    public List<Integer> test(SortAlgorithms sortAlgorithms, int testCases) {
        for (int i = 0; i < testCases; i++) {
            System.out.println("test cases: "+ (i+1) + "/" + testCases);
            List<Integer> originData = generateRandomList();
            List<Integer> dataTest = new ArrayList<>(originData);
            sortAlgorithms.sort(dataTest);
            if (!verify(dataTest)) {
                System.out.print(originData);
                return originData;
            }
        }
        return null;

    }

    private List<Integer> generateRandomList() {
        int size = randomInt();
        if (size < 0) {
            size *= -1;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(randomInt());
        }
        return list;
    }

    private boolean verify(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
    private int randomInt(){
        Random random = new Random();
        return random.nextInt(2000);
    }
}
