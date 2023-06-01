package alik.week_2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * Numbers -- Divisible by 3, 5, 15
 * Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
 * if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15 section
 * if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3 section
 * if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5 section
 * ex:
 * OutPut:
 * Divisible By 15 15 30 45 60 75 90
 * Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
 * Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */
public class NumbersDivisibleBy_3_5_15 {
    public static Map<String, ArrayList<Integer>> divisible(int n) {
        final String div15key = "Divisible By 15";
        final String div5key = "Divisible By 5";
        final String div3key = "Divisible By 3";
        ArrayList<Integer> div15int = new ArrayList<>();
        ArrayList<Integer> div5int = new ArrayList<>();
        ArrayList<Integer> div3int = new ArrayList<>();
        LinkedHashMap<String, ArrayList<Integer>> result = new LinkedHashMap<>();
        result.put(div15key, div15int);
        result.put(div5key, div5int);
        result.put(div3key, div3int);

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                div15int.add(i);
            } else if (i % 5 == 0) {
                div5int.add(i);
            } else if (i % 3 == 0) {
                div3int.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(divisible(100));
    }
}
