package ch01课堂代码.ch03_字符串成员方法.ch03截取;

/**
 * ClassName: intercepting
 * Package: ch01课堂代码.ch03字符串成员方法.ch03截取
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/2 - 07:41
 * @Version: v1.0
 *
 */
public class intercepting {
	/*public String substring(int beginIndex, int endIndex):         截取指定范围
	  public String substring(int beginIndex):                       截取到末尾

	需求：只保留用户名的第一个字符，后面用三个***替代*/
	static void main(String[] args) {

		//定义字符串
		String stu = "欧洲不安,中美冷战性质已变";
		//截取
		//第一个参数：截取的开始索引
		//第二个参数：截取的末尾索引
		//包头不包尾，包左不包右---->包含0索引，但是不包含9索引
		//字符串本身一旦创建之后，是无法发现改变的，
		// 截取的时候不会影响调用者的字符串，
		// 切记：只有返回值才是截取之后的结果
		String sub = stu.substring(0, 9);
		System.out.println(sub);
		//参数：截取的开始索引，默认是截取到字符串的末尾
		//字符串本身一旦创建之后，是无法发现改变的，
		// 截取的时候不会影响调用者的字符串，
		// 切记：只有返回值才是截取之后的结果
		String sub1 = stu.substring(5);
		System.out.println(sub1);


		//练习：
		//只保留用户名的第一个字符，后面用三个***替代
		String name = "jianlun";
		//charAt(0)
		char sub2 = name.charAt(0);
		String sub3 = sub2+"***";
		System.out.println(sub3);
		//substring(0,1)
		String sub4 = name.substring(0,1);
		sub4+="***";
		System.out.println(sub4);
	}
}
