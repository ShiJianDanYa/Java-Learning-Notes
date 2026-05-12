package 课堂练习.ch03_循环结构.ch01_for循环;

/**
 * ClassName: ch03_求和
 * Package: 课堂练习.ch03_循环结构.ch01_for循环
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/23 - 19:47
 * @Version: v1.0
 *
 */
public class ch02_求和 {
	public static void main(String[] args){
		/*
		需求：
		在实际开发中，如果要获取一个范围中的每一个数据时，也会用到循环。
		要求：求1-5之间的和
		*/
		//定义变量保存和

		/*
		* 第一次循环 i = 1 sum = 0+1=1 ++i i=2
		* 第二次循环 i = 2 sum = 1+2=3 ++i i=3
		* 第三次循环 i = 3 sum = 3+3=6 ++i i=4
		* 第四次循环 i = 4 sum = 6+4=10 ++i i=5
		* 第五次循环 i = 5 sum = 10+5=15 ++i i+6
		* 第六次循环 i = 6 6<=5 不成立结束
		* 进行了五次循环 六次判断*/
		int sum = 0;
		for(int i =1;i<=5;i++){
			sum +=i;
		}

		System.out.println("所求的和为:"+sum);
	}
}
