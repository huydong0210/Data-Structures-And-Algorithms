package com.huydong.datastructures_and_algorithms.sort;

import java.util.List;

public class CountingSort implements SortAlgorithms {
    @Override
    public void sort(List<Integer> list) {
        if (list.size() == 0){
            return;
        }
        int min = list.get(0);
        int max = list.get(0);
        int[] result  = new int[list.size()];
        for (int i : list) {
            min = min < i ? min : i;
            max = max > i ? max : i;
        }
        int[] tmp = new int[max - min + 1];
        for (int i=0; i<tmp.length; i++){
            tmp[i] =0;
        }
        for (int i=0; i <list.size(); i++){
            tmp[list.get(i) - min] += 1;
        }
        for (int i=1; i < tmp.length; i++){
            tmp[i]= tmp[i] + tmp[i-1];
        }
        for (int i : list){
            result[tmp[i - min] - 1] = i;
            tmp[i-min]-=1;
        }


        for (int i=0; i < result.length; i++){
            list.set(i, result[i]);
        }
    }
}
