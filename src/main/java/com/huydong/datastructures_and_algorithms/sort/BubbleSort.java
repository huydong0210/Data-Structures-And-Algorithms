package com.huydong.datastructures_and_algorithms.sort;

import java.util.List;

public class BubbleSort implements SortAlgorithms {
    public void sort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Integer tmp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, tmp);
                }
            }
        }
    }

}
