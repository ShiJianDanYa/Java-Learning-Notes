package 课堂练习.ch04_循环高级用法.ch03_循环嵌套;

/**
 * ClassName: ch03_梯形
 * Package: 课堂练习.ch04_循环高级用法.ch03_循环嵌套
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/27 - 14:05
 * @Version: v1.0
 *
 */
public class ch03_梯形 {
	/*
	 * 输出一个梯形
	 *    ***
	 *   *****
	 *  *******
	 */
	public static void main(String[] args){
		for (int i = 1; i <= 3; i++) { // 1 2 3
			// 空格 3 2 1
			for(int j=i;j<=3;j++){
				System.out.print(" ");
			}
			//  1 2 3
			//* 3 5 7
			for(int k=1;k<=(2*i+1);k++){
				System.out.print("*");
			}
			//换行
			System.out.println();
		}
	}
}
