package 课堂练习.ch02_分支结构.ch02_双分支;

import java.util.Scanner;
/**
 * ClassName: ch01吃饭
 * Package: 课堂练习.ch02分支结构.ch02双分支
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/20 - 20:50
 * @Version: v1.0
 *
 */
public class ch01_吃饭 {
	static void main(String[] args) {
		//键盘录入一个整数，表示身上的钱。
		//如果大于等于100块，就是网红餐厅。
		//否则，就吃经济实惠的沙县小吃。

		//分析:
		//1.键盘录入一个整数，表示身上的钱.
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入钱数：");
		int money = sc.nextInt();
		//2.开始判断(二选一)
		if(money>=100){
			System.out.println("网红餐厅");
		}else{
			System.out.println("沙县小吃");
		}

	}
}
