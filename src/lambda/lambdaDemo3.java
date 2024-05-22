package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class lambdaDemo3 {
    /*定义数组并存储一些女朋友对象,利用Arrays中的Sort方法进行排序
        要求1:属性有姓名,年龄,身高
        要求2:按照年龄的大小进行排序,年龄一样,按身高排序,身高一样按照姓名的字母进行排序.
    * */

    public static void main(String[] args) {
        //创建三个女朋友对象
        GrilFriand gf1 = new GrilFriand("xiaotang", 18, 1.70);
        GrilFriand gf2 = new GrilFriand("xiaoli", 119, 1.72);
        GrilFriand gf3 = new GrilFriand("xiaoliu", 19, 1.77);
        GrilFriand gf4 = new GrilFriand("xiaoliu2", 19, 1.77);
        //定义数组存储女朋友的信息
        GrilFriand[] arr = {gf1, gf2, gf3,gf4};
        //利用Arrays.sort进行排序
        //匿名内部类
        Arrays.sort(arr, new Comparator<GrilFriand>() {
            @Override
            public int compare(GrilFriand o1, GrilFriand o2) {
                //按照年龄的大小进行排序,年龄一样,按身高排序,身高一样按照姓名的字母进行排序.
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp==0?o1.getName().compareTo(o2.getName()):temp;
                if(temp>0){
                    return 1;
                }else if(temp<0){
                    return -1;
                }else {
                    return 0;
                }
            }
        });


        //输出
        System.out.println(Arrays.toString(arr));
    }
}
