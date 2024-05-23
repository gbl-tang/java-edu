package lambda;

public class lambdaTest3 {
    /*猴子吃桃子
    有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个！以后每天猴子都吃当前剩下来的一半，然后在多吃一个，第十天的时候（还没吃），发现只剩下一个桃子了。请问，最初总共有多少个桃子？
    第一天：（第二天+1）*2
    第七天：22
    第八天：10
    第9天：4
    第10天：1
    */
    public static void main(String[] args) {
        System.out.println(getsum(1));
    }

    public static int getsum(int day) {
        if (day <= 0 || day >= 11) {
            System.out.println("时间错误");
            return -1;
        }
        if (day == 10) {
            return 1;
        }
        return (getsum(day + 1) + 1) * 2;
    }
}
