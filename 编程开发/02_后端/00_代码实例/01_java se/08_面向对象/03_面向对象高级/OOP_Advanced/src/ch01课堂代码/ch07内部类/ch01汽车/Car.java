package ch01课堂代码.ch07内部类.ch01汽车;

/**
 * ClassName: Car
 * Package: ch01课堂代码.ch07内部类.ch01汽车
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 16:55
 * @Version: v1.0
 *
 */
public class Car {
	/*
	需求：写一个Javabean类描述汽车
	属性：汽车的品牌，车龄，颜色，发动机的品牌，使用年限

	内部类的意义：
	内部类表示的事物是外部类的一部分
	内部类单独存在没有任何意义
	*/
	String CarName;  //汽车品牌
	int carAge;      //车龄
	int carColor;    //颜色
	class Engine{
		String engineName;  //发动机品牌
		int engineAge;      //发动机使用年限
	}
}
