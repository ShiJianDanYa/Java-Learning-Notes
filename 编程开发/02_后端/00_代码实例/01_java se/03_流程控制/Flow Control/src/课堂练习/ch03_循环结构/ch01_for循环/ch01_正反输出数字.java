package 课堂练习.ch03_循环结构.ch01_for循环;

/**
 * ClassName: ch02_正反输出数字
 * Package: 课堂练习.ch03_循环结构.ch01_for循环
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/23 - 19:37
 * @Version: v1.0
 *
 */
public class ch01_正反输出数字 {
	public static void main(String[] args){
		/*需求：在实际开发中，如果要获取一个范围中的每一个数据时，就会用到循环。
		要求1：打印1-5
		要求2：打印5-1

		每次解决问题,问自己三个问题
		循环的开始条件：
		循环的结束条件：
		重复执行的代码：

		*/
		//需求1：打印1-5
		for(int i=1;i<=5;i++){
			System.out.print(i);
		}
		System.out.println();
		//需求2：打印5-1
		for(int i=5;i>=1;i--){
			System.out.print(i);
		}
		System.out.println();
	}
}
