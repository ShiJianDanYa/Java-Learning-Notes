package ch12运算符.课堂代码.ch05逻辑运算符;

/**
 * ClassName: logic
 * Package: 课堂.运算符.java10
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2722:50
 * @Version1.0
 */

public class 逻辑运算符 {
    public static void main(String[] args) {
        boolean a = true, b = false;
        //& 同真为真，其余为假
        System.out.println(a & a);
        System.out.println(a & b);
        System.out.println(b & b);
        //| 有真为真，全假为假
        System.out.println("==================================");
        System.out.println(a | a);
        System.out.println(a | b);
        System.out.println(b | b);
        //^ 相同为假，不同为真
        System.out.println("==================================");
        System.out.println(a ^ a);
        System.out.println(a ^ b);
        System.out.println(b ^ b);

        // ! 取反
        //取反 ！ 不要书写多次 要么别写 ，要么就写一次
        System.out.println("==================================");
        System.out.println(!a);
        System.out.println(!b);

    }
}
