package 课堂练习.ch02_分支结构.ch02_双分支;

import java.util.Scanner;
/**
 * ClassName: ch03影院选座
 * Package: 课堂练习.ch02分支结构.ch02双分支
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/21 - 13:38
 * @Version: v1.0
 *
 */
public class ch03_影院选座 {
	/*
	在实际开发中，电影院选座也会使用到if判断，
	假设某影院售卖了100张票，票的序号为1~100。
	其中奇数票号坐左侧，偶数票号坐右侧。
	键盘录入一个整数表示电影票的票号
	根据不同情况，给出不同的提示：
	如果票号为奇数，那么打印坐左边如果票号为偶数，那么打印坐右边
	*/
	public static void main(String[] args){
		//接受键盘输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入电影票的票号");
		//定义变量接受票号
		int ticket = sc.nextInt();
		//判断票号范围
		//boolean flag = true;
		while(true){
			if(ticket<1||ticket>100){
				System.out.println("请输入正确的票号,范围为序号为1~100");
				ticket = sc.nextInt();
			}else{
				break;
			}
		}
		//开始判断
		if(ticket%2==1){
			System.out.println("您选择的座位在左侧");
		}else {
			System.out.println("您选择的座位在右侧");
		}
		//释放资源
		sc.close();

	}
}
