package 课堂代码.ch02_分支结构.ch03_多分支.ch02_多分支选择语句;

/**
 * ClassName: 注意事项
 * Package: 课堂代码.ch02分支结构.ch03多分支.ch02多分支选择语句
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/22 - 15:23
 * @Version: v1.0
 *
 */
public class ch01_注意事项 {
	public static void main(String[] args){
		/*
		switch的注意点：
		1.表达式：结果（字符/整数byte short int/枚举/字符串）
		2.case：被匹配的值，只能是真实的数据
		3.case：值不允许重复
		4.break：表示中断，结束的意思，结束switch语句
		5.default：所有情况都不匹配，执行该处的内容
		*/

		int number = 10;
//		int a=1,b=2,c=3;
		switch(number){
			case 1:
				System.out.println("星期一");
				break;

			case 2:
				System.out.println("星期二");
				break;

			case 3:
				System.out.println("星期三");
				break;

			default:
				System.out.println("输入的数字有误");
				break;
		}
	}
}
