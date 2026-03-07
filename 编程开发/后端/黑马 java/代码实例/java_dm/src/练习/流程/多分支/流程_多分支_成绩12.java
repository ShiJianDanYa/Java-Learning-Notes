package 练习.流程.多分支;

import java.util.Scanner;

/**
 * ClassName: 流程_多分支_成绩12
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2913:43
 * @Version1.0
 */

/*
 成绩判断
 1. 小于100大于95 自行车
 2. 小于95大于80 游乐场
 3. 小于80大于60 变形金刚
 4. 小于60 七匹狼
 */

public class 流程_多分支_成绩12 {
    public static void main(String[] args) {
        int score = 0;
        System.out.println("请输入成绩");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();
        // 判断成绩是否合法
        if (score < 100 && score > 0)
        {
            if (score <= 100 && score >= 95) {
                System.out.println("自行车");
            } else if (score < 95 && score >= 80) {
                System.out.println("游乐场");
            } else if (score < 80 && score >= 60) {
                System.out.println("变形金刚");
            } else {
                System.out.println("七匹狼");
            }
    }else{
            System.out.println("输入的什么玩意");
        }
        }
}
