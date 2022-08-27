package com.my.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TestClass {
    public static void main(String[] args) {
        int numberOfSeats = 200;

        HashMap<Integer, Boolean> seats = new HashMap<>();

        for (int i = 0; i < numberOfSeats; i++) {
            Random random = new Random();
            boolean available = random.nextBoolean();
            seats.put(i, available);
        }
    }

    public Integer getAvailableSeat(HashMap<Integer, Boolean> seats) {
        for (Map.Entry<Integer, Boolean> entry : seats.entrySet()) {

            if (entry.getValue().equals(true)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
