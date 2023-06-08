package week_2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *  Numbers -- Divisible by 3, 5, 15
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
    public static Map<String, List<Integer>> divisible_3_5_15(int start, int end){
        Map<String, List<Integer>> result=new LinkedHashMap<>();
        result.put("Divisible By 15",new ArrayList<>());
        result.put("Divisible By 5",new ArrayList<>());
        result.put("Divisible By 3",new ArrayList<>());
        for (int i = start; i <=end ; i++) {
            if (i%5==0){
                result.get("Divisible By 5").add(i);
            }
            if (i%15==0){
                result.get("Divisible By 15").add(i);
            }
            if (i%3==0){
                result.get("Divisible By 3").add(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Map<String, List<Integer>> map=divisible_3_5_15(1,100);
        for (Map.Entry<String, List<Integer>> each : map.entrySet()) {
            System.out.print(each.getKey()+" = ");
            System.out.println(each.getValue());

        }
    }
}
