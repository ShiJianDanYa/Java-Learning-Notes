package ch02_课堂练习;

import java.util.Scanner;

/**
 * ClassName: 比较长方形周长
 * Package: 课外练习
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/4 - 14:52
 * @Version: v1.0
 *
 */
public class ch04_比较长方形周长_方法定义小诀窍 {
    /*
    需求 比较两个长方形的周长

    小诀窍：
      1.观察在大段的代码当中， 反复使用的独立功能是什么？反复使用+独立功能   求长方形的面积
      2.这个独立功能，需要什么才能完成？--－形参长宽
      3.方法的调用处，是否需要这个独立功能的结果继续做其他事情？  必须要把面积返回
      */
    public static void main(String [] args){
        //用户输入
        System.out.println("请输入第一个长方形的边长：");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=compare(a,b);
        System.out.println("第一个长方形的周长"+c);

        System.out.println("请输入第二个长方形的边长：");
         a=sc.nextInt();
         b=sc.nextInt();
        int d= compare(a,b);
        System.out.println("第一个长方形的周长"+d);

        if(c>d){
            System.out.println("第一个长方形的周长大");
        }else{
            System.out.println("第二个长方形的周长大");
        }

    }
    public static int compare(int a,int b){
        int c=(a+b)*2;
        return c;
    }
}
