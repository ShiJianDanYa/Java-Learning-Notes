package 课堂代码.方法.方法的声明使用;

import java.util.Scanner;

/**
 * ClassName: method02
 * Package: 课堂代码.方法
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/110:43
 * @Version1.0
 */

/*
 */
public class method02 {
    public static void main(String[] args) {
        int a = 0,b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        a = sc.nextInt();
        b = sc.nextInt();
        method(a,b);
        System.out.println("程序结束");
    }
    public static void method( int a, int b){
        int c = a + b;
        System.out.println("c = " + c);
    }
}
