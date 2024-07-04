package com.huydong.datastructures_and_algorithms.sort;

import java.util.List;

public class InsertionSort  implements SortAlgorithms{
    @Override
    public void sort(List<Integer> list) {
        for (int i=1 ; i<list.size(); i++){
            int index = i;
            while (index >0 && list.get(index-1) > list.get(index)){
                swap(list, index -1 , index);
                index --;
            }

        }
    }
}
