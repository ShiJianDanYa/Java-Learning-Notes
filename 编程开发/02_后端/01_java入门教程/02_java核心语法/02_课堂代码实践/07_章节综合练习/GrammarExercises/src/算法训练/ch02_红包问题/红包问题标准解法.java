package 算法训练.ch02_红包问题;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: 红包问题标准解法
 * Package: 算法训练.红包问题
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/6 - 18:51
 * @Version: v1.0
 *
 */
public class 红包问题标准解法 {
    /*
    注1：每个人最少1分钱
    注2：每个人领完红包之后，至少预留1*N分钱
    注3：最后一个人是拿剩余的总额

    给你两个整数M和N，M表示红包的总额，N表示红包的个数
    现在又N个人来抽红包，每个人都是随机的，打印每个人领的红包金额
    */
    public static void main(String [] args) {
        int m,n;
        //注意为了方便理解 红包最低为分改为元
        //用户输入指定的红包总额和红包个数
        //m 存储红包总额
        System.out.println("请输入红包总额：");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        //n 存储红包个数
        System.out.println("请输入红包个数：");
        n = sc.nextInt();
        //判断数据是否合法
        if(m>=n && n>=1){
            //调用方法
            print(m,n);
        }else{
            System.out.println("输入数据有误！");
        }

    }
    //随机数额方法
    public static void print(int m,int n){
        //利用random 进行随机抽取
        Random random = new Random();
        // 为什么是小于n，
        // 因为最后一个红包的数额，是所有红包总额减去已经抢到的红包总额
        for(int i= 1 ;i<n;i++){
            //那随机抽取的范围应该如何定义呢？ 假设人物为 5人
            //抽取红包人的编号  1    2    3    4
            //预留红包的金额   4    3    2    1
            //预留红包的金额规律为（n-i）
            //第一个人抽取红包 200 -（5-1） = 196
            //但是按照random规则 m-(n-i) 的范围是 0到195
            //解决方法 +1
            int myMoney = random.nextInt(m-(n-i))+1;
            //总额减去已经抢到的红包总额
            m = m-myMoney;

            System.out.println("第"+i+"个人抢到红包："+myMoney);
        }
        //输出最后一个人的钱
        System.out.println("第"+n+"个人抢到红包："+m);
    }
}
