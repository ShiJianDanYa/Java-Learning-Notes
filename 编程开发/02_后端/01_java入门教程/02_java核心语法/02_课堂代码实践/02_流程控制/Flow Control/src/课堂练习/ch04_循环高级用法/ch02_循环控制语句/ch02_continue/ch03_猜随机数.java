package 课堂练习.ch04_循环高级用法.ch02_循环控制语句.ch02_continue;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: ch03_猜随机数
 * Package: 课堂练习.ch04_循环高级用法.ch02_循环控制语句.ch02_continue
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/26 - 15:52
 * @Version: v1.0
 *
 */
public class ch03_猜随机数 {
	public static void main(String[] args){
		/*生成一个1~100之间的随机数，
		利用键盘录入模拟猜的动作，一直猜，直到猜中为止

		抽卡的时候，有保底机制
		小保底：只要三次没有猜中，提示用户猜测的范围±5
		大保底：只要10次没有猜中，猜中了
		*/
		//先生成随机数
		// 第一种写法：intnIr.nextInt()； 默认是在int的取值范围之内获取随机数
		// 第二种写法：小括号写一个数字n，表示随机的最大值，但是不包含这个数字θ~n-1 jdk1.2
		// 第三种写法：小括号写两个数字ab，表示随机的取值范围是a~b，包含a，不包含b jdk17
		Random r = new Random();
		int number = r.nextInt(1,101);
		System.out.println("随机数："+number);
		//创建变量保存键盘录入的数字
		int n;
		//创建键盘录入
		Scanner sc = new Scanner(System.in);
		//创建计数变量
		int count = 0;
		do {
			System.out.println("请输入数字：");
			n = sc.nextInt();
			count++;
			//大保底  第十次而且第十次没有猜中
			//位置如果怎判断 下面 就会
			// 先提示大小  在 显示大保底触发
			if(count == 10 && n != number) {
				System.out.println("大保底触发");
				n = number;
			}
			if(n > number){
				System.out.println("猜大了");
			}else if(n < number){
				System.out.println("猜小了");
			}else{
				System.out.println("恭喜你猜对了");
			}
			//小保底
			if(count%3==0) System.out.println("小保底触发 范围"+(number-5)+"~"+(number+5));

		} while (n != number);

		System.out.println("游戏结束");

	}
}
