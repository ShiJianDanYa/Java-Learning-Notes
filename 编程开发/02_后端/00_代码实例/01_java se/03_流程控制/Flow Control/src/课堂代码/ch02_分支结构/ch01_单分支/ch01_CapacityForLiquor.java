package 课堂代码.ch02_分支结构.ch01_单分支;

import java.util.Scanner;

/**
 * ClassName: CapacityForLiquor
 * Package: 课堂代码.ch02分支结构.ch01单分支
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/20 - 19:49
 * @Version: v1.0
 *
 */
public class ch01_CapacityForLiquor {
	static void main(String[] args) {
	//需求：键盘录入女婿酒量，如果大于2斤，老丈人给出回应，反之不回应
	//if格式
	// if(关系表达式){//语句体；
	// }

    //分析：
	//1.键盘录入女婿的酒量
	Scanner sc =new Scanner(System.in);
	System.out.println("请输入酒量：");
	int wine = sc.nextInt();
	//2.对酒量进行判断
	if(wine>2){
		System.out.println("小伙子,不错啊");
	}

	}
}
