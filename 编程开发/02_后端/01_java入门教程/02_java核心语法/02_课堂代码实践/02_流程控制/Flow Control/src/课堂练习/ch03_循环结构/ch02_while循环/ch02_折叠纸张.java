package 课堂练习.ch03_循环结构.ch02_while循环;

/**
 * ClassName: ch02_折叠纸张
 * Package: 课堂练习.ch03_循环结构.ch02_while循环
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/25 - 12:44
 * @Version: v1.0
 *
 */
public class ch02_折叠纸张 {
	public static void main(String[] args){
		/*需求：世界最高山峰珠穆朗玛峰高度是：8848.86米=8848860毫米，
		假如我有一张足够大的纸，它的厚度是0.1毫米。
		请问：该纸张折叠多少次，可以折成珠穆朗玛峰的度？


		分析：
		1.纸张折叠：i*2
		2.while条件判断语句 i<88488600
		*/
		//定义变量记录折叠次数
		int count = 0;
		//开始判断
		//变量i初始值为1,代表纸张厚度
		int i = 1;
		while(i<=88488600){
			i*=2;
			count++;
		}
		//输出结果
		System.out.println("折叠"+count+"次，可以折叠成珠穆朗玛峰的度");
	}
}
