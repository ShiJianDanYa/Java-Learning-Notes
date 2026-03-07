package 练习.方法;

import java.util.Scanner;

/**
 * ClassName: compare03
 * Package: 练习.方法
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/111:53
 * @Version1.0
 */

/*
定义一个方法，
比较两个长方形的面积
 */
public class compare03 {
    public static void main(String[] args) {

        int length1 = 0,width1 = 0;
        System.out.println("请输入第一个长方形的长：");
        Scanner sc = new Scanner(System.in);
        length1 = sc.nextInt();
        System.out.println("请输入第一个长方形的宽：");
        width1 = sc.nextInt();
        int area = compare(length1,width1);
        System.out.println("第2个长方形的长");
        int length2 = sc.nextInt();
        System.out.println("第2个长方形的宽");
        int width2 = sc.nextInt();
        int area2 = compare(length2,width2);

        size(area,area2);

        System.out.println("程序结束");
    }

    //求面积代码
    public static int compare(int length1,int width1){
        int area1 = length1 * width1;
        return area1;
    }
    //比较两个长方形的面积代码
    /*
    方法三问
    1.需要干什么
    2.需要怎么干
    3.是否需要返回值
     */
    public static void size(int area,int area2)
    {
        if(area > area2){
            System.out.println("第一个是面积是：" + area);
            System.out.println("第二个是面积是：" + area2);
            System.out.println("第一个长方形面积更大");

        }else{
            System.out.println("第二个长方形面积更大");
            System.out.println("第一个是面积是：" + area);
            System.out.println("第二个是面积是：" + area2);

        }
    }
}
