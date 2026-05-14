package 课堂练习.ch02_分支结构.ch03多分支.ch02_多分支选择语句;

/**
 * ClassName: ch03_利用switch模拟计算器
 * Package: 课堂练习.ch02分支结构.ch03多分支.ch02多分支选择语句
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/23 - 13:52
 * @Version: v1.0
 *
 */
public class ch03_利用switch模拟计算器 {
	public static void main(String[] args){
		/*练习：
		利用switch模拟计算器+-$*/

		int a = 10,b =20;
		String op = "+";
		int result = switch(op){
			case "+" -> a+b;
			case "-" -> a-b;
			case "*" -> a*b;
			case "/" -> a/b;
			default -> -99;
		};
	}
}
