package com.example.task10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        if(Float.isNaN(a) && Float.isNaN(b)){
            return true;
        }
        else if (Float.isInfinite(a) && Float.isInfinite(b) && !Float.isNaN(a + b)) {
            return true;
        }

        a *= Math.pow(10, precision);
        b *= Math.pow(10, precision);

       int intA = (int)a;
       int intB = (int)b;

        if(intA == intB){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);

    }

}
