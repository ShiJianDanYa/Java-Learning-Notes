package 课堂练习.ch03_循环结构.ch02_while循环;

/**
 * ClassName: ch01_复利计算器
 * Package: 课堂练习.ch03_循环结构.ch02_while循环
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/24 - 22:47
 * @Version: v1.0
 *
 */
public class ch01_复利计算器 {
	public static void main(String[] args){
		/*
		假设你在银行投资了100000元，银给出的复利是1.7%，
		问多少年后能实现本金翻倍？
		请问：什么循环呢？代码如何实现？

		for:范围 次数
		while：结束条件

		单利：
		利息不计入本金
		复利：前一年利息计入本金，下一年继续算利息
		*/

		//1.定义变量
		double money = 100000;
		double year = 0;
		while (money<=200000){
			money*=1.017;
			year++;
		}
		//输出结果
		System.out.println("需要"+year+"年,才能实现,本金翻倍");
	}
}
