package com.company;

import java.util.Arrays;

public class ArrayData {
    public static void main(String[] args) {

        int numbers[]={1,10,13,2,3,4,5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int [][]multi={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(multi[0][2]);
        System.out.println(Arrays.deepToString(multi));

    }
}
