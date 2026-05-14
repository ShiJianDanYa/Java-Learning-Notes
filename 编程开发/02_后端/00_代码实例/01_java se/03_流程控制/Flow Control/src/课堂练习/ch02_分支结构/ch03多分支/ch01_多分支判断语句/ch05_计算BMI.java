package 课堂练习.ch02_分支结构.ch03多分支.ch01_多分支判断语句;

import java.util.Scanner;
/**
 * ClassName: ch05计算BMI
 * Package: 课堂练习.ch02分支结构.ch03多分支
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/21 - 20:00
 * @Version: v1.0
 *
 */
public class ch05_计算BMI {
	public static void main(String[] args) {
		/*键盘录入你的身高和体重，计算BMI
		BMI身体质量指数计算公式：BMI=体重·身高2(体重单位：kg，身高单位：米)
		BMI数值(kg/m²) 身体状态   健康风险
		<18.5           消瘦      部分增加
		18.5-23.9       正常      正常
		24.0-26.9       偏胖      增加
		27.0-29.9       肥胖      中度增加
		≥30             严重肥胖  严重增加
		*/
		Scanner ssc = new Scanner(System.in);
		System.out.println("请输入体重单位千克");
		double weight = ssc.nextDouble();
		System.out.println("请输入身高单位米");
		double height = ssc.nextDouble();
		//开始判断
		if (weight > 0 && height > 0) {
			//计算BMI
			double bmi = weight / (height * height);
			System.out.println("BMI=" + bmi);

			if (bmi >= 30) System.out.println("身体状态:严重肥胖,健康风险:严重增加");
			else if (bmi >= 27) System.out.println("身体状态:肥胖,健康风险:中度增加");
			else if (bmi >= 24) System.out.println("身体状态:偏胖,健康风险:增加");
			else if (bmi >= 18.5) System.out.println("身体状态:正常,健康风险:正常");
			else System.out.println("身体状态:消瘦,健康风险:部分增加");
		}else{
		System.out.println("输入数据有误");
	}
		ssc.close();
	}
}
