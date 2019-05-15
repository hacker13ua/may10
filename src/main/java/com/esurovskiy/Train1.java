package com.esurovskiy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Train1 {
    public static void main(String[] args) {
        final List<Integer> integers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        System.out.println(integers);


        final HashSet<String> set = new HashSet<String>();
        for (int i = 110; i < 130; i++) {
            set.add(String.valueOf(i));
        }
        System.out.println(set);
    }
}
