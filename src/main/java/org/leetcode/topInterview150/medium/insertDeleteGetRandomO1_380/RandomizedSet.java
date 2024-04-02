package org.leetcode.topInterview150.medium.insertDeleteGetRandomO1_380;

import java.util.*;

class RandomizedSet {
    Set<Integer> values;

    public RandomizedSet() {
        values = new HashSet<>();
    }

    public boolean insert(int val) {
        return values.add(val);
    }

    public boolean remove(int val) {
        return values.remove(val);
    }

    public int getRandom() {
        int size = values.size();
        int i = new Random().nextInt(size);
        Integer[] a = (values.toArray(new Integer[0]));
        return a[i];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */