package ch12运算符.课堂练习.ch07三元运算符;

import java.util.Scanner;

/**
 * ClassName: 运算_三元_两只老虎07
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2811:54
 * @Version1.0
 */
/*
两只老虎
通过键盘分别为两只老虎输入体重，比较体重是否相同
 */
public class 两只老虎 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiger1 = 0,tiger2 = 0;
        System.out.println("请输入第一只老虎的体重：");
        tiger1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重：");
        tiger2 = sc.nextInt();
        System.out.println(tiger1 == tiger2? "两只老虎体重相同" : "两只老虎体重不相同");
    }
}
