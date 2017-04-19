package com.radualmasan.codility.cdk;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ByValueMapSorter {

    public List<String> getKeys(Map<String, Integer> unsorted) {
        return unsorted.entrySet().stream()
                .sorted(this::compareDesc)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    private int compareDesc(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
        return e2.getValue() - e1.getValue();
    }
}
