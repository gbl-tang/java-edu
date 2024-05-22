package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class lambdaDemo1 {
    public static void main(String[] args) {
//        给定一个数组,让里面数值从大到小排列
        Integer arr[] ={2,5,4,7,9,1};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
