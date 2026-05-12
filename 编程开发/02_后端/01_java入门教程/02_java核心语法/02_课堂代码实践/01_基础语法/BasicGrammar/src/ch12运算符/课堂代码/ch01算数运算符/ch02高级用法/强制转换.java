package ch12运算符.课堂代码.ch01算数运算符.ch02高级用法;

/**
 * ClassName: 强制转换
 * Package: ch12运算符.课堂代码.ch01算数运算符.ch02高级用法
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/18 - 16:27
 * @Version: v1.0
 *
 */
public class 强制转换 {
	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		//现在我们要强转的是谁？
		//b1+b2计算之后的结果。
		//(byte)b1+b2强转的是b1，并不是最终的结果
		//b1+b2结果不应该是byte类型吗 不对
		//byte short char 三种类型 会>自动转化为int在进行计算 所以 结果是int类型
		byte result = (byte) (b1 + b2);
		System.out.println(result);//30
	}
}
