package ch12运算符.课堂代码.ch07三元运算符;

/**
 * ClassName: 三元运算符
 * Package: ch12运算符.课堂代码.ch07三元运算符
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/19 - 14:52
 * @Version: v1.0
 *
 */
public class 三元运算符 {
	static void main(String[] args) {
		//需求:使用三元三元运算符.获取两个数中的最大值

		//分析
		//1.定义两个变量记录整数
		int number1 = 10;
		int number2 = 20;

		//2.使用三元运算符获取两个数中的最大值
		//格式: 关系表达式?表达式1:表达式2;
		//整个三元运算符的结果必须要被使用
		int max = number1>number2?number1:number2;
		System.out.println(max);
	}
}
