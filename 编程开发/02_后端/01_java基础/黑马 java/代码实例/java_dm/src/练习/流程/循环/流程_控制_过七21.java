package 练习.流程.循环;

/**
 * ClassName: 流程_控制_过七21
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2921:54
 * @Version1.0
 */

/* 逢七避过
 * 逢七过，是一种简单的计数规则，
 从1到100中，逢7过，即逢7的倍数，或者含有7的数字都要跳过。
 输出1到100的数字，逢七过，即逢7的倍数，或者含有7的数字都要跳过。
 */
public class 流程_控制_过七21 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if (i%7==0||i%10==7||i/10==7){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("程序结束");
    }
}
