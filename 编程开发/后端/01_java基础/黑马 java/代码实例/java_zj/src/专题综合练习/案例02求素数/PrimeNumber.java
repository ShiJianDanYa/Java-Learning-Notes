package 专题综合练习.案例02求素数;

import java.util.Scanner;

/**
 * ClassName: PrimeNumber
 * Package: 专题综合练习.案例02求素数
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/123:39
 * @Version1.0
 */

/*
要求判断x到y之间的素数，并输出所有素数,和质数个数
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int x = 0, y = 0;
        System.out.println("请输入两个整数：");
        x = new Scanner(System.in).nextInt();
        y = new Scanner(System.in).nextInt();

        System.out.println(primeNumber(x, y));

        System.out.println("程序结束");


    }

    public static String primeNumber(int x, int y)
    {
        int count = 0;
        boolean zs = true;
        String str = "";
        //循环输出从x到y之间的所有数
        for(int i = x; i <= y; i++)
        {
            //先判断一个数是否为素数
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    zs=false;
                    //跳出内层循环(单层循环)，继续外层循环
                    break;
                }
            }
            if(zs)
            {
                str += i + " ";
                count++;
            }
            zs = true;
        }
        return str+"质数个数为："+count;
    }
}
