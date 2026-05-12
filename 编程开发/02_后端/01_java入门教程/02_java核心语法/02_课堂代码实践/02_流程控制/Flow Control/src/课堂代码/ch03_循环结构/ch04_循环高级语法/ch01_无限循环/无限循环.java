package 课堂代码.ch03_循环结构.ch04_循环高级语法.ch01_无限循环;

/**
 * ClassName: 无限循环
 * Package: 课堂代码.ch03_循环结构.ch04_循环高级语法.ch01_无限循环
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/25 - 15:20
 * @Version: v1.0
 *
 */
public class 无限循环 {
	public static void main(String[] args){
		/*无限循环
		* 注意：在无限循环的下面，不能写任何其他代码
		* */

		//for
		/*for(;;){
			System.out.println("永远不会终止");
		}*/

		//while
		/*while(true){
			System.out.println("永远不会终止");
		}*/
		//do...while
		do{
			System.out.println("永远不会终止");
		}while(true);
		//System.out.println("程序结束");
	}
}
