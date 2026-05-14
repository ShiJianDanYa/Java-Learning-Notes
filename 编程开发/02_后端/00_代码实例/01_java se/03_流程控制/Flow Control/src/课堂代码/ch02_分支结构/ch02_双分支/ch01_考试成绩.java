package 课堂代码.ch02_分支结构.ch02_双分支;

//导包
import java.util.Scanner;
/**
 * ClassName: ch01_考试成绩
 * Package: 课堂代码.ch02_分支结构.ch02_双分支
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/24 - 23:26
 * @Version: v1.0
 *
 */
public class ch01_考试成绩 {
	public static void main(String[] args){
		/*
		键盘录入一个学生的成绩，如果成绩>=60，则通过，否则，不通过
		*/

		Scanner sc = new Scanner(System.in);
		System.out.println("请输出成绩");
		int score = sc.nextInt();
		//判断成绩是否合理
		if(score<0||score>100){
			System.out.println("成绩不合理");
		}else {
			if (score >= 60) {
				System.out.println("通过");
			} else {
				System.out.println("未通过");
			}
		}
	}
}
