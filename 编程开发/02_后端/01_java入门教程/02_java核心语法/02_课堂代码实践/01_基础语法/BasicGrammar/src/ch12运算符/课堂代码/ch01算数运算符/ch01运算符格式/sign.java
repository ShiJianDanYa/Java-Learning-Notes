package ch12运算符.课堂代码.ch01算数运算符.ch01运算符格式;

/**
 * ClassName: sign
 * Package: 课堂.运算符.java06
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2719:42
 * @Version1.0
 */
public class sign {
    public static void main(String[] args) {
        //运算中有小数参与会可能导致，运算结果不精确
        System.out.println(3.2+2.001);
        System.out.println(3.2-2.001);
        System.out.println(3.2*2.001);
        System.out.println("-----------------------------------------------------------------------");
        //➗ 纯整数参与运算，结果只保留整数部分，舍弃小数部分
        System.out.println(11/2);
        System.out.println(10/3);
        System.out.println(11.0/2);
        //取余 除法运算的余数
        System.out.println(11%2);
    }
}
