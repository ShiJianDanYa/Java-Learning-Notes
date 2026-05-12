package 课堂练习.ch04_循环高级用法.ch03_循环嵌套;

/**
 * ClassName: ch02_平行四边形_简单解法
 * Package: 课堂练习.ch04_循环高级用法.ch03_循环嵌套
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/26 - 22:17
 * @Version: v1.0
 *
 */
public class ch02_平行四边形_简单解法 {
	public static void main(String[] args){

		for (int i=1 ; i<=3; i++) { // 1 2 3
			//先打印第一部分 红色 2 1
			for (int j = i; j <= 2; j++) {  // 2 1 0
				System.out.print(" ");
			}
			//打印第二部分 绿色   1 2 3
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			//打印蓝色部分
			for(int m=1;m<=3;m++){// 3 3 3
				System.out.print("*");
			}
			//打印天青色
			for(int q =i;q<=2;q++) {//  2 1 0
				System.out.print("*");
			}

			System.out.println();
		}
		

	}
}
