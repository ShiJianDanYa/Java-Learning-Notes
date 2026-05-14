package 课堂练习.ch04_循环高级用法.ch03_循环嵌套;

/**
 * ClassName: ch04_菱形
 * Package: 课堂练习.ch04_循环高级用法.ch03_循环嵌套
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/27 - 14:23
 * @Version: v1.0
 *
 */
public class ch04_菱形 {
	public static void main(String[] args){
		/*
		*    *
		*   ***
		*  *****
		* *******
		*  *****
		*   ***
		*    *
		* */
		//三部分  上三角   下三角(小)
		for (int i = 1; i <=4; i++) {   // 1 2 3 4
			//空格  3 2 1 0
			for(int j =i;j<=3;j++){
				System.out.print(" ");
			}
			//大 三角形   1 3 5 7
			for(int k=1;k<=(2*i-1);k++){
				System.out.print("*");
			}
			//换行
			System.out.println();
		}
		//三角形(小)
		for (int i = 1; i <= 3; i++) {  //1 2 3
			//空格 1 2 3
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			//          1  2  3
			//小三角形   5  3  1
			for(int k=1;k<=7-2*i;k++){
				System.out.print("*");
			}
			//换行
			System.out.println();
		}
	}
}
