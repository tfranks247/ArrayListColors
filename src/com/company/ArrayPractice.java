package com.company;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args){
        int[] numbers;
        numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] numbers2;
        numbers2 = new int[10];

        int sum = 0;
        for(int i = 0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(sum);

    }

}
