package src.main.kakao2020.Q1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    void solution1() {

        Main m  = new Main();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        long start = System.nanoTime();
        assertEquals("LRLLLRLLRRL", m.solution(numbers, "right"));
        long end = System.nanoTime();
        System.out.println("time: " +(end - start) +"ns");
    }

    @Test
    void solution2() {

        Main m  = new Main();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        long startTime = System.nanoTime();
        assertEquals("LLRLLRLLRL", m.solution(numbers, "right"));
        long endTime = System.nanoTime();
        System.out.println("time: " +(endTime - startTime)+"ns");
    }

    @Test
    void solution3() {

        Main m  = new Main();
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        long startTime = System.nanoTime();
        assertEquals("LRLLRRLLLRR", m.solution(numbers, "left"));
        long endTime = System.nanoTime();
        System.out.println("time: " +(endTime - startTime)+"ns");
    }
}