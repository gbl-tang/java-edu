package lambda;

public class lambdaTest2 {
    /*有一个很有名的数学逻辑题叫做不死神兔问题,有一对兔子,从出生后第三个月起每个月都生一对兔子,小兔子长到第三个月后又生一对兔子,加入兔子都不死,问第十二个月兔子对数为多少?
    1月:1
    2月:1
    3月:2
    4月:3
    5月:5
    6月:8
    特点:从第三个数据开始,是前两个数据和(斐波那契数列)
    */
    public static void main(String[] args) {
    /*求解1:
        创建长度为12的数组
        手动给0和1索引添加数据
        利用循环给剩余的数据进行赋值
     */
//        int[] arr = new int[12];
//        arr[0] = 1;
//        arr[1] = 1;
//        for (int i = 2; i < arr.length; i++) {
//            arr[i] = arr[i - 1] + arr[i - 2];
//        }
//        System.out.println(arr[11]);



        /*求解二:
        递归的方法完成
        1.递归的出口
        2.找到递归的规律
         */
        System.out.println( getSum(12));
    }

    public static int getSum(int month) {
        if (month == 1 || month == 2) {
            return 1;
        } else {
            return getSum(month - 1) + getSum(month - 2);
        }
    }
}
