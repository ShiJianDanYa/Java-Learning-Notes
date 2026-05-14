package 课堂练习.ch04_循环高级用法.ch03_循环嵌套;

/**
 * ClassName: ch05_空心菱形
 * Package: 课堂练习.ch04_循环高级用法.ch03_循环嵌套
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/27 - 15:54
 * @Version: v1.0
 *
 */
public class ch05_空心菱形 {
	public static void main(String[] args){
		/* 打印空心菱形
		*    *
		*   * *
		*  *   *
		*   * *
		*    *
		*
		* */
		//3 层
		for (int i = 1; i <= 3; i++) { //1 2 3
			//空格 3 2 1
			for(int j=1;j<=4-i;j++){
				System.out.print(" ");
			}
			//星号 *
				System.out.print("*");
			//通过判断输出星号 条件是大于i>1
			if(i>1){
				//i  2 3
				for(int k=1;k<=2 * i - 3;k++){ //1  3
					System.out.print(" ");
				}
				//后面添加空格
				System.out.print("*");
			}
			//换行
			System.out.println();
		}
		//下三角形
		for (int i = 2; i <= 3; i++) {
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			//星号
			System.out.print("*");
			if (i==2){
				//空格
				System.out.print(" ");
				System.out.print("*");
			}
			//换行
			System.out.println();
		}
	}
}
