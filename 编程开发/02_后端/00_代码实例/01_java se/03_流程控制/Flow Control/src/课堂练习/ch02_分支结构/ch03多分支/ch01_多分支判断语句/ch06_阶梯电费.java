package 课堂练习.ch02_分支结构.ch03多分支.ch01_多分支判断语句;

import java.util.Scanner;

/**
 * ClassName: ch06阶梯电费
 * Package: 课堂练习.ch02分支结构.ch03多分支
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/21 - 20:19
 * @Version: v1.0
 *
 */
public class ch06_阶梯电费 {
	public static void main(String[] args) {
		/*
		用电量计算采取阶梯计费原则，规则如下：
		1.[0~100]度，按0.5元/度计费
		2.(100~200]度，按0.8元/度计费
		3.(超过200度]，按1.2元/度计费
		输入变量usage表示实际用电量，
		输出总电费cost。
		示例输入：usage=150100
		示例输出：cost=100*0.5+50*0.8=90
		*/
		//定义变量,用量
		int usage ;
		//定义变量,电费
		double cost ;
		//用户输出用量
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用电量");
		usage = sc.nextInt();
		//判断输入
		if(usage>0){
		//阶梯计费
		if(usage>200) cost=100*0.5+100*0.8+(usage-200)*1.2;
		else if(usage>100) cost=100*0.5+(usage-100)*0.8;
		else cost=usage*0.5;
		System.out.println("电费为："+cost);
		} else System.out.println("输入有误");
	//关闭输入
	sc.close();
	}
}
