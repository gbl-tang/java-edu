package lambda;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;

public class lambdaDemo2 {
    public static void main(String[] args) {
        /*Lambda的省略规则:
            1.参数类型可以省略不写.
            2.如果只有一个参数,参数类型可以省略,同时()也可以省略
            3.如果lambda表达式的方法体只有一行,大括号,分号,return可以省略不写,需要同时省略.
          */
        Integer arr[] = {2, 5, 4, 7, 9, 1};

        //书写完整版lambda
//        Arrays.sort(arr, (Integer o1, Integer o2) -> {
//                    return o1 -o2;
//                }
//        );

        //书写简化版lambda
        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr));
    }
}
