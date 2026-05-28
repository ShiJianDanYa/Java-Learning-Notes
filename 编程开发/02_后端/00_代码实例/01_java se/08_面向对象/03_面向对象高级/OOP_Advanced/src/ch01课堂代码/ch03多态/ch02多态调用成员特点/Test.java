package ch01课堂代码.ch03多态.ch02多态调用成员特点;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch03多态.ch02多态调用成员特点
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 11:18
 * @Version: v1.0
 *
 */
public class Test {
	public static void main(String[] args) {
	/*变量调用：
	编译看左边，运行也看左边
	方法调用：
	编译看左边，运行看石
	*/
		//利用多态方式创建对象
		Fu f = new Zi();
		//调用成员变量:
		//编译看左边，运行也看左边
		//编译看左边 在把java文件编译成class文件的时候
		//看父类当中有没有这个变量，如果有编译成功，如果没有编译失败
		//运行也看左边：在代码真正运行的时候，使用父类中的变量
		System.out.println(f.name);
		//System.out.println(f.age);
		//成员方法
		//编译看左边，运行看右边
		//看父类当中有没有这个方法，如果有编译成功，如果没有编译失败
		//运行也看左边：在代码真正运行的时候，使用字类里面的方法
		//如果子类没有重写父类里面的方法，使用的还是父类
		f.show();
		//问题一：为什么调用fushow方法程序没有报错？
		//方法编译看左边 父类
		// 问题二：程序运行的结果是什么？
		//方法运行看右边 子类
		f.Fushow();
		//问题：为什么调用ziShow方法程序报错？
		//因为 父类没有是字类独有的方法
		//弊端：他不能调用子类的特有方法
		Zi z = (Zi)f;
		z.Zishow();
		//注意点：
		//爷爷  爸爸  儿子
		//创建了爸爸的象，赋值给了爷爷类型
		//在进行强制类型转换的时候，只能转到爸爸类型，不能转成儿子类型
		Ye y = new Fu();
		//instanceof关键字
		// 语法：对象 instanceof 类名
		// 判断 对象 是否为 类名 的 父类类型
		if(y instanceof Fu){
			Fu ff = (Fu)y;
			ff.Fushow();
			ff.show();
		}else{
			System.out.println("y不是Zi类型");
		}
	}
}
