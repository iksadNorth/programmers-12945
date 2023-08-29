package org.example;

import java.util.*;

class Solution {
    static Map<Integer,Integer> table = new HashMap<>();
    static {
        table.put(0, 0);
        table.put(1, 1);
    }

    public int solution(int n) {
        if(table.containsKey(n)) return table.get(n);

        int val = solution(n-1) + solution(n-2);
        val %= 1234567;
        table.put(n, val);
        return val;
    }
}