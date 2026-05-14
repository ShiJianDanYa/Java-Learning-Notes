package 课堂代码.ch02_分支结构.ch03_多分支.ch02_多分支选择语句;

/**
 * ClassName: ch02_default的位置和省略
 * Package: 课堂代码.ch02分支结构.ch03多分支.ch02多分支选择语句
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/22 - 15:48
 * @Version: v1.0
 *
 */
public class ch02_default的位置和省略 {
	public static void main(String[] argss){
		/*
		1.default的位置和省略
		位置：case和default是没有标准的上下之分，位置可以任意的书写
		为了观看比较方便，提高代码的阅读性
		一般来讲，case从小到大依次书写的，default是写在最下面的
		省略：default是可以省略不写的，在此时如果所有的case都不匹配，则没有任何的输出结果
		*/

		int week = 9;
		switch(week){
			/*default:
				System.out.println("没有匹配的");
				break;*/
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;

			case 5:
				System.out.println("星期五");
				break;

			case 3:
				System.out.println("星期三");
				break;

			case 4:
				System.out.println("星期四");
				break;

			case 7:
				System.out.println("星期日");
				break;

			case 6:
				System.out.println("星期六");
				break;
		}


	}
}
