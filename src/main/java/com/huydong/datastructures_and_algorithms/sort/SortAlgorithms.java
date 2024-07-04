package com.huydong.datastructures_and_algorithms.sort;

import java.util.List;

public interface SortAlgorithms {
    void sort(List<Integer> list);
    default void swap(List<Integer> list, int i, int j) {
        Integer tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }
}
