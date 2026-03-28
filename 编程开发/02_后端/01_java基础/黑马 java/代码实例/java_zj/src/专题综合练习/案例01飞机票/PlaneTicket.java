package 专题综合练习.案例01飞机票;

import java.util.Scanner;

/**
 * ClassName: PlaneTicket
 * Package: 专题综合练习.案例01飞机票
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/122:17
 * @Version1.0
 */

/*
要求
机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
按照如下规则计算机票价格:
旺季(5-10月)头等舱9折,经济舱8.5折,
淡季(11月到来年4月)头等舱7折，经济舱6.5折。

 */
public class PlaneTicket {
    public static void main(String[] args) {
        //键盘输入机票价格、月份、头等舱或经济舱
        System.out.println("请输入机票价格：");
        int price = new Scanner(System.in).nextInt();
        System.out.println("请输入月份：");
        int month = new Scanner(System.in).nextInt();
        System.out.println("请输入头等舱或经济舱：");
        String type = new Scanner(System.in).next();
        //调用方法 输出机票价格
        System.out.println("机票价格：" + getPrice(price, month, type));
    }

    public static double getPrice(int price, int month, String type) {
        if (month >= 1 && month <= 12) {
            if (month >= 5 && month <= 10) {
                return highSeason(price, type, 0.9, 0.85);

            } else if (month >= 11 || month <= 4) {
                return highSeason(price, type, 0.7, 0.65);
            }
        } else {
            System.out.println("月份输入错误");
            return 0;
        }
        return 0;
    }
    //ctrl + alt + M 自动抽取方法

    public static int highSeason (int price,String type,double discount1,double discount2){
        if (type.equals("头等舱")) {
            int price1 = (int) (price * discount1);
            return price1;
        } else if (type.equals("经济舱")) {
            int price2 = (int) (price * discount2);
            return price2;
        } else {
            System.out.println("头等舱或经济舱输入错误");
            return 0;
        }
    }
}

