package 练习.方法;

import java.util.Scanner;

/**
 * ClassName: AreaOfCircle02
 * Package: 练习.方法
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/110:53
 * @Version1.0
 */

/*
定义一个方法，求圆面积，调用方法，输出结果。
 */
public class AreaOfCircle02 {
    public static void main(String[] args) {
        int r = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        r = sc.nextInt();
        //调运方法
        System.out.println("圆的面积为：" + areaOfCircle(r));

        System.out.println("程序结束");
    }
    public static double areaOfCircle(double r){
        double area = 3.14 * r * r;
        return area;
    }
}
