package com.radualmasan.codility.cdk;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ByValueMapSorterTest {

    private ByValueMapSorter byValueMapSorter = new ByValueMapSorter();

    @Test
    public void testGivenExample() throws Exception {
        Map<String, Integer> map = new HashMap<>();

        map.put("vijay", 19);
        map.put("Krish", 34);
        map.put("Sanjay", 6);
        map.put("John", 24);

        List<String> actual = byValueMapSorter.getKeys(map);
        assertEquals(Arrays.asList("Krish", "John", "vijay", "Sanjay"), actual);
    }
}
