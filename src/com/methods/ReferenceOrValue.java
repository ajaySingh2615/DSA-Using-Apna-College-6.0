package com.methods;

import java.util.ArrayList;
import java.util.List;

public class ReferenceOrValue {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("H1");
//        addBang(sb);
//        System.out.println(sb);

        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3));
        reset(nums);
        System.out.println(nums);
    }

    static void addBang(StringBuilder s) {
        s.append("!");
    }

    static void reset(List<Integer> list) {
//        list = new ArrayList<>();
        list.add(42);
    }
}
