package 课堂练习.ch03_循环结构.ch01_for循环;

/**
 * ClassName: ch06_数字规律
 * Package: 课堂练习.ch03_循环结构.ch01_for循环
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/24 - 16:43
 * @Version: v1.0
 *
 */
public class ch05_数字规律 {
	public static void main(String[] args){
		/*
		有一组特殊的数字，从第三项开始，
		每一项都是前两项的数字和，请问第10项的数字是多少？
		0，1，1，2，3，5，8，13，21，34，55，89...
		*/
		int a=0,b=1,c=0,i=3;
		/*
		3.利用循环不断获取这些特殊数字每一项的值
		开始条件：3
		结束条件：10
		循环体：1求c的值 2不断的修改a和b记录的值
		*/
		for(;i<=10;i++){
			//求c的值  前一组最后一项的值
			c=a+b;
			//不断的修改a和b记录的值 下一组的两个值
			a=b;
			b=c;
		}
		//输出结果
		//自增比判断多一次
		System.out.println("第"+(i-1)+"项的值为"+c);
	}
}
