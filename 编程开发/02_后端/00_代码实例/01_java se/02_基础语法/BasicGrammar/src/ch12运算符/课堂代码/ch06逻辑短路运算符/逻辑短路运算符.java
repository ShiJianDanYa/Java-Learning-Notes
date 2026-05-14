package ch12运算符.课堂代码.ch06逻辑短路运算符;

/**
 * ClassName: 逻辑短路运算符
 * Package: ch12运算符.课堂代码.ch06逻辑短路运算符
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/18 - 20:43
 * @Version: v1.0
 *
 */
public class 逻辑短路运算符 {
	static void main(String[] args) {
		//1. &&
		//运行结果跟单个&是一样的
		// 表示两边都为真，结果才是真
		System.out.println(true && true);//true
		System.out.println(false && false);//false
		System.out.println(false && true);//false
		System.out.println(true && false);//false
		//2.||
		//运行结果跟单个|是一样的
		//表示两边都为假，结果才是假
		System.out.println(true || true);// true
		System.out.println(false || false);//false
		System.out.println(false || true);//true
		System.out.println(true || false);//true
		//3.短路逻辑运算符具有短路效果
		//简单理解：当左边的表达式能确定最终的结果，那么右边就不会参与运行了
		int a =10;
		int b =10;
		boolean result = ++a < 5 && ++b< 5;
		System.out.println(result);//false
		System.out.println(a);//11
		System.out.println(b);//10
	}
}
