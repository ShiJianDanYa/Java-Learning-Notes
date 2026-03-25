package 练习.流程.循环;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: 流程_循环_判断随机数24
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/3115:56
 * @Version1.0
 */

/*
    要求程序随机生成1~100之间的一个数，让用户输入一个数，如果用户输入的数大于随机数，则提示用户输入的数大于随机数，
    如果用户输入的数小于随机数，则提示用户输入的数小于随机数，
    如果用户输入的数等于随机数，则提示用户输入的数等于随机数，并且结束程序。
 */
public class 流程_循环_判断随机数24 {
    public static void main(String[] args) {
        Random random = new Random();
        //生成随机数
        //（）内是随机数的范围
        //从0开始 到你所输入的值-1结束
        //口诀 包头不包尾，包左不包右
        //随机数代码，写在循环外面，否则每次循环都会生成一个新的随机数
        int x =random.nextInt(100)+1;
        //课堂.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数 范围0到100：");
        int yh = sc.nextInt();
        while(yh!=x){
            if(yh>x){
                System.out.println("你输入的数大于随机数，请重新输入");
            }else{
                System.out.println("你输入的数小于随机数，请重新输入");
            }
            System.out.println("请重新输入整数：");
            yh = sc.nextInt();
        }
        System.out.println("程序结束");
    }
}
