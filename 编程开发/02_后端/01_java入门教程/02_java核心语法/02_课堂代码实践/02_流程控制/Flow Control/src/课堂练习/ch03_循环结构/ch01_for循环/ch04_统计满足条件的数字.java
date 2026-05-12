package 课堂练习.ch03_循环结构.ch01_for循环;

//导包

import java.util.Scanner;

/**
 * ClassName: ch05_判断满足条件的数字
 * Package: 课堂练习.ch03_循环结构.ch01_for循环
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/23 - 20:25
 * @Version: v1.0
 *
 */
public class ch04_统计满足条件的数字 {
	public static void main(String[] args){
		/*键盘录入两个数字，表示一个范围。统计这个范围中。
		既能被3整除，又能被5整除数字有多少个？

		累加思想：
		数字--->5um
		统计思想：
		count--->满足条件++
		*/
		//先接受键盘输入的两个数字
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int start = sc.nextInt();
		System.out.println("请输入第二个数字");
		int end = sc.nextInt();
		//定义变量记录满足条件的数字的个数
		int count = 0;
		//判断数字大小关系
		/*if(start > end) {
			//开始判断
			for (int i = end; i <= start; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					count++;
				}
			}
		}else if(start < end){
			//开始判断
			for(int i = start; i <= end; i++){
				if(i % 3 == 0 && i % 5 == 0){
					count++;
				}
			}
		}else{
			System.out.println("输入的什么玩意?");
		}*/
		//判断数字大小
		int max = start > end ? start : end;
		int min = start < end ? start : end;
		//开始判断
		for(int i = min; i <= max; i++){
			if(i % 3 == 0 && i % 5 == 0){
				count++;
			}
		}
		//输出结果
		if(count==0){
			System.out.println("没有满足条件的数字");
		}else{
			System.out.println("在"+ min + "到" + max +"之间 满足条件的数字的个数是：" + count);
		}

	}
}
