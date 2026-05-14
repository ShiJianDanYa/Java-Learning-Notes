package 课堂练习.ch02_分支结构.ch03多分支.ch01_多分支判断语句;

import java.util.Scanner;

/**
 * ClassName: ch07判断三角形
 * Package: 课堂练习.ch02分支结构.ch03多分支
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/21 - 20:43
 * @Version: v1.0
 *
 */
public class ch07_判断三角形 {
	public static void main(String[] args){
		/*
		键盘录入任意三个大于0的小数，判断这三个数值构成什么类型的三角形？
		需要判断的类型如下：
		等边、等腰、直角、普通、无效
		三角形的构成条件：任意两边之和大于第三边

		细节一
		现实的生活经验，有可能跟代码是相反的，我们要梳理好其中的逻辑
		细节二
		if的第三种格式下，存在多个判断的范围如果有重叠
		等边<等腰 等边一定是等腰，但是等腰不一定是等边
		A范围<B范围
		记得：小范围写在上面，大范围写在下面
		*/

		//键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个小数：");
		System.out.println("请输入第一个小数");
		double a = sc.nextDouble();
		System.out.println("请输入第二个小数");
		double b = sc.nextDouble();
		System.out.println("请输入第三个小数");
		double c = sc.nextDouble();
		//判断输入
		if(a>0 && b>0 && c>0){
		//判断是否可以构成三角形  任意 是 且
			if(a+b>c && a+c>b && b+c>a){
				//判断是什么三角形
				//等边 三边相等
				if(a==b && b==c) System.out.println("等边三角形");
				//等腰 有两边相等
				else if(a==b || b==c || a==c) System.out.println("等腰三角形");
				//直角 三角形的两边的平方之和等于第三边平方
				else if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a) System.out.println("直角三角形");
				//普通 三角形的两边之和大于第三边
				else System.out.println("普通三角形");
			}else System.out.println("输入的能构成三角形?");
		}else System.out.println("输入的什么玩意");

		//结束进程
		sc.close();
	}
}
