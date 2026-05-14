package ch12运算符.课堂练习.ch02自增自减运算符;

/**
 * ClassName: 课堂练习
 * Package: ch12运算符.课堂练习.ch02自增自减运算符
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/18 - 17:03
 * @Version: v1.0
 *
 */
public class 课堂练习 {
	static void main(String[] args) {
		int x =10;
		//后++：先用后加
		//先把x变量中的值拿出来用，赋值给y，然后再进行自增。
		//赋值给y的值是自增前的。
		int y = x++;   //x=11  y=10
		// 先++：先加后用
		//先把x进行自增，然后把自增后的结果赋值给左边的变量
		// 先把x自增，变成12，然后再把自增之后的12赋值给z
		int z = ++x; // x = 12 z =12
		System.out.println("x:"+ x);//12
		System.out.println("y:"+ y);//10
		System.out.println("z:"+z);//12
	}
}
