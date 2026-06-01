package ch01课堂代码.ch01随机小数;

//导包 定位位置
import java.util.Random;

/**
 * ClassName: RandomDouble
 * Package: ch01课堂代码.ch01随机小数
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/1 - 08:35
 * @Version: v1.0
 *
 */
public class ch01RandomDouble {
	//扩展：在什么情况下，我不需要导包？
	//情况一：如果使用本包中的类
	//情况二：如果使用java.1ang（核心）包下的类
	//其他所有情况下，都需要导包
	public static void main(String[] args){
		//需求：查询API帮助文档，使用Random类中获取随机小数的方法

		//创建对象
		Random r = new Random();
		//调用方法获取随机小数[0.0~0.1)
		//0.0 ~ 0.9999999999999999999999999...
		double v = r.nextDouble();
		System.out.println(v);
		System.out.println("===================");

		//[0.0~范围) JDK17才有的
		double v1 = r.nextDouble(1.9);
		System.out.println(v1);
		System.out.println("===================");

		//[开始~结束）JDK17才有的
		double v2  = r.nextDouble(1.2, 1.9);
		System.out.println(v2);
	}
}
