package com.huydong.datastructures_and_algorithms.sort;

import java.util.List;

public class SelectionSort implements SortAlgorithms {
    @Override
    public void sort(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            int min = list.get(i);
            int index = i;
            for (int j = i; j < list.size(); j++) {
                if (min > list.get(j)) {
                    min = list.get(j);
                    index = j;
                }
            }
            swap(list, i, index);

        }
    }

}
