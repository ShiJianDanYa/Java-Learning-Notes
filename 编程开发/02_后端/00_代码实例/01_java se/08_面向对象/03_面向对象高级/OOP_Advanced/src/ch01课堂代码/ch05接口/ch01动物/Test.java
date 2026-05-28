package ch01课堂代码.ch05接口.ch01动物;

import ch01课堂代码.ch05接口.ch02接口中成员特点.Inter;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch05接口.ch01动物
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 06:30
 * @Version: v1.0
 *
 */
public class Test {
	public static void main(String[] args) {
		//创建对象
		//青蛙
		Forg f = new Forg("呱呱","绿色");
		System.out.println("姓名"+f.getName()+"颜色"+f.getColor());
		f.eat();
		f.swim();
		//兔子
		Rabbit r = new Rabbit("小兔子","白色");
		System.out.println("姓名"+r.getName()+"颜色"+r.getColor());
		r.eat();
	}
}
