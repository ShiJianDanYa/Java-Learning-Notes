package ch03_课外作业;

import java.util.Scanner;

/**
 * ClassName: 计算快递费用
 * Package: 课外作业
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/4 - 17:04
 * @Version: v1.0
 *
 */
public class ch_03计算快递费用 {
    /*
    某快递公司的运费规则如下（首重1kg，超出部分按kg计算，不足1kg按1kg算）：
    首重1kg：10元;
    超出1-5kg：每kg加2元；
    超出5kg以上：每kg加1.5元。

    键盘录入小数，表示用户快递的重量，计算最终的结果
    要求1：快递重量必须大于0，否则重新输入
    要求2：不同价位的计算，单独定义一个方法
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //存储 数据
        double weight = 0;
        //判断输入合法依据
        while(true) {
            System.out.println("请输入快递的重量：");
            weight = sc.nextDouble();
            //开始判断 输入 合法
            if (weight > 0) {
                break;
            } else {
                System.out.println("输入数据不合法，请重新输入！");
            }
        }
        //存储快递费用
        double costs = 0;
        //向上取整
        int w = (int)Math.ceil(weight);
        //判断


            if(w >= 5){
                costs += 10 + (4*2) +cost5(w);
            } else if (w >= 1) {
                costs += 10 + cost1_5(w);
            }else {
                costs +=  10;
            }

        System.out.println("快递费用是："+costs);
    }
    public static double cost5(double weight){
        weight -= 5;
        return weight * 1.5;
    }
    public static double cost1_5(double weight){
        weight -= 1;
        return weight * 2;
    }

}
