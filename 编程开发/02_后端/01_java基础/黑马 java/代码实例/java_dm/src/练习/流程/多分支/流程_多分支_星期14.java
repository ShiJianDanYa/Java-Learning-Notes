package 练习.流程.多分支;

import java.util.Scanner;

/**
 * ClassName: 流程_多分支_星期14
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2915:13
 * @Version1.0
 */

/*
休息日
键盘输入星期数
1-5为工作日
6-7为休息日
 */
public class 流程_多分支_星期14 {
    public static void main(String[] args) {

        System.out.println("请输入星期数");
        Scanner sc = new Scanner(System.in);
        int week = 0;
        week = sc.nextInt();
        switch (week) {
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("输入错误");
        }
    }
}
